package org.ieslosremedios.daw.ud8.sql;

import java.sql.*;

public class Conexion {
    public static void main(String[] args) {
        //El Driver es "jdbc" y 3306 es el puerto de MariaDB
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            //Enlazar con el Driver
            Class.forName("org.mariadb.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, "jonathanleon", "jonathanleon");
            System.out.println("Conexión Exitosa");
            Statement statement =  connection.createStatement();

            //TODO Aquí se hacen las consultas


            statement.close();
            connection.close();

        } catch (SQLException  | ClassNotFoundException e) {
            System.err.println("No se pudo conectar" + e.getMessage());
        }

    }
}
