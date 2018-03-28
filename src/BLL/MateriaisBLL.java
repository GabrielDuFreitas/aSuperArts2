/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAO.Conexao;
import DTO.MateriaisDTO;
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
public class MateriaisBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
    
     public void inserir(MateriaisDTO m){
        PreparedStatement ps;
        sql = "INSERT INTO tb_materiais(nome,espessura,cor,altura,largura,compra,porcentagem,total,venda)VALUES(?,?,?,?,?,?,?,?,?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getNome());
            ps.setString(2, m.getEspessura());
            ps.setString(3, m.getCor());
            ps.setDouble(4, m.getAltura());
            ps.setDouble(5, m.getLargura());
            ps.setDouble(6, m.getPrecocompra());
            ps.setInt(7, m.getPorcentagem());
            ps.setDouble(8, m.getTotal());
            ps.setDouble(9, m.getPrecovenda());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MateriaisBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public List<MateriaisDTO> listarMaterial(){
        ResultSet rs = null;
        sql = "SELECT * FROM tb_materiais";
        List<MateriaisDTO> materiais =new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MateriaisDTO m = new MateriaisDTO();
                
               m.setId_material(rs.getInt("id_material"));
               m.setNome(rs.getString("nome"));
               m.setEspessura(rs.getString("espessura"));
               m.setCor(rs.getString("cor"));
               m.setAltura(rs.getDouble("altura"));
               m.setLargura(rs.getDouble("largura"));
               m.setPrecocompra(rs.getDouble("compra"));
               m.setPorcentagem(rs.getInt("porcentagem"));
               m.setTotal(rs.getDouble("total"));
               m.setPrecovenda(rs.getDouble("venda"));
               materiais.add(m);
            }
           return materiais;
        } catch (SQLException ex) {
            Logger.getLogger(MateriaisBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
      public void ExcluirMaterial(MateriaisDTO m){
        sql = "DELETE FROM tb_materiais WHERE id_material=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, m.getId_material());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MateriaisBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
