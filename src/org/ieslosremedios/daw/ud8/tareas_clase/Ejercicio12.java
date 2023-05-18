package org.ieslosremedios.daw.ud8.tareas_clase;

import java.sql.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        //El Driver es "jdbc" y 3306 es el puerto de MariaDB
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            //Creamos conexión y la declaración
            Connection connection = DriverManager.getConnection(url, "jonathanleon", "jonathanleon");
            System.out.println("Conexión Exitosa");
            DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet resultSet = databaseMetaData.getTables("tienda", null, null, null);

            System.out.println("Usuario que ha realizado la conexión: " + databaseMetaData.getUserName());
            System.out.println("URL de la conexión: " + databaseMetaData.getURL());
            System.out.println("Nombre del Driver: " + databaseMetaData.getDriverName());
            System.out.println("Versión que se está usando: " + databaseMetaData.getDriverVersion());

            System.out.println("Tablas Existentes en Tienda: ");
            while (resultSet.next()){
                System.out.println(resultSet.getString("TABLE_NAME"));
            }

            System.out.println("Columnas de la tabla Producto");
            resultSet = databaseMetaData.getColumns("tienda", null, "producto", null);
            while (resultSet.next()){
                System.out.println(resultSet.getString("COLUMN_NAME"));
            }

            resultSet.close();
            connection.close();



        } catch (SQLException e) {
            System.err.println("No se pudo conectar: " + e.getMessage());
        }
    }
}
