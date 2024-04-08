package com.mycompany.dao;

import com.mycompany.Conexion.Conexion;

import com.mycompany.modelo.Salida;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SalidaDAO {

    private Connection db;

    public SalidaDAO() {
        db = Conexion.GetConnection();

    }

    public ArrayList<Salida> GetAll() {
        ArrayList<Salida> salir = new ArrayList();

        try {
            Statement stm = db.createStatement();
            String sql = "SELECT e.Factura, e.Fecha, e.Cantidad,e.TelefonoC, a.Nombre AS NombreArticulo "
                    + "FROM Salida e "
                    + "JOIN Articulo a ON e.Articulo = a.ID";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                Salida a = new Salida();
                a.setFactura(rs.getInt("Factura"));
                a.setFecha(rs.getDate("Fecha"));
                a.setCantidad(rs.getInt("Cantidad"));
                a.setArticulo(rs.getString("NombreArticulo"));
                a.setTelefonoC(rs.getString("TelefonoC"));

                salir.add(a);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return salir;
    }

    public ArrayList<String> NombrescbLista() {
        ArrayList<String> nombresArticulos = new ArrayList<>();
        try {
            Statement stm = db.createStatement();
            ResultSet rs = stm.executeQuery("SELECT Nombre FROM Articulo");
            while (rs.next()) {
                nombresArticulos.add(rs.getString("Nombre"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return nombresArticulos;
    }

    public boolean insertarSalida(Salida s) {
        try {
            java.sql.Date fecha = new java.sql.Date(s.getFecha().getTime());
            Statement stm = db.createStatement();

            String sqlCantidad = "SELECT Cantidad FROM Articulo WHERE Nombre = '" + s.getArticulo() + "'";
            ResultSet rs = stm.executeQuery(sqlCantidad);
            int cantidadActual = rs.next() ? rs.getInt("Cantidad") : 0;

            if (cantidadActual < s.getCantidad()) {
                JOptionPane.showMessageDialog(null, "La cantidad disponible del producto seleccionado es insuficiente para la salida solicitada");
                return false;
            }

            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO Salida (Fecha, Cantidad, Articulo, TelefonoC) ");
            sql.append("VALUES ('").append(fecha).append("', ");
            sql.append(s.getCantidad()).append(", ");
            sql.append("(SELECT ID FROM Articulo WHERE Nombre = '").append(s.getArticulo()).append("'), '");
            sql.append(s.getTelefonoC()).append("');");
            stm.execute(sql.toString());

            sql = new StringBuilder();
            sql.append("UPDATE Articulo SET Cantidad = Cantidad - ").append(s.getCantidad()).append(" WHERE Nombre = '").append(s.getArticulo()).append("';");
            stm.execute(sql.toString());

            return true;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al registrar la salida: " + e.getMessage());
        }

        return false;
    }

    public boolean eliminarSalida(int idSalida) {
        try {
            Statement stm = db.createStatement();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT Articulo, Cantidad FROM Salida WHERE Factura = ").append(idSalida);
            ResultSet rs = stm.executeQuery(sql.toString());
            if (rs.next()) {
                int idArticulo = rs.getInt("Articulo");
                int cantidad = rs.getInt("Cantidad");
                sql = new StringBuilder();
                sql.append("DELETE FROM Salida WHERE Factura = ").append(idSalida);
                stm.execute(sql.toString());
                sql = new StringBuilder();
                sql.append("UPDATE Articulo SET Cantidad = Cantidad + ").append(cantidad).append(" WHERE ID = ").append(idArticulo);
                stm.execute(sql.toString());
            }
            rs.close();
            stm.close();
            db.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false; 
        }
    }

}
