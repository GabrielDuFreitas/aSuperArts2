/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.Conexao;
import DTO.FuncionariosDTO;
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
public class FuncionariosBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
    
    public void inserir(FuncionariosDTO f){
        PreparedStatement ps;
        sql = "INSERT INTO tb_funcionario(nome,cpf,identidade,endereco,cep,numero,cidade,uf,telefone)VALUES(?,?,?,?,?,?,?,?,?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, f.getNome());
            ps.setString(2, f.getCpf());
            ps.setString(3, f.getIdentidade());
            ps.setString(4, f.getEndereco());
            ps.setString(5, f.getCep());
            ps.setInt(6, f.getNumero());
            ps.setString(7, f.getCidade());
            ps.setString(8, f.getUf());;
            ps.setString(9, f.getTelefone());;
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<FuncionariosDTO> listarFuncionario(){
        ResultSet rs = null;
        sql = "SELECT * FROM tb_funcionario";
        List<FuncionariosDTO> funcionarios =new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                FuncionariosDTO f = new FuncionariosDTO();
                
                f.setId_funcionario(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setCpf(rs.getString("cpf"));
                f.setIdentidade(rs.getString("identidade"));
                f.setEndereco(rs.getString("endereco"));
                f.setCep(rs.getString("cep"));
                f.setNumero(Integer.parseInt(rs.getString("numero")));
                f.setCidade(rs.getString("cidade"));
                f.setUf(rs.getString("uf"));
                f.setTelefone(rs.getString("telefone"));
                funcionarios.add(f);
            }
           return funcionarios;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void ExcluirFuncionario(FuncionariosDTO f){
        sql = "DELETE FROM tb_funcionario WHERE id_funcionario=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, f.getId_funcionario());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void alterar(FuncionariosDTO f){
        sql = "UPDATE tb_funcionario SET nome=?,cpf=?,identidade=?,endereco=?,cep=?,numero=?,cidade=?,uf=?,telefone=? WHERE id_funcionario=?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, f.getNome());
            ps.setString(2, f.getCpf());
            ps.setString(3, f.getIdentidade());
            ps.setString(4, f.getEndereco());
            ps.setString(5, f.getCep());
            ps.setInt(6, f.getNumero());
            ps.setString(7, f.getCidade());
            ps.setString(8, f.getUf());
            ps.setString(9, f.getTelefone());
            ps.setInt(10, f.getId_funcionario());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionariosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
