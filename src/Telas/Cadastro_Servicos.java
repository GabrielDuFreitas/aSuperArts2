/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import BLL.ServicosBLL;
import DTO.MateriaisDTO;
import DTO.ServicosDTO;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Cadastro_Servicos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Servicos
     */
    public Cadastro_Servicos() {
        initComponents();
        getRootPane().setDefaultButton(btn_cadastrar);
        preencherTabela();
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

        PopupMenuServico = new javax.swing.JPopupMenu();
        Excluir = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_servico = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txt_qntd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_servico = new javax.swing.JTable();

        Excluir.setText("jMenuItem1");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        PopupMenuServico.add(Excluir);

        Editar.setText("jMenuItem1");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        PopupMenuServico.add(Editar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        txt_cod.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Serviço");

        txt_servico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laser", "Fresa", "Impressão", "Produçao" }));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Quantidade");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Valor");

        btn_cadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_servico, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_valor, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_qntd, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 809, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_cadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_servico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_qntd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cadastrar)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastar", jPanel1);

        tb_servico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Serviço", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_servico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_servicoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tb_servicoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tb_servico);
        if (tb_servico.getColumnModel().getColumnCount() > 0) {
            tb_servico.getColumnModel().getColumn(0).setResizable(false);
            tb_servico.getColumnModel().getColumn(1).setResizable(false);
            tb_servico.getColumnModel().getColumn(2).setResizable(false);
            tb_servico.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Editar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        ServicosBLL rg = new ServicosBLL();
        ServicosDTO servicosDTO = new ServicosDTO();
        if(!txt_servico.getSelectedItem().equals("-") && !txt_qntd.getText().equals("") && !txt_valor.getText().equals("")){
            
        servicosDTO.setNome(txt_servico.getSelectedItem().toString());
        servicosDTO.setQuantidade(Integer.parseInt(txt_qntd.getText()));
        servicosDTO.setValor(Double.parseDouble(txt_valor.getText().replace(",", ".")));
        rg.inserir(servicosDTO);
        preencherTabela();
        txt_servico.setSelectedItem("-");
        txt_qntd.setText("");
        txt_valor.setText("");
        }
                
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void tb_servicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_servicoMouseClicked
        ServicosDTO servicosDTO = new ServicosDTO();
        if (evt.getClickCount() == 2) {             
            if (tb_servico.getSelectedRowCount() > 0) {
            int linha = tb_servico.getSelectedRow();
            servicosDTO.setId_servico((int) tb_servico.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo alterar?");
            if (resposta == JOptionPane.YES_OPTION) {
                
               Alterar_Servico alterar_Servico = new Alterar_Servico();
               alterar_Servico.setSize(700, 500);
               alterar_Servico.setVisible(true);
               Alterar_Servico.txt_cod.setText(tb_servico.getModel().getValueAt(linha, 0).toString());
               Alterar_Servico.txt_servico.setSelectedItem(tb_servico.getModel().getValueAt(linha, 1).toString());
               Alterar_Servico.txt_quantd.setText(tb_servico.getModel().getValueAt(linha, 2).toString());
               Alterar_Servico.txt_valor.setText(tb_servico.getModel().getValueAt(linha, 3).toString());

            }
            
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma linha!");

             }  
        }
    }//GEN-LAST:event_tb_servicoMouseClicked

    private void tb_servicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_servicoMouseReleased
       if(evt.isPopupTrigger()){
            PopupMenuServico.show(this, evt.getX(), 105);
            Excluir.setText("Excluir Serviço");
            Editar.setText("Editar Serviço");
            
        }
    }//GEN-LAST:event_tb_servicoMouseReleased

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
         ServicosDTO s = new ServicosDTO();
         ServicosBLL servicosBLL = new ServicosBLL();
        if (this.tb_servico.getSelectedRowCount() > 0) {
            int linha = this.tb_servico.getSelectedRow();
            s.setId_servico((int) this.tb_servico.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir?");
            if (resposta == JOptionPane.YES_OPTION) {
                servicosBLL.ExcluirServico(s);
                preencherTabela();
                JOptionPane.showMessageDialog(null, "Excluído!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }  
    }//GEN-LAST:event_ExcluirActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        ServicosDTO servicosDTO = new ServicosDTO();
        ServicosBLL rg = new ServicosBLL();
        if (this.tb_servico.getSelectedRowCount() > 0) {
            int linha = tb_servico.getSelectedRow();
            servicosDTO.setId_servico((int) this.tb_servico.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo editar?");
            if (resposta == JOptionPane.YES_OPTION) {
                
                Alterar_Servico alterar_Servico = new Alterar_Servico();
                alterar_Servico.setSize(700, 500);
                alterar_Servico.setVisible(true);
               Alterar_Servico.txt_cod.setText(tb_servico.getModel().getValueAt(linha, 0).toString());
               Alterar_Servico.txt_servico.setSelectedItem(tb_servico.getModel().getValueAt(linha, 1).toString());
               Alterar_Servico.txt_quantd.setText(tb_servico.getModel().getValueAt(linha, 2).toString());
               Alterar_Servico.txt_valor.setText(tb_servico.getModel().getValueAt(linha, 3).toString());
            }
            
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma linha!");

             }
    }//GEN-LAST:event_EditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Excluir;
    private javax.swing.JPopupMenu PopupMenuServico;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable tb_servico;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_qntd;
    private javax.swing.JComboBox<String> txt_servico;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
