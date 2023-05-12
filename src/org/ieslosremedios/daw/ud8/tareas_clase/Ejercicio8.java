package org.ieslosremedios.daw.ud8.tareas_clase;

import java.sql.*;

public class Ejercicio8 {
        public static void main(String[] args) {
            //El Driver es "jdbc" y 3306 es el puerto de MariaDB
            String url = "jdbc:mariadb://localhost:3306/tienda";
            try {
                Connection connection = DriverManager.getConnection(url, "jonathanleon", "jonathanleon");
                System.out.println("Conexión Exitosa");
                Statement statement =  connection.createStatement();



                statement.close();
                connection.close();

                } catch (SQLException e) {
                System.err.println("No se pudo conectar: " + e.getMessage());
                }
        }
}


