/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Outros;

import Controle.ControleCliente;
import Controle.ControleFuncionario;
import Controle.ControleVenda;
import Modelo.BEAN.Cliente;
import Modelo.BEAN.ObjetoVenda;
import Modelo.BEAN.Venda;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos
 */
public class FRMFinalizarVenda extends javax.swing.JFrame {

    private Venda venda;
    private List<Cliente> clientes;
    private Cliente clienteSelecionado;

    /**
     * Creates new form FRMFinalizarVenda
     */
    public FRMFinalizarVenda() {
        initComponents();

        clienteSelecionado = null;

        try {
            clientes = ControleCliente.listarTodosAtivos();
            this.preencheTabelaCliente();
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfDesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnFinalizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfAcr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbOpc = new javax.swing.JComboBox<>();
        tfDado = new javax.swing.JTextField();
        btnLocalizarCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCliente = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finalizar Venda");

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Total da venda:");

        tfTotal.setEditable(false);
        tfTotal.setEnabled(false);

        jLabel2.setText("Desconto:");

        tfDesc.setText("0.00");
        tfDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDescFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDescFocusLost(evt);
            }
        });
        tfDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDescKeyTyped(evt);
            }
        });

        jLabel6.setText("Forma de pagamento:");

        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cheque", "Cartão", "Não Pago" }));

        btnFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/FinalVenda.png"))); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/Cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("Acréscimo:");

        tfAcr.setText("0.00");
        tfAcr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfAcrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAcrFocusLost(evt);
            }
        });
        tfAcr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAcrKeyTyped(evt);
            }
        });

        jLabel8.setText("Localizar Cliente por:");

        cbOpc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listar Todos", "Código", "Nome" }));
        cbOpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcActionPerformed(evt);
            }
        });

        tfDado.setForeground(new java.awt.Color(153, 153, 153));
        tfDado.setText("Insira o dado para pesquisa...");
        tfDado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfDadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDadoFocusLost(evt);
            }
        });
        tfDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDadoActionPerformed(evt);
            }
        });

        btnLocalizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/CliLoc.png"))); // NOI18N
        btnLocalizarCliente.setText("Localizar");
        btnLocalizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarClienteActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Lista de Clientes:"));

        tableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCliente);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel9.setText("Código:");

        jLabel10.setText("Nome:");

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/logout.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF:");

        jLabel4.setText("Cliente Selecionado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(26, 26, 26)
                                                .addComponent(lblCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(8, 8, 8))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbOpc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLocalizarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfAcr, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btnFinalizar)
                .addGap(40, 40, 40)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfAcr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnFinalizar)
                    .addComponent(btnVoltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDescFocusGained
        tfDesc.selectAll();
    }//GEN-LAST:event_tfDescFocusGained

    private void tfAcrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAcrFocusGained
        tfAcr.selectAll();
    }//GEN-LAST:event_tfAcrFocusGained

    private void tfDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDescFocusLost
        try {
            if (tfDesc.getText().equals("")) {
                tfDesc.setText("0.00");
            } else {
                String desc = tfDesc.getText();

                if (desc.contains(",")) {
                    String[] parts = desc.split(",");
                    String part1 = parts[0];
                    String part2 = parts[1];

                    desc = part1 + "." + part2;
                }

                float f = Float.parseFloat(desc);
                tfDesc.setText(desc);
            }
        } catch (NumberFormatException e) {
            tfDesc.setText("0.00");
            JOptionPane.showMessageDialog(null, "Formato inválido!");
        } finally {
            this.calculaValorTotal();
        }
    }//GEN-LAST:event_tfDescFocusLost

    private void tfAcrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAcrFocusLost
        try {
            if (tfAcr.getText().equals("")) {
                tfAcr.setText("0.00");
            } else {
                String acr = tfAcr.getText();

                if (acr.contains(",")) {
                    String[] parts = acr.split(",");
                    String part1 = parts[0];
                    String part2 = parts[1];

                    acr = part1 + "." + part2;
                }

                float f = Float.parseFloat(acr);
                tfAcr.setText(acr);
            }
        } catch (NumberFormatException e) {
            tfAcr.setText("0.00");
            JOptionPane.showMessageDialog(null, "Formato inválido!");
        } finally {
            this.calculaValorTotal();
        }
    }//GEN-LAST:event_tfAcrFocusLost

    private void tfDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescKeyTyped
        String caracteres = "0987654321.,";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfDescKeyTyped

    private void tfAcrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAcrKeyTyped
        String caracteres = "0987654321.,";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfAcrKeyTyped

    private void cbOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcActionPerformed
        if (cbOpc.getSelectedIndex() == 0) {
            try {
                clientes = ControleCliente.listarTodosAtivos();
                this.preencheTabelaCliente();

                if (clienteSelecionado == null) {
                    clienteSelecionado = clientes.get(0);
                    this.preencheDados();
                }

            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
            }
        }
    }//GEN-LAST:event_cbOpcActionPerformed

    private void tfDadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDadoFocusGained
        if (tfDado.getText().equals("Insira o dado para pesquisa...")) {
            tfDado.setText("");
            tfDado.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfDadoFocusGained

    private void tfDadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDadoFocusLost
        if (tfDado.getText().equals("")) {
            tfDado.setText("Insira o dado para pesquisa...");
            tfDado.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfDadoFocusLost

    private void tfDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDadoActionPerformed
        this.localiza();
    }//GEN-LAST:event_tfDadoActionPerformed

    private void btnLocalizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarClienteActionPerformed
        this.localiza();
    }//GEN-LAST:event_btnLocalizarClienteActionPerformed

    private void tableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableClienteMouseClicked
        int qnt = tableCliente.getSelectedColumnCount();

        if (qnt < 1) {

        } else if (qnt > 1) {

        } else {
            clienteSelecionado = clientes.get(tableCliente.getSelectedRow());
            this.preencheDados();
        }
    }//GEN-LAST:event_tableClienteMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FRMVenda v = new FRMVenda();

        v.pegaVenda(venda);

        v.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if (clienteSelecionado == null) {
            JOptionPane.showMessageDialog(null, "Escolha um cliente da tabela acima.");
        } else {
            venda.setCliente(clienteSelecionado);
            venda.setFuncionario(ControleFuncionario.getFuncionarioLogado());

            String acr = tfAcr.getText();

            if (acr.contains(",")) {
                String[] parts = acr.split(",");
                String part1 = parts[0];
                String part2 = parts[1];

                acr = part1 + "." + part2;
            }
            venda.setAcrescimo(Float.parseFloat(acr));

            String desc = tfDesc.getText();

            if (desc.contains(",")) {
                String[] parts = desc.split(",");
                String part1 = parts[0];
                String part2 = parts[1];

                desc = part1 + "." + part2;
            }
            venda.setDesconto(Float.parseFloat(desc));

            if (cbFormaPagamento.getSelectedIndex() == 0) {
                venda.setFormaPagamento(Venda.FormasDePagamento.DINHEIRO);
            } else if (cbFormaPagamento.getSelectedIndex() == 1) {
                venda.setFormaPagamento(Venda.FormasDePagamento.CHEQUE);
            } else if (cbFormaPagamento.getSelectedIndex() == 2) {
                venda.setFormaPagamento(Venda.FormasDePagamento.CARTAO);
            } else if (cbFormaPagamento.getSelectedIndex() == 3) {
                venda.setFormaPagamento(Venda.FormasDePagamento.NAOPAGO);
            }

            venda.setDataHora(new Date());

            if (venda.getFormaPagamento().equals(Venda.FormasDePagamento.NAOPAGO)) {
                venda.setSituacao(Venda.Situacao.NAOPAGO);
                venda.setDataPagamento(null);
            } else {
                venda.setSituacao(Venda.Situacao.PAGO);
                venda.setDataPagamento(new Date());
            }

            try {
                ControleVenda.insereVendaEItens(venda);
                JOptionPane.showMessageDialog(null, "Venda feita com sucesso!");

                this.sair();
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
            }
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int opc = JOptionPane.showConfirmDialog(null, "Tem certeza que quer sair? Qualquer dado preenchido será perdido!");

        if (opc == 0) {
            this.sair();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FRMFinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMFinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMFinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMFinalizarVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMFinalizarVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLocalizarCliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JComboBox<String> cbOpc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTable tableCliente;
    private javax.swing.JTextField tfAcr;
    private javax.swing.JTextField tfDado;
    private javax.swing.JTextField tfDesc;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables

    void pegaVenda(Venda v) {
        this.venda = v;

        this.calculaValorTotal();
    }

    private void localiza() {
        if (cbOpc.getSelectedIndex() == 1) {
            if ((tfDado.getText().equals("")) || (tfDado.getText().equals("Insira o dado para pesquisa..."))) {
                JOptionPane.showMessageDialog(null, "Insira algum dado para pesquisa");
            } else {
                try {
                    clientes = ControleCliente.listarPorCodigoEAtivo(Integer.parseInt(tfDado.getText()));
                    this.preencheTabelaCliente();
                    this.verificaTabela();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Atenção: para pesquisa por código, insira apenas números.");
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
                }
            }
        } else if (cbOpc.getSelectedIndex() == 2) {
            if ((tfDado.getText().equals("")) || (tfDado.getText().equals("Insira o dado para pesquisa..."))) {
                JOptionPane.showMessageDialog(null, "Insira algum dado para pesquisa");
            } else {
                try {
                    clientes = ControleCliente.listarPorNomeEAtivo(tfDado.getText());
                    this.preencheTabelaCliente();
                    this.verificaTabela();
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
                }
            }
        }
    }

    private void preencheTabelaCliente() {
        DefaultTableModel dtm = this.criaTabelaCliente();

        dtm.addColumn("Código");
        dtm.addColumn("nome");

        for (Cliente cliente : clientes) {
            if (cliente.getSituacaoCli().equals(Cliente.SituacaoCli.ATIVO)) {
                dtm.addRow(new Object[]{cliente.getCodigo(), cliente.getNome()});
            }
        }

        tableCliente.setModel(dtm);
    }

    private DefaultTableModel criaTabelaCliente() {
        DefaultTableModel dTable = new DefaultTableModel() {
            //Define o tipo dos campos (coluna) na mesma ordem que as colunas foram criadas
            Class[] types = new Class[]{
                java.lang.Integer.class, //codigo
                java.lang.String.class, //nome
            };

            boolean[] canEdit = new boolean[]{
                false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        ;

        };
        
    return dTable;
    }

    private void verificaTabela() {
        if (tableCliente.getRowCount() == 1) {
            clienteSelecionado = clientes.get(0);
            this.preencheDados();
        }
    }

    private void preencheDados() {
        lblCodigo.setText(clienteSelecionado.getCodigo() + "");
        lblNome.setText(clienteSelecionado.getNome());
        lblCPF.setText(clienteSelecionado.getCpf());

        cbFormaPagamento.requestFocusInWindow();
    }

    private void calculaValorTotal() {
        try {
            float valorTotal = 0;

            for (ObjetoVenda ov : venda.getItensDaVenda()) {
                valorTotal += (ov.getPrecoVendaPraticadoUnidade() * ov.getQtdeVendida());
            }

            String desc = tfDesc.getText();

            if (desc.contains(",")) {
                String[] parts = desc.split(",");
                String part1 = parts[0];
                String part2 = parts[1];

                desc = part1 + "." + part2;
            }

            String acr = tfAcr.getText();

            if (acr.contains(",")) {
                String[] parts = acr.split(",");
                String part1 = parts[0];
                String part2 = parts[1];

                acr = part1 + "." + part2;
            }

            valorTotal -= Float.parseFloat(desc);
            valorTotal += Float.parseFloat(acr);

            tfTotal.setText(valorTotal + "");
        } catch (NumberFormatException e) {

        }
    }

    private void sair() {
        FRMVenda v = new FRMVenda();

        v.setVisible(true);

        this.dispose();
    }
}
