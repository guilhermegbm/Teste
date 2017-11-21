/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Gerenciamento;

import Visao.Outros.FRMPrincipal;
import Visao.Edicao.FRMEditarFuncionario;
import Visao.Cadastro.FRMCadastrarFuncionario;
import Controle.ControleFuncionario;
import Modelo.BEAN.Funcionario;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme
 */
public class FRMFuncionario extends javax.swing.JFrame {

    private DefaultTableModel dTable;
    private List<Funcionario> dados;

    /**
     * Creates new form FRMCliente
     */
    public FRMFuncionario() {
        initComponents();

        try {
            dados = ControleFuncionario.listarTodosAtivos();
            this.preencheTabela();
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
        }
        
        Funcionario f = new Funcionario();
        f.setCodigo(1);
        f.setAdministrador(true);
        ControleFuncionario.setFuncionarioLogado(f);
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
        jPanel1 = new javax.swing.JPanel();
        btnCadastrarFuncionario = new javax.swing.JButton();
        btnDespedirFuncionario = new javax.swing.JButton();
        btnAttFuncionario = new javax.swing.JButton();
        btnLocalizarFuncionario = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbOpc = new javax.swing.JComboBox<>();
        tfDado = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFuncionario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Funcionários");

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/FuncAdd.png"))); // NOI18N
        btnCadastrarFuncionario.setText("Cadastrar");
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        btnDespedirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/FuncDelete.png"))); // NOI18N
        btnDespedirFuncionario.setText("Despedir");
        btnDespedirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDespedirFuncionarioActionPerformed(evt);
            }
        });

        btnAttFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/Editar.png"))); // NOI18N
        btnAttFuncionario.setText("Editar");
        btnAttFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttFuncionarioActionPerformed(evt);
            }
        });

        btnLocalizarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/funcLoc.png"))); // NOI18N
        btnLocalizarFuncionario.setText("Localizar");
        btnLocalizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarFuncionarioActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/logout.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Localizar funcionário por:");

        cbOpc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listar todos ativos", "Código", "Nome", "Listar apenas despedidos" }));
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

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Todos os funcionários cadastrados"));

        tableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableFuncionario);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbOpc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDado))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLocalizarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDespedirFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAttFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLocalizarFuncionario))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnCadastrarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAttFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDespedirFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(btnVoltar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOpcActionPerformed
        if (cbOpc.getSelectedIndex() == 0) {
            try {
                dados = ControleFuncionario.listarTodosAtivos();
                this.preencheTabela();
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
            }
        } else if (cbOpc.getSelectedIndex() == 3) {
            try {
                dados = ControleFuncionario.listarTodosDespedidos();
                this.preencheTabela();
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

    private void btnLocalizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarFuncionarioActionPerformed
        this.localizar();
    }//GEN-LAST:event_btnLocalizarFuncionarioActionPerformed

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
        if (ControleFuncionario.verificaFuncionarioLogado()) {
            FRMCadastrarFuncionario cadFun = new FRMCadastrarFuncionario();
            cadFun.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Atenção, você não tem autorização para fazer essa ação.");
        }
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed

    private void btnAttFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttFuncionarioActionPerformed
        int qtd = tableFuncionario.getSelectedRowCount();

        if (qtd < 1) {
            JOptionPane.showMessageDialog(null, "Selecione um ítem da lista ao lado para editar.");
        } else if (qtd > 1) {
            JOptionPane.showMessageDialog(null, "Apenas um ítem da lista deve ser selecionado por vez.");
        } else {
            if ((dados.get(tableFuncionario.getSelectedRow()).getCodigo() == ControleFuncionario.getFuncionarioLogado().getCodigo()) || (ControleFuncionario.verificaFuncionarioLogado())) {
                FRMEditarFuncionario edtFun = new FRMEditarFuncionario();

                edtFun.pegaObjeto(dados.get(tableFuncionario.getSelectedRow()));

                edtFun.setVisible(true);

                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Atenção, você não tem autorização para fazer isso.");
            }
        }
    }//GEN-LAST:event_btnAttFuncionarioActionPerformed

    private void btnDespedirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDespedirFuncionarioActionPerformed
        if (ControleFuncionario.verificaFuncionarioLogado()) {
            int qtd = tableFuncionario.getSelectedColumnCount();

            if (qtd < 1) {
                JOptionPane.showMessageDialog(null, "Selecione um ítem da lista ao lado para deletar.");
            } else if (qtd > 1) {
                JOptionPane.showMessageDialog(null, "Apenas um ítem da lista deve ser selecionado por vez.");
            } else {
                int linha = tableFuncionario.getSelectedRow();
                int opc = JOptionPane.showConfirmDialog(null, "Deseja realmente despedir o(a) funcionario(a) " + dados.get(linha).getNome() + "?");

                if (opc == 0) {
                    try {
                        ControleFuncionario.despedeFuncionario(dados.get(linha));
                        dados = ControleFuncionario.listarTodosAtivos();
                        cbOpc.setSelectedIndex(0);
                        this.preencheTabela();
                    } catch (RuntimeException e) {
                        JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
                    }
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Atenção, você não tem autorização para fazer isso.");
        }
    }//GEN-LAST:event_btnDespedirFuncionarioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        FRMPrincipal prin = new FRMPrincipal();
        prin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tfDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDadoActionPerformed
        this.localizar();
    }//GEN-LAST:event_tfDadoActionPerformed

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
            java.util.logging.Logger.getLogger(FRMFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttFuncionario;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnDespedirFuncionario;
    private javax.swing.JButton btnLocalizarFuncionario;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbOpc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableFuncionario;
    private javax.swing.JTextField tfDado;
    // End of variables declaration//GEN-END:variables

    private void localizar() {
        if ((tfDado.getText().equals("")) || (tfDado.getText().equals("Insira o dado para pesquisa..."))) {
            JOptionPane.showMessageDialog(null, "Insira algum dado para pesquisa");
        } else {
            if (cbOpc.getSelectedIndex() == 1) {
                try {
                    dados = ControleFuncionario.listarTudoTodosOuPorCodigo(Integer.parseInt(tfDado.getText()));
                    this.preencheTabela();
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
                }
            } else if (cbOpc.getSelectedIndex() == 2) {
                try {
                    dados = ControleFuncionario.listarPorNome(tfDado.getText());
                    this.preencheTabela();
                } catch (RuntimeException e) {
                    JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
                }
            }
        }
    }

    private void preencheTabela() {
        dTable = this.criaTabela();

        dTable.addColumn("Código");
        dTable.addColumn("Nome");
        dTable.addColumn("CPF");
        dTable.addColumn("Cargo");
        dTable.addColumn("Telefone");

        for (Funcionario dado : dados) {
            dTable.addRow(new Object[]{dado.getCodigo(), dado.getNome(), dado.getCpf(), dado.getCargo().getNome(), dado.getTelefone()});
        }

        tableFuncionario.setModel(dTable);

    }

    private DefaultTableModel criaTabela() {
        DefaultTableModel dTable = new DefaultTableModel() {

            Class[] types = new Class[]{
                java.lang.Integer.class, //codigo
                java.lang.String.class, //nome
                java.lang.String.class, //cpf
                java.lang.String.class, //Cargo(nome)
                java.lang.String.class //Telefone
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
}
