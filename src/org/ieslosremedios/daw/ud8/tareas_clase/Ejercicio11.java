package org.ieslosremedios.daw.ud8.tareas_clase;

import java.sql.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        //El Driver es "jdbc" y 3306 es el puerto de MariaDB
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            //Creamos conexión y la declaración
            Connection connection = DriverManager.getConnection(url, "jonathanleon", "jonathanleon");
            System.out.println("Conexión Exitosa");
            Statement statement =  connection.createStatement();

            //Añadimos al Lote las declaraciones
            statement.addBatch("DELETE FROM producto");
            statement.addBatch("INSERT INTO producto VALUES(1, 'Manzana', 'Manzanas Golden', 50, 'Francia'), (2, 'Pera', 'Peras Conferencia', 25, 'España'), (3, 'Uva', 'Uvas Gourmet', 30, 'España')");
            statement.addBatch("UPDATE tienda.producto SET precio = 20 WHERE producto.nombre LIKE 'Pera'");
            statement.addBatch("INSERT INTO producto VALUES(4, 'Kiwi', 'Zaspri Gold', 120, 'Nueva Zelanda'), (5, 'Perito', 'Peritos de Tavizna', 18, 'España'), (6, 'Plátano', 'Plátano Canario', 40, 'España')");

            productosEspaña(statement);

            //Hacemos commit y cerramos declaraciones y conexión
            connection.commit();
            statement.executeBatch();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.err.println("No se pudo conectar: " + e.getMessage());
        }
    }

    private static void productosEspaña(Statement statement) throws SQLException{
        String querySelect = "SELECT * FROM producto WHERE pais LIKE 'España' ORDER BY precio";
        ResultSet resultados = statement.executeQuery(querySelect);
        System.out.println("Productos de España: ");

        while(resultados.next()){
            System.out.println("Id: " + resultados.getInt("id"));
            System.out.println("Nombre: " + resultados.getString("nombre"));
            System.out.println("Descripción: " + resultados.getString("descripcion"));
            System.out.println("Precio: " + resultados.getFloat("precio"));
            System.out.println("País: " + resultados.getString("pais"));
            System.out.println("----------------------------------------------");
        }

    }
}
