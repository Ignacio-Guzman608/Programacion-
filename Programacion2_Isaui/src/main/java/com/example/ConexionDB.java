package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/pruebas";
        String user = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado correctamente");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}