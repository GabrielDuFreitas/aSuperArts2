/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import BLL.MateriaisBLL;
import DTO.MateriaisDTO;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Administrador
 */
public class Alterar_Materiais extends javax.swing.JFrame {

    /**
     * Creates new form Alterar_Materiais
     */
    public Alterar_Materiais() {
        initComponents();
    }
    public void preencherTabela(){
        
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(0).setPreferredWidth(50);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(0).setMaxWidth(50);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(0).setMinWidth(50);
        
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(1).setPreferredWidth(350);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(1).setMaxWidth(350);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(1).setMinWidth(350);
        
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(2).setPreferredWidth(120);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(2).setMaxWidth(120);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(2).setMinWidth(120);
        
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(3).setPreferredWidth(180);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(3).setMaxWidth(180);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(3).setMinWidth(180);
        
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(4).setPreferredWidth(150);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(4).setMaxWidth(150);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(4).setMinWidth(150);
        
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(5).setPreferredWidth(150);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(5).setMaxWidth(150);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(5).setMinWidth(150);
        
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(6).setPreferredWidth(170);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(6).setMaxWidth(170);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(6).setMinWidth(170);
        
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(7).setPreferredWidth(80);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(7).setMaxWidth(80);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(7).setMinWidth(80);
        
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(8).setPreferredWidth(170);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(8).setMaxWidth(170);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(8).setMinWidth(170);
        
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(9).setPreferredWidth(200);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(9).setMaxWidth(200);
        Cadastro_Materiais.tb_material.getColumnModel().getColumn(9).setMinWidth(200);
        
        MateriaisBLL rg = new MateriaisBLL();
        Cadastro_Materiais.tb_material.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel) Cadastro_Materiais.tb_material.getModel();
        modelo.setNumRows(0);
        
