/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author ananicole
 */
import factory.ConnectionFactory;
import modelo.Cliente;
import java.sql.*;
import java.sql.PreparedStatement;

public class ClienteDAO {
    private Connection connection;
    Long id;
    String nome, sobrenome, cfp, rg, endereco, renda;
    public ClienteDAO(){ 
        this.connection = new ConnectionFactory().getConnection();
    } 
    public void adiciona(Cliente usuario){ 
        String sql = "INSERT INTO usuario(nome,sobrenome, cpf,rg, endereco, renda) VALUES(?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSobrenome());
            stmt.setString(3, usuario.getCpf());
            stmt.setString(4, usuario.getRenda());
            stmt.setString(5, usuario.getRg());
            stmt.setString(6, usuario.getEndereco());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    
}
}
