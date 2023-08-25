package com.example.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import com.example.model.Marca;

public class MarcaDao {
    Connection conn;

    public MarcaDao (Connection conn) {
        this.conn = conn;
    }
    public void listar (Connection conn) {
        var sql = "select * from marca";
        try (var statement = conn.createStatement()) {
            var result = statement.executeQuery(sql);
            while (result.next()) {
                System.out.printf(" Id: %d Nome: %s \n",
                result.getInt("id"), result.getString("nome"));

            //    System.out.printf(" Id: %d Nome: %s UF: %s \n", 
            //    result.getInt("id"), result.getString("nome"),result.getString("uf"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar marca"+e.getMessage());
        }
    }
    public void excluir(Long id) {
        var sql = "select * from marca where id = ?";

        
        try  (var  statement = conn.prepareStatement(sql)) {
            statement.setLong(1, id);
            if (statement.executeUpdate()==1) {
                System.out.println("Produto excluido com sucesso");
            } else System.out.println("Produto não cadastrado");
      
        } catch (SQLException e) {
            System.err.println("Erro ao excluir uma marca"+ e.getMessage());
        }      
    }

    public void alterar(Marca marca) {
        var sql = "update marca set nome = ?, codigo = ?,dataCadastro = ? where id = ?";
        
        try (var statement = conn.prepareStatement(sql)) {
            statement.setString(1,marca.getNome());
            statement.setString(2,marca.getCodigo());
            statement.setDate(3, new Date(marca.getDataCadastro().getTime()));
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Erro alterar marca");
        } finally {

			// Fechar as conexões
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }

    public void inserir(Marca marca) {
        var sql = "insert into marca (nome,codigo,dataCadastro) values (?,?,?)";

        try (var statement = conn.prepareStatement(sql)) {
            statement.setString(1,marca.getNome());
            statement.setString(2,marca.getCodigo());
            statement.setDate(3,new Date(marca.getDataCadastro().getTime()));
            statement.executeUpdate();
            statement.close();

        } catch (SQLException e) {
            System.err.println("Erro ao inserir marca"+e.getMessage());
        }
    }
}
