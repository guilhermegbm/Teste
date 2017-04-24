/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControleFornecedor;
import Modelo.BEAN.FornecedorBEAN;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Henrique
 */
public class FRMFornecedor extends javax.swing.JFrame {

    private DefaultTableModel dTable;
    private ArrayList<FornecedorBEAN> dados;
    private ControleFornecedor controleForn = new ControleFornecedor();

    /**
     * Creates new form FRMFornecedor
     */
    public FRMFornecedor() {
        initComponents();

        dados = controleForn.listarTodos();
        this.preencheTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFornecedor = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cbOpc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tfDado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Fornecedores");

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Todos os fornecedores cadastrados"));

        tableFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableFornecedor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/fornAdd.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/Editar.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/FornDel.png"))); // NOI18N
        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/logout.png"))); // NOI18N
        jButton4.setText("Voltar");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/funcLoc.png"))); // NOI18N
        jButton5.setText("Localizar");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cbOpc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "CNPJ" }));
        cbOpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcActionPerformed(evt);
            }
        });

        jLabel1.setText("Localizar fornecedor por:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbOpc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDado)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(tfDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FRMCadastrarFornecedor fornecedor = new FRMCadastrarFornecedor();

        fornecedor.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOpcActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.localizar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FRMEditarFornecedor edtFornecedor = new FRMEditarFornecedor();
        int qtd = tableFornecedor.getSelectedRowCount();
        FornecedorBEAN forn = new FornecedorBEAN();

        if (qtd < 1) {
            JOptionPane.showMessageDialog(null, "Selecione um ítem da lista ao lado para deletar.");
        } else if (qtd > 1) {
            JOptionPane.showMessageDialog(null, "Apenas um ítem da lista deve ser selecionado por vez.");
        } else {
            int linha = tableFornecedor.getSelectedRow();
            forn.setCodigo(dados.get(linha).getCodigo());
            forn.setNome(dados.get(linha).getNome());
            forn.setTipo(dados.get(linha).getTipo());
            forn.setCnpj(dados.get(linha).getCnpj());
            forn.setCpf(dados.get(linha).getCpf());
            forn.setTelefone(dados.get(linha).getTelefone());

            edtFornecedor.pegaObjeto(forn);

            edtFornecedor.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int qtd = tableFornecedor.getSelectedColumnCount();

        if (qtd < 1) {
            JOptionPane.showMessageDialog(null, "Selecione um ítem da lista ao lado para deletar.");
        } else if (qtd > 1) {
            JOptionPane.showMessageDialog(null, "Apenas um ítem da lista deve ser selecionado por vez.");
        } else {
            int linha = tableFornecedor.getSelectedRow();
            int codigo = dados.get(linha).getCodigo();
            int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o fornecedor " + dados.get(linha).getNome() + "?");

            if (opc == 0) {
                controleForn.deletar(codigo);
            }
            dados = controleForn.listarTodos();
            this.preencheTabela();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tfDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDadoActionPerformed
        this.localizar();
    }//GEN-LAST:event_tfDadoActionPerformed

    private void tfDadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDadoFocusGained
        if (tfDado.getText().equals("Insira o dado para pesquisa...")) {
            tfDado.setText("");
            tfDado.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfDadoFocusGained

    private void tfDadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDadoFocusLost
        if (tfDado.getText().equals("")) {
            tfDado.setForeground(Color.GRAY);
            tfDado.setText("Insira o dado para pesquisa...");
        }
    }//GEN-LAST:event_tfDadoFocusLost

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
            java.util.logging.Logger.getLogger(FRMFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbOpc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableFornecedor;
    private javax.swing.JTextField tfDado;
    // End of variables declaration//GEN-END:variables

    private void preencheTabela() {
        dTable = criaTabela();

        dTable.addColumn("Código");
        dTable.addColumn("Nome");
        dTable.addColumn("Tipo");
        dTable.addColumn("CNPJ/CPF");
        dTable.addColumn("Telefone");

        for (FornecedorBEAN dado : dados) {
            
            String tipo = "";
            String cpfOuCnpj = "";
            
            if (dado.getTipo() == 1){
                tipo = "Empresa";
                cpfOuCnpj = dado.getCnpj();
            } else if (dado.getTipo() == 2){
                tipo = "Pessoa";
                cpfOuCnpj = dado.getCpf();
            }
            
            dTable.addRow(new Object[]{dado.getCodigo(), dado.getNome(), tipo, cpfOuCnpj, dado.getTelefone()});
        }

        tableFornecedor.setModel(dTable);

    }

    private DefaultTableModel criaTabela() {
        DefaultTableModel dTable = new DefaultTableModel() {
            //Define o tipo dos campos (coluna) na mesma ordem que as colunas foram criadas
            Class[] types = new Class[]{
                java.lang.Integer.class, //codigo
                java.lang.String.class, //nome
                java.lang.String.class, //Tipo
                java.lang.String.class, //CNPJ/CPF
                java.lang.String.class, //Telefone
            };
            //define se os campos podem ser editados na propria tabela
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        ;

        };
        //retorna o DefaultTableModel
    return dTable;
    }

    private void localizar() {
        if ((tfDado.getText().equals("")) || (tfDado.getText().equals("Insira o dado para pesquisa..."))) {
            JOptionPane.showMessageDialog(null, "Insira algum dado para pesquisa");
        } else {
            if (cbOpc.getSelectedIndex() == 0) {
                //if (tfDado.getText().contains("0123456789")) {
                    dados = controleForn.listarPorCodigo(Integer.parseInt(tfDado.getText()));
                    this.preencheTabela();
                    
                //} else {
                //    JOptionPane.showMessageDialog(null, "Para pesquisar por código, apenas inteiros devem ser inseridos");
                //}
            } else if (cbOpc.getSelectedIndex() == 1) {
                dados = controleForn.listarPorNome(tfDado.getText());
                this.preencheTabela();
            } else if (cbOpc.getSelectedIndex() == 2) {
                dados = controleForn.listarPorCNPJ(tfDado.getText());
                this.preencheTabela();
            }
        }
    }
}
