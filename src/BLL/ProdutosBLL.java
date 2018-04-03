
package BLL;

import DAO.Conexao;
import DTO.ProdutosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Administrador
 */
public class ProdutosBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
    
    public void inserir(ProdutosDTO p){
        PreparedStatement ps;
        sql = "INSERT INTO tb_produtos(nome_produtos,cor,quantidade,espessura,altura,largura,comprimento,valor)VALUES(?,?,?,?,?,?,?,?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getCor());
            ps.setInt(3, p.getQuantidade());
            ps.setString(4, p.getEspessura());
            ps.setDouble(5, p.getAltura());
            ps.setDouble(6, p.getLargura());
            ps.setDouble(7, p.getComprimento());
            ps.setDouble(8, p.getValor());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<ProdutosDTO> listarProduto(){
        ResultSet rs = null;
        sql = "SELECT * FROM tb_produtos";
        List<ProdutosDTO> produtos =new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProdutosDTO p = new ProdutosDTO();
                
                p.setId_produto(rs.getInt("id_produtos"));
                p.setNome(rs.getString("nome_produtos"));
                p.setCor(rs.getString("cor"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setEspessura(rs.getString("espessura"));
                p.setAltura(rs.getDouble("altura"));
                p.setLargura(rs.getDouble("largura"));
                p.setComprimento(rs.getDouble("comprimento"));
                p.setValor(rs.getDouble("valor"));          
                produtos.add(p);
            }
           return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public void ExcluirProduto(ProdutosDTO p){
        sql = "DELETE FROM tb_produtos WHERE id_produtos=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getId_produto());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void alterar(ProdutosDTO p){
        sql = "UPDATE tb_produtos SET nome=?,cor=?,quantidade=?,espessura=?,altura=?,largura=?,comprimento=?,valor=? WHERE id_produtos=?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, p.getNome());
            ps.setString(2, p.getCor());
            ps.setInt(3, p.getQuantidade());
            ps.setString(4, p.getEspessura());
            ps.setDouble(5, p.getAltura());
            ps.setDouble(6, p.getLargura());
            ps.setDouble(7, p.getComprimento());
            ps.setDouble(8, p.getValor());
            ps.setInt(9, p.getId_produto());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
