package com.mycompany.dao;

import com.mycompany.Conexion.Conexion;

import com.mycompany.modelo.Entrada;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class EntradaDAO {

    private Connection db;

    public EntradaDAO() {
        db = Conexion.GetConnection();
    }

    public ArrayList<Entrada> GetAll() {
        ArrayList<Entrada> Entrar = new ArrayList<>();

        try {
            Statement stm = db.createStatement();
            String sql = "SELECT e.Factura, e.Fecha, e.Cantidad, a.Nombre AS NombreArticulo "
                    + "FROM Entrada e "
                    + "JOIN Articulo a ON e.Articulo = a.ID";

            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                Entrada e = new Entrada();
                e.setFactura(rs.getInt("Factura"));
                e.setFecha(rs.getDate("Fecha"));
                e.setCantidad(rs.getInt("Cantidad"));
                e.setArticulo(rs.getString("NombreArticulo"));
                Entrar.add(e);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return Entrar;
    }

    public boolean InsertarEntrada(Entrada a) {
        try {
            java.sql.Date fecha = new java.sql.Date(a.getFecha().getTime());
            Statement stm = db.createStatement();
            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO Entrada ([Fecha],[Cantidad],[Articulo]) ");
            sql.append("VALUES ('").append(fecha).append("', ");
            sql.append(a.getCantidad()).append(", ");
            sql.append("(SELECT ID FROM Articulo WHERE Nombre = '").append(a.getArticulo()).append("'));");
            stm.execute(sql.toString());
            sql = new StringBuilder();
            sql.append("UPDATE Articulo SET Cantidad = Cantidad + ").append(a.getCantidad()).append(" WHERE Nombre = '").append(a.getArticulo()).append("';");
            stm.execute(sql.toString());
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
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

    public boolean eliminarEntrada(int idEntrada) {
        try {
            Statement stm = db.createStatement();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT Articulo, Cantidad FROM Entrada WHERE Factura = ").append(idEntrada);
            ResultSet rs = stm.executeQuery(sql.toString());
            if (rs.next()) {
                int idArticulo = rs.getInt("Articulo");
                int cantidad = rs.getInt("Cantidad");
                sql = new StringBuilder();
                sql.append("DELETE FROM Entrada WHERE Factura = ").append(idEntrada);
                stm.execute(sql.toString());
                sql = new StringBuilder();
                sql.append("UPDATE Articulo SET Cantidad = Cantidad - ").append(cantidad).append(" WHERE ID = ").append(idArticulo);
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
