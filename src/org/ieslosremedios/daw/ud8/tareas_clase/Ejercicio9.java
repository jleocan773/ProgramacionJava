package org.ieslosremedios.daw.ud8.tareas_clase;

import java.sql.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        //El Driver es "jdbc" y 3306 es el puerto de MariaDB
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            Connection connection = DriverManager.getConnection(url, "jonathanleon", "jonathanleon");
            System.out.println("Conexión Exitosa");
            Statement statement =  connection.createStatement();

            //Insertamos los productos:
            //String borrarProductos = "DELETE FROM producto WHERE id = 1 OR 2 OR 3";
            //String insertarProductos = "INSERT INTO producto VALUES(1, 'Plátano', 'Fruta', 5),(2, 'Lechuga', 'Vegetal', 4), (3, 'Fresa', 'Fruta', 2)";
            //ResultSet resultados = statement.executeQuery(insertarProductos);

            ResultSet resultados = statement.executeQuery("SELECT * FROM producto ORDER BY precio DESC");
            while(resultados.next()){
                System.out.println("Id: " + resultados.getInt("id"));
                System.out.println("Nombre: " + resultados.getString("nombre"));
                System.out.println("Descripción: " + resultados.getString("descripcion"));
                System.out.println("Precio: " + resultados.getFloat("precio"));
                System.out.println("----------------------------------------------");
            }

            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.err.println("No se pudo conectar: " + e.getMessage());
        }
    }
}

