/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import BLL.ServicosBLL;
import DTO.ServicosDTO;
import static Telas.Cadastro_Servicos.tb_servico;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Alterar_Servico extends javax.swing.JFrame {

    /**
     * Creates new form Alterar_Servico
     */
    public Alterar_Servico() {
        initComponents();
    }
public void preencherTabela(){
        
        tb_servico.getColumnModel().getColumn(0).setPreferredWidth(50);
        tb_servico.getColumnModel().getColumn(0).setMaxWidth(50);
        tb_servico.getColumnModel().getColumn(0).setMinWidth(50);
        
        tb_servico.getColumnModel().getColumn(1).setPreferredWidth(150);
        tb_servico.getColumnModel().getColumn(1).setMaxWidth(150);
        tb_servico.getColumnModel().getColumn(1).setMinWidth(150);
        
        tb_servico.getColumnModel().getColumn(2).setPreferredWidth(150);
        tb_servico.getColumnModel().getColumn(2).setMaxWidth(150);
        tb_servico.getColumnModel().getColumn(2).setMinWidth(150);
        
        tb_servico.getColumnModel().getColumn(3).setPreferredWidth(150);
        tb_servico.getColumnModel().getColumn(3).setMaxWidth(150);
        tb_servico.getColumnModel().getColumn(3).setMinWidth(150);
        
        ServicosBLL rg = new ServicosBLL();
        tb_servico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel) tb_servico.getModel();
        modelo.setNumRows(0);
        
        for(ServicosDTO sdto:rg.listarServico()){
         modelo.addRow(new Object[]{
                sdto.getId_servico(),
                sdto.getNome(),
                sdto.getQuantidade(),
                sdto.getValor()
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

        jLabel1 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_servico = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_quantd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código");

        txt_cod.setEnabled(false);

        jLabel2.setText("Serviço");

        txt_servico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laser", "Fresa", "Impressão", "Produçao" }));

        jLabel3.setText("Quantidade");

        jLabel4.setText("Valor");

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
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_valor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addComponent(txt_quantd, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btn_cadastrar))
                .addContainerGap(565, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_quantd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btn_cadastrar)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        ServicosBLL rg = new ServicosBLL();
        ServicosDTO servicosDTO = new ServicosDTO();
        if(!txt_servico.getSelectedItem().equals("")&&
                !txt_quantd.getText().equals("")&&
                !txt_valor.getText().equals("")
                ){
                int id = Integer.parseInt(txt_cod.getText());
                servicosDTO.setId_servico(id);
                servicosDTO.setNome(txt_servico.getSelectedItem().toString());
                servicosDTO.setQuantidade(Integer.parseInt(txt_quantd.getText()));
                servicosDTO.setValor(Double.parseDouble(txt_valor.getText().replace(",", ".")));
     
                    rg.alterar(servicosDTO);
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
                    preencherTabela();
                    this.dispose();          
        }else{       
            JOptionPane.showMessageDialog(null, "Campos vazios!");                
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Alterar_Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alterar_Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alterar_Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alterar_Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alterar_Servico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JTextField txt_cod;
    public static javax.swing.JTextField txt_quantd;
    public static javax.swing.JComboBox<String> txt_servico;
    public static javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
   
}