/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_valorcm = new javax.swing.JTextField();

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
        });

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Total cm²");

        txt_totalCm.setEditable(false);
        txt_totalCm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_totalCm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_totalCmKeyReleased(evt);
            }
        });

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

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Cadastrar");

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
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jButton1)))
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
                .addComponent(jButton1)
                .addGap(3, 3, 3))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

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
        txt_total.setText(String.valueOf(valor_compra * porcentagem).replace(",", "."));
        
        Double total = Double.valueOf(txt_total.getText());
        Double compra = Double.valueOf(txt_precoCompra.getText());
        txt_precoVenda.setText(String.valueOf(total + compra).replace(",", "."));
        
        Double venda = Double.valueOf(txt_precoVenda.getText());
        Double totalcm = Double.valueOf(txt_totalCm.getText());
        txt_valorcm.setText(String.valueOf(venda/totalcm));
    }//GEN-LAST:event_txt_porcentagemKeyReleased

    private void txt_totalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_totalKeyReleased
        
    }//GEN-LAST:event_txt_totalKeyReleased

    private void txt_precoVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precoVendaKeyReleased
            
    }//GEN-LAST:event_txt_precoVendaKeyReleased

    private void txt_precoVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precoVendaKeyPressed
    
    }//GEN-LAST:event_txt_precoVendaKeyPressed

    private void txt_totalCmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_totalCmKeyReleased
        Double venda = Double.valueOf(txt_precoVenda.getText());
        Double totalcm = Double.valueOf(txt_totalCm.getText());
        txt_valorcm.setText(String.valueOf(venda/totalcm));
    }//GEN-LAST:event_txt_totalCmKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
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
