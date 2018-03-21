/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.Conexao;
import DTO.Login_DTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Casa
 */
public class Login_BLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
    
    public void Inserir(Login_DTO log){
        sql = "INSERT INTO tb_usuario(nome,senha,nivel)VALUES(?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, log.getNome());
            ps.setString(2, log.getSenha());
            ps.setString(3, log.getNivel());
            ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(Login_DTO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public Integer Validar(String nome, String senha){
            sql= "SELECT nivel FROM tb_usuario WHERE nome=? AND senha=?";
            ResultSet rs = null;
            int tipo = 0;
         try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, senha); 
            rs = ps.executeQuery();
            while (rs.next()){
                tipo = rs.getInt("nivel");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_BLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipo;
         
    }
}
