package com.example.Dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.model.Produto;

public class ProdutoDao {
    Connection conn;

    public ProdutoDao(Connection conn) {
        this.conn = conn;
    }
    public void excluir(Long id) {
        var  sql = "delete from produto where id = ?";

        try (var statement = conn.prepareStatement(sql)) {
            statement.setLong(1,id);
           if ( statement.executeUpdate()==1) {
                System.out.println("Produto excluído com sucesso");
             } else System.out.println("Produto não localizado");

        } catch (SQLException e) {
            System.err.println("Erro ao excluir um produto"+ e.getMessage());
        }

    }

    public void alterar(Produto produto) {
        var sql = "update produto set nome=?, marca_id=?, valor=? where id = ?";
        System.out.println(sql);
        try (var statement= conn.prepareStatement(sql)) {

            statement.setString(1,produto.getNome());
            statement.setLong(2,produto.getMarca().getId());
            statement.setDouble(3,produto.getValor());
            statement.setLong(4, produto.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar produto"+ e.getMessage());
              
        }
    }
    public void inserirProduto (Produto produto) {
        var sql = "insert into produto (nome, marca_id, valor) values (?,?,?)";
        
        try (var statement= conn.prepareStatement(sql)) {

            statement.setString(1,produto.getNome());
            statement.setLong(2,produto.getMarca().getId());
            statement.setDouble(3,produto.getValor());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao acessar o banco "+ e.getMessage());
              
        }
    }

}
