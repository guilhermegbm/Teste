/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Outros;

import Controle.ControleFuncionario;
import Visao.Gerenciamento.*;

/**
 *
 * @author Isabella
 */
public class FRMPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FRMPrincipal
     */
    public FRMPrincipal() {
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

        jPanel2 = new javax.swing.JPanel();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnObjeto = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnFuncionario = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFornecimento = new javax.swing.JButton();
        btnSaidaEstoque = new javax.swing.JButton();
        btnCargo = new javax.swing.JButton();
        btnGrupo = new javax.swing.JButton();
        btnSubGrupo = new javax.swing.JButton();
        btnRelatórios = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/Cliente.png"))); // NOI18N
        btnCliente.setText("Gerenciar Clientes");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnObjeto.setBackground(new java.awt.Color(255, 255, 255));
        btnObjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/Produto.png"))); // NOI18N
        btnObjeto.setText("Gerenciar Objetos");
        btnObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjetoActionPerformed(evt);
            }
        });

        btnFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/Fornecedor.png"))); // NOI18N
        btnFornecedor.setText("Gerenciar Fornecedores");
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        btnFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        btnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/Funcionario.png"))); // NOI18N
        btnFuncionario.setText("Gerenciar Funcionarios");
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        btnVenda.setBackground(new java.awt.Color(255, 255, 255));
        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/Venda.png"))); // NOI18N
        btnVenda.setText("Fazer Venda");
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/logout.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 51));
        jLabel3.setText("GreenBuy");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/cash-register.png"))); // NOI18N

        btnFornecimento.setBackground(new java.awt.Color(255, 255, 255));
        btnFornecimento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/EntraMercadoria.png"))); // NOI18N
        btnFornecimento.setText("Registrar fornecimento");
        btnFornecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecimentoActionPerformed(evt);
            }
        });

        btnSaidaEstoque.setBackground(new java.awt.Color(255, 255, 255));
        btnSaidaEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/SaiMercadoria.png"))); // NOI18N
        btnSaidaEstoque.setText("Registrar saida estoque");
        btnSaidaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaEstoqueActionPerformed(evt);
            }
        });

        btnCargo.setBackground(new java.awt.Color(255, 255, 255));
        btnCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/cargo.png"))); // NOI18N
        btnCargo.setText("Gerenciar Cargos");
        btnCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargoActionPerformed(evt);
            }
        });

        btnGrupo.setBackground(new java.awt.Color(255, 255, 255));
        btnGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/grupo.png"))); // NOI18N
        btnGrupo.setText("Gerenciar Grupos");
        btnGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrupoActionPerformed(evt);
            }
        });

        btnSubGrupo.setBackground(new java.awt.Color(255, 255, 255));
        btnSubGrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/subgrupo.png"))); // NOI18N
        btnSubGrupo.setText("Gerenciar Sub-Grupos");
        btnSubGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubGrupoActionPerformed(evt);
            }
        });

        btnRelatórios.setBackground(new java.awt.Color(255, 255, 255));
        btnRelatórios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/relatorio.png"))); // NOI18N
        btnRelatórios.setText("Relatórios");
        btnRelatórios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatóriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnRelatórios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFuncionario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnObjeto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFornecimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSaidaEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSubGrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSubGrupo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObjeto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFornecimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSaidaEstoque))))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRelatórios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        FRMCliente cliente = new FRMCliente();
        cliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnFornecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecimentoActionPerformed
        FRMFornecimento fornecimento = new FRMFornecimento();
        fornecimento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFornecimentoActionPerformed

    private void btnCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargoActionPerformed
        FRMCargo cargo = new FRMCargo();
        cargo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCargoActionPerformed

    private void btnGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrupoActionPerformed
        FRMGrupo grupo = new FRMGrupo();
        grupo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGrupoActionPerformed

    private void btnSubGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubGrupoActionPerformed
        FRMSubGrupo subGrupo = new FRMSubGrupo();
        subGrupo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSubGrupoActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        FRMFornecedor fornecedor = new FRMFornecedor();
        fornecedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        FRMFuncionario funcionario = new FRMFuncionario();
        funcionario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObjetoActionPerformed
        FRMObjeto objeto = new FRMObjeto();
        objeto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnObjetoActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        FRMVenda venda = new FRMVenda();
        venda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnSaidaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaEstoqueActionPerformed
        FRMSaida saida = new FRMSaida();
        saida.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSaidaEstoqueActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnRelatóriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatóriosActionPerformed
        FRMRelatorio relatorio = new FRMRelatorio();
        relatorio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRelatóriosActionPerformed

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
            java.util.logging.Logger.getLogger(FRMPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargo;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnFornecimento;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnGrupo;
    private javax.swing.JButton btnObjeto;
    private javax.swing.JButton btnRelatórios;
    private javax.swing.JButton btnSaidaEstoque;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSubGrupo;
    private javax.swing.JButton btnVenda;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    // End of variables declaration//GEN-END:variables
    
}