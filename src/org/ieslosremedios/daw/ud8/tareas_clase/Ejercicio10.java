package org.ieslosremedios.daw.ud8.tareas_clase;

import java.sql.*;
import java.util.Arrays;

public class Ejercicio10 {
    public static void main(String[] args) {
        //El Driver es "jdbc" y 3306 es el puerto de MariaDB
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            //Creamos conexión y la declaración
            Connection connection = DriverManager.getConnection(url, "jonathanleon", "jonathanleon");
            System.out.println("Conexión Exitosa");
            Statement statement =  connection.createStatement();

            String queryBorrado = "DELETE FROM producto";
            statement.executeUpdate(queryBorrado);

            String queryInsert = "INSERT INTO producto VALUES(1, 'Manzana', 'Manzanas Golden', 50, 'Francia'), (2, 'Pera', 'Peras Conferencia', 25, 'España'), (3, 'Uva', 'Uvas Gourmet', 30, 'España')";
            statement.executeUpdate(queryInsert);

            String queryUpdate = "UPDATE tienda.producto SET precio = 20 WHERE producto.nombre LIKE 'Pera'";
            statement.executeUpdate(queryUpdate);

            ResultSet resultados = statement.executeQuery("SELECT * FROM producto ORDER BY precio DESC");
            while(resultados.next()){
                System.out.println("Id: " + resultados.getInt("id"));
                System.out.println("Nombre: " + resultados.getString("nombre"));
                System.out.println("Descripción: " + resultados.getString("descripcion"));
                System.out.println("Precio: " + resultados.getFloat("precio"));
                System.out.println("País: " + resultados.getString("pais"));
                System.out.println("----------------------------------------------");
            }

            //Ejecutamos el Lote
            int[] registrosAfectados = statement.executeBatch();

            //Hacemos commit y cerramos declaraciones y conexión
            connection.commit();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.err.println("No se pudo conectar: " + e.getMessage());
        }
    }
}

