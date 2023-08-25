package com.example.Dao;

import java.sql.Connection;

public class EstadoDao {
    Connection conn;

    public EstadoDao(Connection conn) {
        this.conn = conn;
    }

    public EstadoDao(Object conn2) {
       
    }

    public  void Listar(Connection conn) {
        
        try  {
            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");

            while (result.next()) {
                System.out.printf(" Id: %d Nome: %s UF: %s \n", 
                result.getInt("id"), result.getString("nome"),result.getString("uf"));
            }
            
        } catch (Exception e) {
            System.out.println("Não foi possível executara a consulta no banco de dados" +e.getMessage());
        }
    }
    public  void localizar( String uf) {
        try {
            //var sql = "select * from estado where uf = '" + uf + "'";
            var sql = "select * from estado where uf = ?";
            var statement = conn.prepareStatement(sql);
            System.out.println("");
            statement.setString(1, uf);
            var result = statement.executeQuery();
            if (result.next()) {
                System.out.printf("Id: %d Nome: %s UF: %s  \n", result.getInt("id"),result.getString("nome"),result.getString("UF"));
            }
        }
        catch (Exception e) {
            System.out.println("Não foi possível executara a consulta no banco de dados" +e.getMessage());
        }
    }
    };
    

