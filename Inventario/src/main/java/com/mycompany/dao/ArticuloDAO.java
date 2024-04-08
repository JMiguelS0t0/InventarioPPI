package com.mycompany.dao;

import com.mycompany.Conexion.Conexion;
import com.mycompany.modelo.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale;

public class ArticuloDAO {

    private Connection db;

    public ArticuloDAO() {
        db = Conexion.GetConnection();
    }

    public ArrayList<Articulo> GetAll() {
        ArrayList<Articulo> producto = new ArrayList();

        try {
            Statement stm = db.createStatement();
            String sql = "SELECT * FROM Articulo";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                Articulo a = new Articulo();
                a.setID(rs.getInt("ID"));
                a.setNombre(rs.getString("Nombre"));
                a.setDescripcion(rs.getString("Descripcion"));
                a.setValor(rs.getFloat("Valor"));
                a.setCategoria(rs.getString("Categoria"));
                a.setCantidad(rs.getInt("Cantidad"));

                producto.add(a);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return producto;
    }

    public boolean InsertarArticulo(Articulo a) {

        try {

            Statement stm = db.createStatement();

            StringBuilder sql = new StringBuilder();
            sql.append("INSERT INTO Articulo ([Nombre],[Descripcion],[Valor],[Categoria],[Cantidad]) ");
            sql.append("VALUES(");

            sql.append("'").append(a.getNombre()).append("',");
            sql.append("'").append(a.getDescripcion()).append("',");
            sql.append(String.format(Locale.US, "%.2f", a.getValor())).append(",");
            sql.append("'").append(a.getCategoria()).append("',");
            sql.append(a.getCantidad());
            sql.append(")");

            stm.execute(sql.toString());
            return true;

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean EliminarArticulo(int id) {
        try {
            Statement stm = db.createStatement();
            String sql = "DELETE FROM Articulo WHERE ID= " + id;
            stm.execute(sql);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean actualizar(Articulo a) {
        boolean actualizado = false;
        try {

            String sql = "UPDATE articulo SET nombre=?, descripcion=?, valor=?, categoria=?, cantidad=? WHERE id=?";
            PreparedStatement ps = db.prepareStatement(sql);
            ps.setString(1, a.getNombre());
            ps.setString(2, a.getDescripcion());
            ps.setFloat(3, a.getValor());
            ps.setString(4, a.getCategoria());
            ps.setInt(5, a.getCantidad());
            ps.setInt(6, a.getID());
            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                actualizado = true;
            }
            ps.close();
            db.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return actualizado;
    }

}
