
package com.mycompany.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public static Connection GetConnection(){
        try {
            StringBuilder conString = new StringBuilder();
            conString.append("jdbc:sqlserver://");
            conString.append("localhost:1433;");
            conString.append("database=Inventario;");
            conString.append("user=sa;");
            conString.append("password=1234;");
            conString.append("trustServerCertificate=true");

           
            //System.out.println(conString.toString());

            Connection con = DriverManager.getConnection(conString.toString());
            

            return con;
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            return null;
        }
    }
}
