/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao.Outros;

import Controle.ControleFuncionario;
import Modelo.BEAN.Funcionario;
import java.awt.Color;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Isabella
 */
public class FRMLogin extends javax.swing.JFrame {

    private boolean loginValido = false;

    /**
     * Creates new form FRMLogin
     */
    public FRMLogin() {
        initComponents();

        try {

            ControleFuncionario.iniciaConexao();

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();
        tfUsuario = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblImg1 = new javax.swing.JLabel();
        lblImg2 = new javax.swing.JLabel();
        lblEsqSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(306, 151));

        jLabel1.setText("Usuario:");

        jLabel2.setText("Senha:");

        tfSenha.setToolTipText("");
        tfSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfSenhaFocusLost(evt);
            }
        });
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });

        tfUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUsuarioFocusLost(evt);
            }
        });
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });
        tfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyTyped(evt);
            }
        });

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/login.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao.icon/logout.png"))); // NOI18N
        btnCancelar.setText("Sair");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblImg1.setToolTipText("");

        lblEsqSenha.setForeground(new java.awt.Color(0, 0, 204));
        lblEsqSenha.setText("Esquici minha senha");
        lblEsqSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEsqSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEsqSenhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEsqSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfUsuario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addComponent(tfUsuario)
                    .addComponent(lblImg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImg2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEsqSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed

    private void tfUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsuarioFocusGained
        if (tfUsuario.getText().equals("Insira o login...")) {
            tfUsuario.setText("");
            tfUsuario.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfUsuarioFocusGained

    private void tfUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsuarioFocusLost
        if (tfUsuario.getText().equals("")) {
            tfUsuario.setText("Insira o login...");
            tfUsuario.setForeground(Color.GRAY);
            lblImg1.setVisible(false);
        } else {
            try {
                if (ControleFuncionario.verificaLogin(tfUsuario.getText())) {
                    lblImg1.setVisible(true);
                    lblImg1.setToolTipText("Login encontrado!");
                    URL url = getClass().getResource("/Visao.icon/checked.png");
                    ImageIcon icon = new ImageIcon(url);
                    lblImg1.setIcon(icon);
                    loginValido = true;
                } else {
                    lblImg1.setVisible(true);
                    lblImg1.setToolTipText("Login não encontrado!");
                    URL url = this.getClass().getResource("/Visao.icon/warning.png");
                    lblImg1.setIcon(new ImageIcon(url));
                    loginValido = false;
                }
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(null, "Deu ruim");
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_tfUsuarioFocusLost

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyTyped

    }//GEN-LAST:event_tfUsuarioKeyTyped

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        this.entrar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void tfSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSenhaFocusGained
//        if (tfSenha.getText().equals("Your Password...")){
//            tfSenha.setText("");
//            tfSenha.setForeground(Color.BLACK);
//        }
    }//GEN-LAST:event_tfSenhaFocusGained

    private void tfSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSenhaFocusLost
//        if (tfSenha.getText().equals("")){
//            tfSenha.setText("Your Password...");
//            tfSenha.setForeground(Color.GRAY);
//        }
    }//GEN-LAST:event_tfSenhaFocusLost

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        this.entrar();
    }//GEN-LAST:event_tfSenhaActionPerformed

    private void lblEsqSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsqSenhaMouseClicked
        if (tfUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira ao menos o seu login.");
        } else {
            if (ControleFuncionario.verificaLogin(tfUsuario.getText())) {
                Funcionario f = ControleFuncionario.listarPorLogin(tfUsuario.getText());
                int opc = JOptionPane.showConfirmDialog(null, "Login encontrado. Deseja enviar um email com sua senha para " + f.getEmail() + " ?");

                if (opc == 0) {
                    try {
                        SimpleEmail email = new SimpleEmail();

                        email.setDebug(true);
                        email.setHostName("smtp.gmail.com");
                        email.setAuthentication("guilhermebmendonca60@gmail.com", "guilherme2000");
                        email.setSSL(true);
                        email.addTo(f.getEmail());
                        email.setFrom("guilhermebmendonca60@gmail.com");
                        email.setSubject("Senha esquecida");
                        email.setMsg("A sua senha é: " + f.getSenha());
                        email.send();
                        JOptionPane.showMessageDialog(null, "Email enviado com sucesso. Verifique sua caixa de entrada.");
                    } catch (EmailException e) {
                        e.getMessage();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Login não encontrado.");
            }
        }
    }//GEN-LAST:event_lblEsqSenhaMouseClicked

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
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEsqSenha;
    private javax.swing.JLabel lblImg1;
    private javax.swing.JLabel lblImg2;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables

    private void entrar() {
        if ((tfUsuario.getText().equals("")) || (tfUsuario.getText().equals("Insira o login..."))) {
            lblImg1.setVisible(true);
            lblImg1.setToolTipText("Insira o Login!");
            URL url = this.getClass().getResource("/Visao.icon/warning.png");
            lblImg1.setIcon(new ImageIcon(url));
        } else if (!loginValido) {

        } else if (tfSenha.getText().equals("")) {
            lblImg2.setVisible(true);
            lblImg2.setToolTipText("Insira a Senha!");
            URL url = this.getClass().getResource("/Visao.icon/warning.png");
            lblImg2.setIcon(new ImageIcon(url));
        } else {
            try {
                Funcionario f = ControleFuncionario.verificaSenha(tfUsuario.getText(), tfSenha.getText());
                if (f == null) {
                    lblImg2.setVisible(true);
                    lblImg2.setToolTipText("Senha incorreta!");
                    URL url = this.getClass().getResource("/Visao.icon/warning.png");
                    lblImg2.setIcon(new ImageIcon(url));
                } else {
                    FRMPrincipal p = new FRMPrincipal();
                    ControleFuncionario.setFuncionarioLogado(f);
                    p.setVisible(true);
                    this.dispose();
                }
            } catch (RuntimeException e) {
                JOptionPane.showMessageDialog(null, "Deu ruim: " + e);
            }
        }
    }
}
