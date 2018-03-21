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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        sql = "INSERT INTO tb_cliente(nome,tipo,empresa,cpf,cnpj,email,endereco,telefone,celular)VALUES(?,?,?,?,?,?,?,?,?);";
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
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ClientesDTO> listarCliente(){
        ResultSet rs = null;
        sql = "SELECT * FROM tb_cliente";
        List<ClientesDTO> clientes =new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ClientesDTO c = new ClientesDTO();
                
                c.setId_cliente(rs.getInt("id_cliente"));
                c.setNome(rs.getString("nome"));
                c.setTipo(rs.getString("tipo"));
                c.setEmpresa(rs.getString("empresa"));
                c.setCpf(rs.getString("cpf"));
                c.setCnpj(rs.getString("cnpj"));
                c.setEmail(rs.getString("email"));
                c.setEndereco(rs.getString("endereco"));
                c.setTelefone(rs.getString("telefone"));
                c.setCelular(rs.getString("celular"));
                clientes.add(c);
            }
           return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(ClientesBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public void ExcluirCliente(ClientesDTO c){
        sql = "DELETE FROM tb_cliente WHERE id_cliente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getId_cliente());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
