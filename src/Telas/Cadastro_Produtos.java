/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import BLL.ProdutosBLL;
import DTO.ProdutosDTO;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Cadastro_Produtos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Produtos
     */
    public Cadastro_Produtos() {
        initComponents();
        preencherTabela();
    }
public void preencherTabela(){
        
        this.tb_produtos.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.tb_produtos.getColumnModel().getColumn(0).setMaxWidth(50);
        this.tb_produtos.getColumnModel().getColumn(0).setMinWidth(50);
        
        this.tb_produtos.getColumnModel().getColumn(1).setPreferredWidth(300);
        this.tb_produtos.getColumnModel().getColumn(1).setMaxWidth(300);
        this.tb_produtos.getColumnModel().getColumn(1).setMinWidth(300);
        
        this.tb_produtos.getColumnModel().getColumn(2).setPreferredWidth(200);
        this.tb_produtos.getColumnModel().getColumn(2).setMaxWidth(200);
        this.tb_produtos.getColumnModel().getColumn(2).setMinWidth(200);
        
        this.tb_produtos.getColumnModel().getColumn(3).setPreferredWidth(120);
        this.tb_produtos.getColumnModel().getColumn(3).setMaxWidth(120);
        this.tb_produtos.getColumnModel().getColumn(3).setMinWidth(120);
        
        this.tb_produtos.getColumnModel().getColumn(4).setPreferredWidth(120);
        this.tb_produtos.getColumnModel().getColumn(4).setMaxWidth(120);
        this.tb_produtos.getColumnModel().getColumn(4).setMinWidth(120);
        
        this.tb_produtos.getColumnModel().getColumn(5).setPreferredWidth(120);
        this.tb_produtos.getColumnModel().getColumn(5).setMaxWidth(120);
        this.tb_produtos.getColumnModel().getColumn(5).setMinWidth(120);
        
        this.tb_produtos.getColumnModel().getColumn(6).setPreferredWidth(120);
        this.tb_produtos.getColumnModel().getColumn(6).setMaxWidth(120);
        this.tb_produtos.getColumnModel().getColumn(6).setMinWidth(120);
        
        this.tb_produtos.getColumnModel().getColumn(7).setPreferredWidth(120);
        this.tb_produtos.getColumnModel().getColumn(7).setMaxWidth(120);
        this.tb_produtos.getColumnModel().getColumn(7).setMinWidth(120);
        
        this.tb_produtos.getColumnModel().getColumn(8).setPreferredWidth(100);
        this.tb_produtos.getColumnModel().getColumn(8).setMaxWidth(100);
        this.tb_produtos.getColumnModel().getColumn(8).setMinWidth(100);
        
        ProdutosBLL rg = new ProdutosBLL();
        this.tb_produtos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel) tb_produtos.getModel();
        modelo.setNumRows(0);
        
        for(ProdutosDTO pdto:rg.listarProduto()){
         modelo.addRow(new Object[]{
                pdto.getId_produto(),
                pdto.getNome(),
                pdto.getCor(),
                pdto.getQuantidade(),
                pdto.getEspessura(),              
                pdto.getAltura(),
                pdto.getLargura(),
                pdto.getComprimento(),
                pdto.getValor()
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        Excluir = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_altura = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        txt_qntd = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_largura = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_espessura = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_cor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_comprimento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_produtos = new javax.swing.JTable();

        Excluir.setText("jMenuItem1");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Excluir);

        Editar.setText("jMenuItem2");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(Editar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel12.setText("Código");

        txt_cod.setEnabled(false);

        jLabel13.setText("Nome");

        jLabel14.setText("Altura");

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        jLabel17.setText("Quantidade");

        jLabel18.setText("Largura");

        jLabel20.setText("Espessura");

        jLabel21.setText("Cor");

        jLabel1.setText("Comprimento");

        jLabel2.setText("Valor");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_qntd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_espessura, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txt_largura, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_comprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel12)
                    .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrar))
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_espessura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_qntd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_largura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_comprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btn_cadastrar)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel2);

        tb_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cor", "Quantidade", "Espessura", "Altura", "Largura", "Comprimento", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_produtosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tb_produtosMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tb_produtos);
        if (tb_produtos.getColumnModel().getColumnCount() > 0) {
            tb_produtos.getColumnModel().getColumn(0).setResizable(false);
            tb_produtos.getColumnModel().getColumn(1).setResizable(false);
            tb_produtos.getColumnModel().getColumn(2).setResizable(false);
            tb_produtos.getColumnModel().getColumn(3).setResizable(false);
            tb_produtos.getColumnModel().getColumn(4).setResizable(false);
            tb_produtos.getColumnModel().getColumn(5).setResizable(false);
            tb_produtos.getColumnModel().getColumn(6).setResizable(false);
            tb_produtos.getColumnModel().getColumn(7).setResizable(false);
            tb_produtos.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Editar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        ProdutosBLL rg = new ProdutosBLL();
       ProdutosDTO produtosDTO = new ProdutosDTO();
        
        produtosDTO.setNome(txt_nome.getText());
        produtosDTO.setCor(txt_cor.getText());
        produtosDTO.setQuantidade(Integer.parseInt(txt_qntd.getText()));
        produtosDTO.setEspessura(txt_espessura.getText());
        produtosDTO.setAltura(txt_altura.getText());
        produtosDTO.setLargura(txt_largura.getText());
        produtosDTO.setComprimento(txt_comprimento.getText());
        produtosDTO.setValor(Double.parseDouble(txt_valor.getText()));
        rg.inserir(produtosDTO);
        JOptionPane.showMessageDialog(null, "Produto Cadastrado" );
        preencherTabela();
        txt_nome.setText("");
        txt_cor.setText("");
        txt_qntd.setText("");
        txt_espessura.setText("");
        txt_altura.setText("");
        txt_largura.setText("");
        txt_comprimento.setText("");
        txt_valor.setText("");
    
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void tb_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_produtosMouseClicked
        ProdutosDTO produtosDTO = new ProdutosDTO();
        if (evt.getClickCount() == 2) {             
            if (tb_produtos.getSelectedRowCount() > 0) {
            int linha = tb_produtos.getSelectedRow();
            produtosDTO.setId_produto((int) tb_produtos.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "deseja mesmo alterar?");
            if (resposta == JOptionPane.YES_OPTION) {
                
                Alterar_Produtos alterar_Produtos = new Alterar_Produtos();
                alterar_Produtos.setSize(700, 500);
                alterar_Produtos.setVisible(true);
                Alterar_Produtos.txt_cod.setText(tb_produtos.getModel().getValueAt(linha, 0).toString());
                Alterar_Produtos.txt_nome.setText(tb_produtos.getModel().getValueAt(linha, 1).toString());
                Alterar_Produtos.txt_cor.setText(tb_produtos.getModel().getValueAt(linha, 2).toString());
                Alterar_Produtos.txt_qntd.setText(tb_produtos.getModel().getValueAt(linha, 3).toString());
                Alterar_Produtos.txt_espessura.setText(tb_produtos.getModel().getValueAt(linha, 4).toString());
                Alterar_Produtos.txt_altura.setText(tb_produtos.getModel().getValueAt(linha, 5).toString());
                Alterar_Produtos.txt_largura.setText(tb_produtos.getModel().getValueAt(linha, 6).toString());
                Alterar_Produtos.txt_comprimento.setText(tb_produtos.getModel().getValueAt(linha, 7).toString());
                Alterar_Produtos.txt_valor.setText(tb_produtos.getModel().getValueAt(linha, 8).toString());
            }
            
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma linha!");

             }  
        }
    }//GEN-LAST:event_tb_produtosMouseClicked

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
         ProdutosDTO p = new ProdutosDTO();
         ProdutosBLL produtosBLL = new ProdutosBLL();
        if (this.tb_produtos.getSelectedRowCount() > 0) {
            int linha = this.tb_produtos.getSelectedRow();
            p.setId_produto((int) this.tb_produtos.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir?");
            if (resposta == JOptionPane.YES_OPTION) {
                produtosBLL.ExcluirProduto(p);
                preencherTabela();
                JOptionPane.showMessageDialog(null, "Excluído!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        ProdutosDTO produtosDTO = new ProdutosDTO();
        ProdutosBLL rg = new ProdutosBLL();
        if (this.tb_produtos.getSelectedRowCount() > 0) {
            int linha = tb_produtos.getSelectedRow();
            produtosDTO.setId_produto((int) this.tb_produtos.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo editar?");
            if (resposta == JOptionPane.YES_OPTION) {
                
                Alterar_Produtos alterar_Produtos = new Alterar_Produtos();
                alterar_Produtos.setSize(700, 500);
                alterar_Produtos.setVisible(true);
                Alterar_Produtos.txt_cod.setText(tb_produtos.getModel().getValueAt(linha, 0).toString());
                Alterar_Produtos.txt_nome.setText(tb_produtos.getModel().getValueAt(linha, 1).toString());
                Alterar_Produtos.txt_cor.setText(tb_produtos.getModel().getValueAt(linha, 2).toString());
                Alterar_Produtos.txt_qntd.setText(tb_produtos.getModel().getValueAt(linha, 3).toString());
                Alterar_Produtos.txt_espessura.setText(tb_produtos.getModel().getValueAt(linha, 4).toString());
                Alterar_Produtos.txt_altura.setText(tb_produtos.getModel().getValueAt(linha, 5).toString());
                Alterar_Produtos.txt_largura.setText(tb_produtos.getModel().getValueAt(linha, 6).toString());
                Alterar_Produtos.txt_comprimento.setText(tb_produtos.getModel().getValueAt(linha, 7).toString());
                Alterar_Produtos.txt_valor.setText(tb_produtos.getModel().getValueAt(linha, 8).toString());
            }
            
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma linha!");

             } 
    }//GEN-LAST:event_EditarActionPerformed

    private void tb_produtosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_produtosMouseReleased
        if(evt.isPopupTrigger()){
            jPopupMenu1.show(this, evt.getX(), 105);
            Excluir.setText("Excluir Produto");
            Editar.setText("Editar Produto");
            
        }
    }//GEN-LAST:event_tb_produtosMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Excluir;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JTable tb_produtos;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_comprimento;
    private javax.swing.JTextField txt_cor;
    private javax.swing.JTextField txt_espessura;
    private javax.swing.JTextField txt_largura;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_qntd;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
