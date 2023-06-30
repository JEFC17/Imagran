/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Domain.Friends;
import Domain.User;
import Logic.Graph;
import Logic.ListGraph;
import Utility.UsuarioXML;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom.JDOMException;

/**
 *
 * @author User
 */

public class JFSignUp extends javax.swing.JFrame {

    private Friends friends;
    private UsuarioXML xml;
    private User user;


    /**
     * Creates new form JFSignUp
     */
    public JFSignUp(User user){
        try {
            this.user = user;
//            this.friends = friends;
            initComponents();
            this.xml = new UsuarioXML();
        } catch (JDOMException | IOException ex) {
            Logger.getLogger(JFSignUp.class.getName()).log(Level.SEVERE, null, ex);
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

        Bakcground = new javax.swing.JPanel();
        jpanelSignUp = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jlUser = new javax.swing.JLabel();
        jtfUser = new javax.swing.JTextField();
        jlFullName = new javax.swing.JLabel();
        jtfFullName = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jlPassword = new javax.swing.JLabel();
        jbtnSignUp = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlLogIn = new javax.swing.JLabel();
        jbtnLogIn = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bakcground.setPreferredSize(new java.awt.Dimension(900, 700));
        Bakcground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelSignUp.setBackground(new java.awt.Color(255, 255, 255));
        jpanelSignUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpanelSignUp.setPreferredSize(new java.awt.Dimension(340, 400));

        jlTitle.setFont(new java.awt.Font("RTL-Adam Script Heavy", 0, 48)); // NOI18N
        jlTitle.setForeground(new java.awt.Color(0, 0, 0));
        jlTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/iconImagran01.png"))); // NOI18N

        jlUser.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jlUser.setForeground(new java.awt.Color(51, 51, 51));
        jlUser.setText("User");

        jtfUser.setBackground(new java.awt.Color(255, 255, 255));
        jtfUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfUser.setForeground(new java.awt.Color(102, 102, 102));
        jtfUser.setToolTipText("user");
        jtfUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtfUser.setCaretColor(new java.awt.Color(153, 153, 153));
        jtfUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtfUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfUserMousePressed(evt);
            }
        });
        jtfUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUserActionPerformed(evt);
            }
        });
        jtfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfUserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUserKeyTyped(evt);
            }
        });

        jlFullName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlFullName.setForeground(new java.awt.Color(0, 0, 0));
        jlFullName.setText("Full name");

        jtfFullName.setBackground(new java.awt.Color(255, 255, 255));
        jtfFullName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfFullName.setForeground(new java.awt.Color(102, 102, 102));
        jtfFullName.setToolTipText("full name");
        jtfFullName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jtfFullName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfFullNameMousePressed(evt);
            }
        });
        jtfFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfFullNameKeyTyped(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setToolTipText("password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        jlPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlPassword.setForeground(new java.awt.Color(51, 51, 51));
        jlPassword.setText("Password");

        jbtnSignUp.setBackground(new java.awt.Color(0, 51, 153));
        jbtnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        jbtnSignUp.setText("Sign up");
        jbtnSignUp.setToolTipText("Sign up");
        jbtnSignUp.setBorder(null);
        jbtnSignUp.setFocusPainted(false);
        jbtnSignUp.setFocusable(false);
        jbtnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelSignUpLayout = new javax.swing.GroupLayout(jpanelSignUp);
        jpanelSignUp.setLayout(jpanelSignUpLayout);
        jpanelSignUpLayout.setHorizontalGroup(
            jpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelSignUpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelSignUpLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlUser)
                    .addComponent(jlFullName)
                    .addComponent(jlPassword)
                    .addGroup(jpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(jpanelSignUpLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jlTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelSignUpLayout.setVerticalGroup(
            jpanelSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelSignUpLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlTitle)
                .addGap(35, 35, 35)
                .addComponent(jlUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlFullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jbtnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Bakcground.add(jpanelSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 340, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jlLogIn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlLogIn.setForeground(new java.awt.Color(102, 102, 102));
        jlLogIn.setText("Have an account? ");

        jbtnLogIn.setBackground(new java.awt.Color(255, 255, 255));
        jbtnLogIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnLogIn.setForeground(new java.awt.Color(0, 51, 153));
        jbtnLogIn.setText("Log in");
        jbtnLogIn.setToolTipText("Log in");
        jbtnLogIn.setBorder(null);
        jbtnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jlLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnLogIn)
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLogIn)
                    .addComponent(jbtnLogIn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Bakcground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 340, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo imagran.png"))); // NOI18N
        Bakcground.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bakcground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bakcground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    public boolean validateSpaces() {

        if (this.jtfFullName.getText().isEmpty()) {
            this.jtfFullName.setText("Please fill in the required information.");
        }
        if (this.jtfUser.getText().isEmpty()) {
            this.jtfUser.setText("Please fill in the required information.");
        }

        return !this.jPasswordField1.getText().isEmpty()
                && !this.jtfUser.getText().equals("Please fill in the required information.")
                && !this.jtfFullName.getText().equals("Please fill in the required information.");

    }
    private void jbtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignUpActionPerformed
        if (jbtnSignUp == evt.getSource() && validateSpaces()) {
            try {
                if (this.xml.signUpXML(this.jtfUser.getText()) == true) {
                    this.jtfUser.setText("user alredy exists");
                } else if (this.xml.signUpXML(this.jtfUser.getText()) == false){
                    this.user = new User(this.jtfUser.getText(),
                            this.jtfFullName.getText(),
                            this.jPasswordField1.getText());
                    this.xml.guardarRegistroUsuario(user);
                    
                    // crear graph
                    
                    JFLogin fLogin = new JFLogin(this.user);
                    fLogin.setVisible(true);
                    dispose();

                }

            } catch (JDOMException | IOException ex) {
                Logger.getLogger(JFSignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jbtnSignUpActionPerformed

    private void jtfUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUserKeyPressed

    }//GEN-LAST:event_jtfUserKeyPressed

    private void jtfUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUserKeyTyped
        char validate = evt.getKeyChar();
        if (validate == 32) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfUserKeyTyped

    private void jtfFullNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFullNameKeyTyped
        char validate = evt.getKeyChar();
        if (validate >= 33 && validate <= 64
                || validate >= 91 && validate <= 96
                || validate >= 123 && validate <= 128
                || validate >= 155 && validate <= 159
                || validate >= 166 && validate <= 180
                || validate >= 184 && validate <= 197
                || validate >= 200 && validate <= 209
                || validate >= 213 && validate <= 223
                || validate >= 238 && validate <= 255) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfFullNameKeyTyped

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        char validate = evt.getKeyChar();
        if (validate == 32) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jtfUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUserMousePressed
        if (this.jtfUser.getText().equals("Please fill in the required information.")) {

            this.jtfUser.setText("");
        }
    }//GEN-LAST:event_jtfUserMousePressed

    private void jtfFullNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfFullNameMousePressed
        if (this.jtfFullName.getText().equals("Please fill in the required information.")) {

            this.jtfFullName.setText("");
        }
    }//GEN-LAST:event_jtfFullNameMousePressed

    private void jbtnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogInActionPerformed

        if (jbtnLogIn == evt.getSource()) {

            JFLogin jfSU = new JFLogin(this.user);
            jfSU.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtnLogInActionPerformed

    private void jtfUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfUserActionPerformed

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
            java.util.logging.Logger.getLogger(JFSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel Bakcground;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbtnLogIn;
    private javax.swing.JButton jbtnSignUp;
    private javax.swing.JLabel jlFullName;
    private javax.swing.JLabel jlLogIn;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JLabel jlUser;
    private javax.swing.JPanel jpanelSignUp;
    private javax.swing.JTextField jtfFullName;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables
}
