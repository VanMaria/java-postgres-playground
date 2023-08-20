package com.example;

import java.sql.DriverManager;

import com.example.Dao.ConnectionManager;
import com.example.Dao.Dao;
import com.example.Dao.EstadoDao;
import com.example.Dao.ProdutoDao;
import com.example.model.*;
import java.sql.Connection;
import java.sql.SQLException;

import org.postgresql.core.ConnectionFactory;

public class AppBd {
    //private Connection conn;
    public static void main(String[] args) {
        new AppBd();
    }
    public  AppBd() {

        try ( var conn = ConnectionManager.getConnetion()) {
            System.out.println("Conexão concluida com sucesso");
         //   CarregarDriverJDBC();
            EstadoDao estadodao = new EstadoDao(conn);
            estadodao.Listar(conn);
            estadodao.localizar("PR");
           

            var produto = new Produto();
            var marca = new Marca();
            marca.setId(2L);
            produto.setId(207L);
            produto.setMarca(marca);
            produto.setValor(125);
            produto.setNome("Produto novo");
           
            ProdutoDao produtodao = new ProdutoDao(conn);
            produtodao.excluir(202L);

            //produtodao.inserir (produto);
            //produtodao.alterar (produto);
            Dao dao = new Dao(conn);
            dao.listar("produto");

        } catch (Exception e) {
             System.out.println("Não foi possível conectar com o banco de dados" + e.getMessage());
        } 
    }
    private static void CarregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca para acesso ao banco de dados" + e.getMessage());
        }
    }
}