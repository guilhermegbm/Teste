/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Gerenciamento;

import Visao.Cadastro.FRMCadastrarObjeto;
import Controle.ControleObjeto;
import Modelo.BEAN.Objeto;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Henrique
 */
public class FRMObjeto extends javax.swing.JFrame {

    private DefaultTableModel dTable;
    ArrayList<Objeto> dados;
    ControleObjeto controleO = new ControleObjeto();

    /**
     * Creates new form FRMFornecedor
     */
    public FRMObjeto() {
        initComponents();

        //dados = controleO.listarTodos();

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
        tableObjeto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        cbOpc = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tfDado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produtos");

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Todos os produtos cadastrados"));

        tableObjeto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableObjeto);

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/prodAdd.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/prodEditar.png"))); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/prodDel.png"))); // NOI18N
        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/logout.png"))); // NOI18N
        jButton4.setText("Voltar");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/prodLoc.png"))); // NOI18N
        jButton5.setText("Localizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        cbOpc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "(A partir) Preço de venda", "(Até)Preço de venda" }));
        cbOpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOpcActionPerformed(evt);
            }
        });

        jLabel1.setText("Localizar objeto por:");

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
        tfDado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDadoKeyTyped(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbOpc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDado, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FRMCadastrarObjeto cadProd = new FRMCadastrarObjeto();

        cadProd.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOpcActionPerformed

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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.localizar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        int qnt = tableObjeto.getSelectedColumnCount();
//        
//        if (qnt < 1) {
//            JOptionPane.showMessageDialog(null, "Selecione um ítem da lista ao lado para deletar.");
//        } else if (qnt > 1) {
//            JOptionPane.showMessageDialog(null, "Apenas um ítem da lista deve ser selecionado por vez;");
//        } else {
//
//            int linha = tableObjeto.getSelectedRow();
//            int codigo = dados.get(linha).getCodigo();
//
//            int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o objeto " + dados.get(linha).getNome() + " ?");
//
//            if (opc == 0) {
//                //controleO.deletar(codigo);
//                //dados = controleO.listarTodos();
//                this.preencheTabela();
//            }
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//        FRMEditarObjeto edtObj = new FRMEditarObjeto();
//        int qnt = tableObjeto.getSelectedRowCount();
//        Objeto obj = new Objeto();
//
//        if (qnt < 1) {
//            JOptionPane.showMessageDialog(null, "Selecione um ítem da lista ao lado para editar.");
//        } else if (qnt > 1) {
//            JOptionPane.showMessageDialog(null, "Apenas um ítem da lista deve ser selecionado por vez.");
//        } else {
//            int linha = tableObjeto.getSelectedRow();
//            obj.setCodigo(dados.get(linha).getCodigo());
//            obj.setNome(dados.get(linha).getNome());
//            obj.setDescricao(dados.get(linha).getDescricao());
//            obj.setPrecoVendaBase(dados.get(linha).getPrecoVendaBase());
//            obj.setPrecoCompraBase(dados.get(linha).getPrecoCompraBase());
//            obj.setUnidade(dados.get(linha).getUnidade());
//            obj.setQtdeEstoque(dados.get(linha).getQtdeEstoque());
//            obj.setTipoObj(dados.get(linha).getTipoObj());
//            //obj.setSubClasse(dados.get(linha).getClasse());
//
//            edtObj.pegaObjeto(obj);
//
//            edtObj.setVisible(true);
//
//            this.setVisible(false);
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfDadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDadoKeyTyped

    }//GEN-LAST:event_tfDadoKeyTyped

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
            java.util.logging.Logger.getLogger(FRMObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMObjeto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FRMObjeto().setVisible(true);
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
    private javax.swing.JTable tableObjeto;
    private javax.swing.JTextField tfDado;
    // End of variables declaration//GEN-END:variables

    private void preencheTabela() {
        /*dTable = criaTabela();

        dTable.addColumn("Código");
        dTable.addColumn("Nome");
        dTable.addColumn("Preço de venda");
        dTable.addColumn("Preço de compra");
        dTable.addColumn("Tipo");
        dTable.addColumn("Classe");
        dTable.addColumn("Unidade");

        for (Objeto dado : dados) {
            
            String tipo = "";
            
            if (dado.getTipoObj() == 1){
                tipo = "Produto";
            } else if (dado.getTipoObj() == 2){
                tipo = "Mercadoria";
            }
            
            dTable.addRow(new Object[]{dado.getCodigo(), dado.getNome(),
                dado.getPrecoVendaBase(), dado.getPrecoCompraBase(), tipo,
                dado.getClasse().getNome(), dado.getUnidade()});
        }

        tableObjeto.setModel(dTable);*/
    }

    /*private DefaultTableModel criaTabela() {

        DefaultTableModel dTable = new DefaultTableModel() {
            //Define o tipo dos campos (coluna) na mesma ordem que as colunas foram criadas
            Class[] types = new Class[]{
                java.lang.Integer.class, //codigo
                java.lang.String.class, //nome
                java.lang.Float.class, //preço de venda
                java.lang.Float.class, //preço de compra
                java.lang.String.class, //tipo (Prod ou mer)
                java.lang.String.class, //classe
                java.lang.String.class //unidade
                
            };
            //define se os campos podem ser editados na propria tabela
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        ;

        };
        //retorna o DefaultTableModel
    return dTable;
    }*/

    private void localizar() {
        /*if ((tfDado.getText().equals("")) || (tfDado.getText().equals("Insira o dado para pesquisa..."))) {
            JOptionPane.showMessageDialog(null, "Insira algum dado para pesquisa.");
        } else {
            if (cbOpc.getSelectedIndex() == 0) {
                //if (tfDado.getText().contains("0123456789")) {
                    dados = controleO.listarPorCodigo(Integer.parseInt(tfDado.getText()));
                    this.preencheTabela();
                //} else {
                //    JOptionPane.showMessageDialog(null, "Para pesquisar por código, apenas inteiros devem ser inseridos");
                //}
            } else if (cbOpc.getSelectedIndex() == 1) {
                dados = controleO.listarPorNome(tfDado.getText());
                this.preencheTabela();
            } else if (cbOpc.getSelectedIndex() == 2) {
                //if (tfDado.getText().contains("0123456789,.")) {
                    String texto = tfDado.getText();

                    if (texto.contains(",")) {
                        String partes[] = texto.split(",");
                        String parte1 = partes[0];
                        String parte2 = partes[1];
                        texto = parte1 + "." + parte2;
                    }
                    dados = controleO.listarPorValorMenor(Float.parseFloat(texto));
                    this.preencheTabela();
                //} else {
                //    JOptionPane.showMessageDialog(null, "Para pesquisar por valor, apenas números, vírgula ou ponto devem ser inseridos");
                //}
            } else if (cbOpc.getSelectedIndex() == 3) {
                //if (tfDado.getText().contains("0123456789,.")) {
                    String texto = tfDado.getText();

                    if (texto.contains(",")) {
                        String partes[] = texto.split(",");
                        String parte1 = partes[0];
                        String parte2 = partes[1];
                        texto = parte1 + "." + parte2;
                    }

                    dados = controleO.listarPorValorMaior(Float.parseFloat(texto));
                    this.preencheTabela();
                //} else {
                //    JOptionPane.showMessageDialog(null, "Para pesquisar por valor, apenas números, vírgula ou ponto devem ser inseridos");
                //}
            }
        }*/
    }
}