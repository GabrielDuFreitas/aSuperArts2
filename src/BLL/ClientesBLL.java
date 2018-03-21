/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.Conexao;
import DTO.ClientesDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class ClientesBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
    
    public void inserir(ClientesDTO c){
        PreparedStatement ps;
        sql = "INSERT INTO tb_cliente(nome,tipo,empresa,cpf,cnpj,email,endereco,telefone,celular,caminho)VALUES(?,?,?,?,?,?,?,?,?,?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getTipo());
            ps.setString(3, c.getEmpresa());
            ps.setString(4, c.getCpf());
            ps.setString(5, c.getCnpj());
            ps.setString(6, c.getEmail());
            ps.setString(7, c.getEndereco());
            ps.setString(8, c.getTelefone());
            ps.setString(9, c.getCelular());
            ps.setByte(10, c.getCaminho());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
}
