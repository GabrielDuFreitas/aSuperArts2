package BLL;

import DAO.Conexao;
import DTO.ServicosDTO;
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
public class ServicosBLL {
    String sql;
    Connection con = new Conexao().abrirConexao();
   public void inserir(ServicosDTO m){
  
        PreparedStatement ps;
        sql = "INSERT INTO tb_servico(nome,quantidade,valor)VALUES(?,?,?);";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, m.getNome());
            ps.setInt(2, m.getQuantidade());
            ps.setDouble(3, m.getValor());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ServicosBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public List<ServicosDTO> listarServico(){
        ResultSet rs = null;
        sql = "SELECT * FROM tb_servico";
        List<ServicosDTO> servicos =new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ServicosDTO m = new ServicosDTO();
                
                m.setId_servico(rs.getInt("id_servico"));
                m.setNome(rs.getString("nome"));
                m.setQuantidade(rs.getInt("quantidade"));
                m.setValor(rs.getDouble("valor"));
                servicos.add(m);
            }
           return servicos;
        } catch (SQLException ex) {
            Logger.getLogger(ClientesBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public void ExcluirServico(ServicosDTO m){
        sql = "DELETE FROM tb_servico WHERE id_servico=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, m.getId_servico());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClientesBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