        for(MateriaisDTO mdto:rg.listarMaterial()){
         modelo.addRow(new Object[]{
                mdto.getId_material(),
                mdto.getNome(),
                mdto.getEspessura(),
                mdto.getCor(),
                mdto.getAltura(),
                mdto.getLargura(),
                mdto.getPrecocompra(),
                mdto.getPorcentagem(),
                mdto.getTotal(),
                mdto.getPrecovenda()
            });
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_cor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_espessura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_altura = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_largura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_totalCm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_precoCompra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_porcentagem = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_precoVenda = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_valorCm = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        txt_cod.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setText("Cor");

        jLabel5.setText("Espessura");

        jLabel6.setText("Altura");

        txt_altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_alturaKeyReleased(evt);
            }
        });

        jLabel7.setText("Largura");

        txt_largura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_larguraKeyReleased(evt);
            }
        });

        jLabel8.setText("Total cm²");

        jLabel9.setText("Preço de Compra");

        txt_precoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_precoCompraKeyReleased(evt);
            }
        });

        jLabel10.setText("Porcentagem");

        txt_porcentagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_porcentagemKeyReleased(evt);
            }
        });

        jLabel11.setText("Total");

        jLabel12.setText("Preço de Venda");

        jLabel13.setText("Valor cm²");

        btn_cadastrar.setText("Alterar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_espessura, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txt_largura, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txt_totalCm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txt_precoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(txt_porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_precoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txt_valorCm, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_cadastrar))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_espessura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_largura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_totalCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_precoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_valorCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_cadastrar)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        MateriaisBLL rg = new MateriaisBLL();
        MateriaisDTO materiaisDTO = new MateriaisDTO();
        if(!txt_nome.getText().equals("")&&
                !txt_espessura.getText().equals("")&&
                !txt_cor.getText().equals("") &&
                !txt_altura.getText().equals("") &&
                !txt_largura.getText().equals("") &&
                !txt_precoCompra.getText().equals("") &&
                !txt_porcentagem.getText().equals("") &&
                !txt_total.getText().equals("") &&
                !txt_precoVenda.getText().equals("")
                ){
                int id = Integer.parseInt(txt_cod.getText());
                materiaisDTO.setId_material(id);
                materiaisDTO.setNome(txt_nome.getText());
                materiaisDTO.setEspessura(txt_espessura.getText());
                materiaisDTO.setCor(txt_cor.getText());
                materiaisDTO.setAltura(Double.parseDouble(txt_altura.getText().replace(",", ".")));
                materiaisDTO.setLargura(Double.parseDouble(txt_largura.getText().replace(",", ".")));
                materiaisDTO.setPrecocompra(Double.parseDouble(txt_precoCompra.getText().replace(",", ".")));
                materiaisDTO.setPorcentagem(Integer.parseInt(txt_porcentagem.getText().replace(",", ".")));
                materiaisDTO.setTotal(Double.parseDouble(txt_total.getText().replace(",", ".")));
                materiaisDTO.setPrecovenda(Double.parseDouble(txt_precoVenda.getText().replace(",", ".")));
     
                    rg.alterar(materiaisDTO);
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                   // preencherTabela();
                    this.dispose();          
        }else{       
            JOptionPane.showMessageDialog(null, "Campos vazios!");                
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void txt_alturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_alturaKeyReleased
        Double altura = Double.valueOf(txt_altura.getText());
        Double largura = Double.valueOf(txt_largura.getText());
        txt_totalCm.setText(String.valueOf(altura * largura).replace(",", "."));
        
        Double venda = Double.valueOf(txt_precoVenda.getText());
        Double totalcm = Double.valueOf(txt_totalCm.getText());
        txt_valorCm.setText(String.valueOf(venda/totalcm));
    }//GEN-LAST:event_txt_alturaKeyReleased

    private void txt_larguraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_larguraKeyReleased
        Double altura = Double.valueOf(txt_altura.getText());
        Double largura = Double.valueOf(txt_largura.getText());
        txt_totalCm.setText(String.valueOf(altura * largura).replace(",", "."));
        
        Double venda = Double.valueOf(txt_precoVenda.getText());
        Double totalcm = Double.valueOf(txt_totalCm.getText());
        txt_valorCm.setText(String.valueOf(venda/totalcm));
    }//GEN-LAST:event_txt_larguraKeyReleased

    private void txt_precoCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precoCompraKeyReleased
        Double valor_compra = Double.valueOf(txt_precoCompra.getText());
        Double porcentagem = Double.valueOf(txt_porcentagem.getText());
        txt_total.setText(String.valueOf(valor_compra * porcentagem).replace(",", "."));
              
        Double total = Double.valueOf(txt_total.getText());
        Double compra = Double.valueOf(txt_precoCompra.getText());
        txt_precoVenda.setText(String.valueOf(total + compra).replace(",", "."));
        
        Double venda = Double.valueOf(txt_precoVenda.getText());
        Double totalcm = Double.valueOf(txt_totalCm.getText());
        txt_valorCm.setText(String.valueOf(venda/totalcm));
    }//GEN-LAST:event_txt_precoCompraKeyReleased

    private void txt_porcentagemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_porcentagemKeyReleased
        Double valor_compra = Double.valueOf(txt_precoCompra.getText());
        Double porcentagem = Double.valueOf(txt_porcentagem.getText());
        txt_total.setText(String.valueOf(valor_compra * (porcentagem/100)).replace(",", "."));
             
        Double total = Double.valueOf(txt_total.getText());
        Double compra = Double.valueOf(txt_precoCompra.getText());
        txt_precoVenda.setText(String.valueOf(total + compra).replace(",", "."));
        
        Double venda = Double.valueOf(txt_precoVenda.getText());
        Double totalcm = Double.valueOf(txt_totalCm.getText());
        DecimalFormat df = new DecimalFormat("0.####");
        txt_valorCm.setText(String.valueOf(df.format(venda/totalcm)));
    }//GEN-LAST:event_txt_porcentagemKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alterar_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alterar_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alterar_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alterar_Materiais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alterar_Materiais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField txt_altura;
    public static javax.swing.JTextField txt_cod;
    public javax.swing.JTextField txt_cor;
    public javax.swing.JTextField txt_espessura;
    public javax.swing.JTextField txt_largura;
    public javax.swing.JTextField txt_nome;
    public javax.swing.JTextField txt_porcentagem;
    public javax.swing.JTextField txt_precoCompra;
    public javax.swing.JTextField txt_precoVenda;
    public javax.swing.JTextField txt_total;
    public javax.swing.JTextField txt_totalCm;
    public javax.swing.JTextField txt_valorCm;
    // End of variables declaration//GEN-END:variables
}