package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    public static void main (String[] args) {
        Connection conn = null;

        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Class.forName("org.postgresql.Driver");
            try {
                //conn = DriverManager.getConnection("jdbc:mysql://localhost/banco", "usuario", "senha");
                conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "");

                /*ResultSet rscliente = conn.createStatement().executeQuery("select * from estado");
                while (rscliente.next()) {
                    System.out.println("Nome: "+ rscliente.getString("nome"));
                }
                */
                var statement = conn.createStatement();
                var result = statement.executeQuery("select * from estado");
                while (result.next()) {
                    System.out.println("Nome: "+ result.getString("nome"));
                }
            } catch (SQLException e) {   
                System.out.println("ocorreu erro ao acessar o banco");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Erro na localizaçao do driver");;
        }
        finally {
            if (conn !=null) {
               // conn.close;
            }
        }

    }
    
}
