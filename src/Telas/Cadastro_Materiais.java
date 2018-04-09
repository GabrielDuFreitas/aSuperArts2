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
public class Cadastro_Materiais extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cadastro_Materiais
     */
    public Cadastro_Materiais() {
        initComponents();
        preencherTabela();
    }
public void preencherTabela(){
        
        this.tb_material.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.tb_material.getColumnModel().getColumn(0).setMaxWidth(50);
        this.tb_material.getColumnModel().getColumn(0).setMinWidth(50);
        
        this.tb_material.getColumnModel().getColumn(1).setPreferredWidth(350);
        this.tb_material.getColumnModel().getColumn(1).setMaxWidth(350);
        this.tb_material.getColumnModel().getColumn(1).setMinWidth(350);
        
        this.tb_material.getColumnModel().getColumn(2).setPreferredWidth(120);
        this.tb_material.getColumnModel().getColumn(2).setMaxWidth(120);
        this.tb_material.getColumnModel().getColumn(2).setMinWidth(120);
        
        this.tb_material.getColumnModel().getColumn(3).setPreferredWidth(180);
        this.tb_material.getColumnModel().getColumn(3).setMaxWidth(180);
        this.tb_material.getColumnModel().getColumn(3).setMinWidth(180);
        
        this.tb_material.getColumnModel().getColumn(4).setPreferredWidth(150);
        this.tb_material.getColumnModel().getColumn(4).setMaxWidth(150);
        this.tb_material.getColumnModel().getColumn(4).setMinWidth(150);
        
        this.tb_material.getColumnModel().getColumn(5).setPreferredWidth(150);
        this.tb_material.getColumnModel().getColumn(5).setMaxWidth(150);
        this.tb_material.getColumnModel().getColumn(5).setMinWidth(150);
        
        this.tb_material.getColumnModel().getColumn(6).setPreferredWidth(170);
        this.tb_material.getColumnModel().getColumn(6).setMaxWidth(170);
        this.tb_material.getColumnModel().getColumn(6).setMinWidth(170);
        
        this.tb_material.getColumnModel().getColumn(7).setPreferredWidth(80);
        this.tb_material.getColumnModel().getColumn(7).setMaxWidth(80);
        this.tb_material.getColumnModel().getColumn(7).setMinWidth(80);
        
        this.tb_material.getColumnModel().getColumn(8).setPreferredWidth(170);
        this.tb_material.getColumnModel().getColumn(8).setMaxWidth(170);
        this.tb_material.getColumnModel().getColumn(8).setMinWidth(170);
        
        this.tb_material.getColumnModel().getColumn(9).setPreferredWidth(200);
        this.tb_material.getColumnModel().getColumn(9).setMaxWidth(200);
        this.tb_material.getColumnModel().getColumn(9).setMinWidth(200);
        
        MateriaisBLL rg = new MateriaisBLL();
        this.tb_material.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel modelo = (DefaultTableModel) tb_material.getModel();
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

        popupMaterial = new javax.swing.JPopupMenu();
        Excluir = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txt_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_espessura = new javax.swing.JTextField();
        txt_altura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_largura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_cor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_precoCompra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_porcentagem = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_totalCm = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_precoVenda = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_valorcm = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_material = new javax.swing.JTable();

        Excluir.setText("jMenuItem1");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        popupMaterial.add(Excluir);

        Editar.setText("jMenuItem2");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        popupMaterial.add(Editar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("aSuperArts - Manutenção de Materiais");
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Espessura");

        txt_espessura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_espessura.setToolTipText("ex: 2mm");

        txt_altura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_altura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_alturaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_alturaKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Altura");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Largura");

        txt_largura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_largura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_larguraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_larguraKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Cor");

        txt_cor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Preço de Compra");

        txt_precoCompra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_precoCompra.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_precoCompra.setText("0.0");
        txt_precoCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_precoCompraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precoCompraKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Porcentagem");

        txt_porcentagem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_porcentagem.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_porcentagem.setText("0");
        txt_porcentagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_porcentagemKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_porcentagemKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Total cm²");

        txt_totalCm.setEditable(false);
        txt_totalCm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Preço de Venda");

        txt_precoVenda.setEditable(false);
        txt_precoVenda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_precoVenda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_precoVenda.setText("0.0");
        txt_precoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_precoVendaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_precoVendaKeyReleased(evt);
            }
        });

        btn_cadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Total ");

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_total.setText("0.0");
        txt_total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_totalKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Valor cm²");

        txt_valorcm.setEditable(false);
        txt_valorcm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_valorcm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorcmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_precoCompra))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(txt_porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(txt_precoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_valorcm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_espessura, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_largura, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_totalCm, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_cadastrar))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_espessura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_largura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_totalCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_valorcm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precoVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_porcentagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precoCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(btn_cadastrar)
                .addGap(3, 3, 3))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        tb_material.setAutoCreateRowSorter(true);
        tb_material.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Espessura ", "Cor", "Altura", "Largura", "Preço Compra", "%", "Total", "Preço Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_material.getTableHeader().setReorderingAllowed(false);
        tb_material.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_materialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_material);
        if (tb_material.getColumnModel().getColumnCount() > 0) {
            tb_material.getColumnModel().getColumn(0).setResizable(false);
            tb_material.getColumnModel().getColumn(1).setResizable(false);
            tb_material.getColumnModel().getColumn(2).setResizable(false);
            tb_material.getColumnModel().getColumn(3).setResizable(false);
            tb_material.getColumnModel().getColumn(4).setResizable(false);
            tb_material.getColumnModel().getColumn(5).setResizable(false);
            tb_material.getColumnModel().getColumn(6).setResizable(false);
            tb_material.getColumnModel().getColumn(7).setResizable(false);
            tb_material.getColumnModel().getColumn(8).setResizable(false);
            tb_material.getColumnModel().getColumn(9).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Editar", jPanel3);

        getContentPane().add(jTabbedPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_alturaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_alturaKeyReleased
        Double altura = Double.valueOf(txt_altura.getText());
        Double largura = Double.valueOf(txt_largura.getText());
        txt_totalCm.setText(String.valueOf(altura * largura).replace(",", "."));
        
        Double venda = Double.valueOf(txt_precoVenda.getText());
        Double totalcm = Double.valueOf(txt_totalCm.getText());
        txt_valorcm.setText(String.valueOf(venda/totalcm));
    }//GEN-LAST:event_txt_alturaKeyReleased

    private void txt_larguraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_larguraKeyReleased
        Double altura = Double.valueOf(txt_altura.getText());
        Double largura = Double.valueOf(txt_largura.getText());
        txt_totalCm.setText(String.valueOf(altura * largura).replace(",", "."));
        
        Double venda = Double.valueOf(txt_precoVenda.getText());
        Double totalcm = Double.valueOf(txt_totalCm.getText());
        txt_valorcm.setText(String.valueOf(venda/totalcm));
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
        txt_valorcm.setText(String.valueOf(venda/totalcm));
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
        txt_valorcm.setText(String.valueOf(df.format(venda/totalcm)));
    }//GEN-LAST:event_txt_porcentagemKeyReleased

    private void txt_totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_totalKeyReleased
        
    }//GEN-LAST:event_txt_totalKeyReleased

    private void txt_precoVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precoVendaKeyReleased
            
    }//GEN-LAST:event_txt_precoVendaKeyReleased

    private void txt_precoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precoVendaKeyPressed
    
    }//GEN-LAST:event_txt_precoVendaKeyPressed

    private void txt_valorcmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorcmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorcmActionPerformed
    
    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        MateriaisBLL rg = new MateriaisBLL();
        MateriaisDTO materiaisDTO = new MateriaisDTO();
        
        materiaisDTO.setNome(txt_nome.getText());
        materiaisDTO.setEspessura(txt_espessura.getText());
        materiaisDTO.setCor(txt_cor.getText());
        materiaisDTO.setAltura(Double.parseDouble(txt_altura.getText().replace(",", ".")));
        materiaisDTO.setLargura(Double.parseDouble(txt_largura.getText().replace(",", ".")));
        materiaisDTO.setPrecocompra(Double.parseDouble(txt_precoCompra.getText().replace(",", ".")));
        materiaisDTO.setPorcentagem(Integer.parseInt(txt_porcentagem.getText().replace(",", ".")));
        materiaisDTO.setTotal(Double.parseDouble(txt_total.getText().replace(",", ".")));
        materiaisDTO.setPrecovenda(Double.parseDouble(txt_precoVenda.getText().replace(",", ".")));
        
        rg.inserir(materiaisDTO);
        JOptionPane.showMessageDialog(null, "Material cadastrado");
        preencherTabela();
        txt_nome.setText("");
        txt_espessura.setText("");
        txt_cor.setText("");
        txt_altura.setText("");
        txt_largura.setText("");
        txt_precoCompra.setText("");
        txt_porcentagem.setText("");
        txt_total.setText("");
        txt_precoVenda.setText("");
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        MateriaisBLL rg = new MateriaisBLL();
        MateriaisDTO m = new MateriaisDTO();
        if (this.tb_material.getSelectedRowCount() > 0) {
            int linha = this.tb_material.getSelectedRow();
            m.setId_material((int) this.tb_material.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir?");
            if (resposta == JOptionPane.YES_OPTION) {
                rg.ExcluirMaterial(m);
                preencherTabela();
                JOptionPane.showMessageDialog(null, "Excluído!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha!");
        }
    }//GEN-LAST:event_ExcluirActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        MateriaisDTO materiaisDTO = new MateriaisDTO();
        MateriaisBLL rg = new MateriaisBLL();
        if (this.tb_material.getSelectedRowCount() > 0) {
            int linha = tb_material.getSelectedRow();
            materiaisDTO.setId_material((int) this.tb_material.getValueAt(linha, 0));
            int resposta = 0;
            resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo editar?");
            if (resposta == JOptionPane.YES_OPTION) {
                
                     Alterar_Materiais alterar_Materiais =new Alterar_Materiais();
                    alterar_Materiais.setSize(700, 500);
                    alterar_Materiais.setVisible(true);
                    alterar_Materiais.txt_cod.setText(tb_material.getModel().getValueAt(linha, 0).toString()); 
                    alterar_Materiais.txt_nome.setText(tb_material.getModel().getValueAt(linha, 1).toString());
                    alterar_Materiais.txt_espessura.setText(tb_material.getModel().getValueAt(linha, 2).toString());
                    alterar_Materiais.txt_cor.setText(tb_material.getModel().getValueAt(linha, 3).toString());
                    alterar_Materiais.txt_altura.setText(tb_material.getModel().getValueAt(linha, 4).toString());
                    alterar_Materiais.txt_largura.setText(tb_material.getModel().getValueAt(linha, 5).toString());
                    alterar_Materiais.txt_precoCompra.setText(tb_material.getModel().getValueAt(linha, 6).toString());
                    alterar_Materiais.txt_porcentagem.setText(tb_material.getModel().getValueAt(linha, 7).toString());
                    alterar_Materiais.txt_total.setText(tb_material.getModel().getValueAt(linha, 8).toString());
                    alterar_Materiais.txt_precoVenda.setText(tb_material.getModel().getValueAt(linha, 9).toString());
            }
            
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma linha!");

             }
              
    }//GEN-LAST:event_EditarActionPerformed

    private void tb_materialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_materialMouseClicked
        // TODO add your handling code here:
        MateriaisDTO materiaisDTO = new MateriaisDTO();
            if(this.tb_material.getSelectedRow() >0){
                int linha = tb_material.getSelectedRow();
                materiaisDTO.setId_material((int) this.tb_material.getValueAt(linha, 0));
                int resposta = 0;
                resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo Alterar?");
                if(resposta == JOptionPane.YES_OPTION){
                    
                    Alterar_Materiais alterar_Materiais =new Alterar_Materiais();
                    alterar_Materiais.setSize(700, 500);
                    alterar_Materiais.setVisible(true);
                    alterar_Materiais.txt_cod.setText(tb_material.getModel().getValueAt(linha, 0).toString()); 
                    alterar_Materiais.txt_nome.setText(tb_material.getModel().getValueAt(linha, 1).toString());
                    alterar_Materiais.txt_espessura.setText(tb_material.getModel().getValueAt(linha, 2).toString());
                    alterar_Materiais.txt_cor.setText(tb_material.getModel().getValueAt(linha, 3).toString());
                    alterar_Materiais.txt_altura.setText(tb_material.getModel().getValueAt(linha, 4).toString());
                    alterar_Materiais.txt_largura.setText(tb_material.getModel().getValueAt(linha, 5).toString());
                    alterar_Materiais.txt_precoCompra.setText(tb_material.getModel().getValueAt(linha, 6).toString());
                    alterar_Materiais.txt_porcentagem.setText(tb_material.getModel().getValueAt(linha, 7).toString());
                    alterar_Materiais.txt_total.setText(tb_material.getModel().getValueAt(linha, 8).toString());
                    alterar_Materiais.txt_precoVenda.setText(tb_material.getModel().getValueAt(linha, 9).toString());
                    
                    
               }
            }
    }//GEN-LAST:event_tb_materialMouseClicked

    private void txt_alturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_alturaKeyTyped
        String caracteres="0987654321,.";
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txt_alturaKeyTyped

    private void txt_larguraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_larguraKeyTyped
        String caracteres="0987654321,.";
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txt_larguraKeyTyped

    private void txt_precoCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precoCompraKeyTyped
        String caracteres="0987654321,.";
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txt_precoCompraKeyTyped

    private void txt_porcentagemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_porcentagemKeyTyped
        String caracteres="0987654321,.";
        if(!caracteres.contains(evt.getKeyChar()+"")){
        evt.consume();
        }
    }//GEN-LAST:event_txt_porcentagemKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JMenuItem Excluir;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPopupMenu popupMaterial;
    public static javax.swing.JTable tb_material;
    private javax.swing.JTextField txt_altura;
    private javax.swing.JTextField txt_cor;
    private javax.swing.JTextField txt_espessura;
    private javax.swing.JTextField txt_largura;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_porcentagem;
    private javax.swing.JTextField txt_precoCompra;
    private javax.swing.JTextField txt_precoVenda;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_totalCm;
    private javax.swing.JTextField txt_valorcm;
    // End of variables declaration//GEN-END:variables
}