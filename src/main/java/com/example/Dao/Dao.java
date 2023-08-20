package com.example.Dao;

import java.sql.Connection;
import java.sql.SQLException;

public class Dao {
    Connection conn;

    public Dao(Connection conn) {
        this.conn = conn;
    };

    public void listar(String tabela) {
        var sql = "select * from " + tabela;

        try {
            var statement = conn.createStatement();
            var result = statement.executeQuery(sql);

            var metadata = result.getMetaData();
            int cols = metadata.getColumnCount();

            for (int i = 1; i <= cols; i++) {
                System.out.printf("%-30s | ",metadata.getColumnName(i));
            }
            System.out.println();

            while (result.next()) {
                for (int i = 1; i <= cols; i++) {
                    System.out.printf("%-30s | ",result.getString(i) );
                 
                }
                System.out.println();
            }
          
        } catch (SQLException e) {
            System.out.println("Erro de conexão" + e.getMessage());
        };
    }
}
