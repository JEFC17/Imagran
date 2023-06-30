/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Domain.Friends;
import Domain.Post;
import Domain.User;
import Logic.ListGraph;
import Utility.UsuarioXML;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom.JDOMException;

/**
 *
 * @author User
 */
public class JFLogin extends javax.swing.JFrame {

    private Friends friends;
    private UsuarioXML xml;
    private User user;
    public static String username = "";
    public static ListGraph graph;

    /**
     * Creates new form JFLogin
     */
//    public JFLogin(User user) {
//        this.xml = new UsuarioXML();
//        this.friends = new Friends("Maryam");
//        this.friends.getFriends().add(new User("Maryam", "",""));
//        this.friends.getFriends().add(new User("Josseph","",""));
//        this.friends.getFriends().add(new User("Emanuel","",""));
//        this.friends.getFriends().get(0).setPost(new Post("Carro nuevo!"));
//        this.friends.getFriends().get(0).setPost(new Post("Feliz navidad a todos"));
//      C  this.friends.getFriends().get(1).setPost(new Post("Cansado del trabajo"));
//        this.friends.getFriends().get(1).setPost(new Post("Nuevo iembro en la familia"));
//        this.friends.getFriends().get(2).setPost(new Post("Un perrito me hizo compañía"));
//        this.friends.getFriends().get(2).setPost(new Post("¿Alguien me ayuda con matemáticas?"));
//        initComponents();
//    }
    public JFLogin() {
        try {
            this.xml = new UsuarioXML();
            

            initComponents();
        } catch (JDOMException | IOException ex) {
            Logger.getLogger(JFLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public JFLogin(User user) {
        try {
            this.user = user;
            this.xml = new UsuarioXML();
            initComponents();
        } catch (JDOMException | IOException ex) {
            Logger.getLogger(JFLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private ListGraph newGraph(UsuarioXML xml){
         ListGraph auxGraph = new ListGraph(100);
        ArrayList <User>users = xml.recuperarUsuarios(); 
         for (int i = 0; i < users.size(); i++) {
            auxGraph.addVertex(users.get(i).getUser());
         }
         ArrayList<User> friends = new ArrayList();
         for (int i = 0; i < users.size(); i++) {
             friends = xml.recuperarAmigos(users.get(i).getUser());
             for (int j = 0; j < friends.size(); j++) {
                 auxGraph.addWeight(users.get(i).getUser(), friends.get(j).getUser(), 1);
             }
         }
         return auxGraph;
     }
    
        private void initSuggestionsUser(){
            if (this.user!= null) {
                this.user.setSuggestion(graph.getSugerencias(user.getUser()));
                System.out.println(""+ this.user.getSuggestion().toString());
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

        jPanel1 = new javax.swing.JPanel();
        jpLogIn = new javax.swing.JPanel();
        jlTitle = new javax.swing.JLabel();
        jlUser = new javax.swing.JLabel();
        jtfUser = new javax.swing.JTextField();
        jlPassword = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jbtnLogIn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlSignUp = new javax.swing.JLabel();
        jbtnSignUp = new javax.swing.JButton();
        jlBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpLogIn.setBackground(new java.awt.Color(255, 255, 255));
        jpLogIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

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
        jtfUser.setOpaque(true);
        jtfUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtfUserMousePressed(evt);
            }
        });
        jtfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUserKeyTyped(evt);
            }
        });

        jlPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlPassword.setForeground(new java.awt.Color(51, 51, 51));
        jlPassword.setText("Password");

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordField1.setToolTipText("password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPasswordField1.setOpaque(true);
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        jbtnLogIn.setBackground(new java.awt.Color(0, 51, 153));
        jbtnLogIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        jbtnLogIn.setText("Log in");
        jbtnLogIn.setToolTipText("Log in");
        jbtnLogIn.setBorder(null);
        jbtnLogIn.setFocusPainted(false);
        jbtnLogIn.setFocusable(false);
        jbtnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpLogInLayout = new javax.swing.GroupLayout(jpLogIn);
        jpLogIn.setLayout(jpLogInLayout);
        jpLogInLayout.setHorizontalGroup(
            jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLogInLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPassword)
                    .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUser)
                    .addGroup(jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jbtnLogIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLogInLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlTitle)
                .addGap(66, 66, 66))
        );
        jpLogInLayout.setVerticalGroup(
            jpLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLogInLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jlTitle)
                .addGap(27, 27, 27)
                .addComponent(jlUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jlPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jbtnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jpLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 340, 400));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jlSignUp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlSignUp.setForeground(new java.awt.Color(102, 102, 102));
        jlSignUp.setText("Don't have an account? ");

        jbtnSignUp.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbtnSignUp.setForeground(new java.awt.Color(0, 51, 153));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jlSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnSignUp)
                .addGap(81, 81, 81))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSignUp)
                    .addComponent(jbtnSignUp))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 340, -1));

        jlBackground.setFont(new java.awt.Font("RTL-Adam Script Heavy", 0, 36)); // NOI18N
        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo imagran.png"))); // NOI18N
        jPanel1.add(jlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSignUpActionPerformed

        if (jbtnSignUp == evt.getSource()) {

            JFSignUp jfSU = new JFSignUp(this.user);
            jfSU.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_jbtnSignUpActionPerformed
    public boolean validateSpaces() {

        if (this.jtfUser.getText().isEmpty()) {
            this.jtfUser.setText("Please fill in the required information.");
        }

        return !this.jPasswordField1.getText().isEmpty()
                && !this.jtfUser.getText().equals("Please fill in the required information.");
    }
    private void jbtnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogInActionPerformed

        if (jbtnLogIn == evt.getSource() && validateSpaces()) {
//            user = new User(this.jtfUser.getText(), this.jPasswordField1.getText());
            if (this.xml.loginXML(this.jtfUser.getText(), this.jPasswordField1.getText()) == true) {
                this.user = xml.buscarUser(this.jtfUser.getText());
                for (int i = 0; i < this.xml.recuperarAmigos(this.user.getUser()).size(); i++) {
                    this.user.getFriends().addEnd((User)this.xml.recuperarAmigos(this.user.getUser()).get(i));
                }
                for (int i = 0; i < this.xml.recuperarRequest(this.user.getUser()).size(); i++) {
                    this.user.getRequest().insert(this.xml.recuperarRequest(this.user.getUser()).get(i));
                }
//                this.xml.addRequest("mar", user);
                this.graph = newGraph(this.xml);
                    initSuggestionsUser();
                    
                JFFeed jff = new JFFeed(this.user);
                jff.setVisible(true);
                dispose();

            } else {
                this.jtfUser.setText("doesn´t exists");
                this.jPasswordField1.setText("");
            }

        }
    }//GEN-LAST:event_jbtnLogInActionPerformed

    private void jtfUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUserKeyTyped
        char validate = evt.getKeyChar();
        if (validate == 32) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfUserKeyTyped

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton jbtnLogIn;
    private javax.swing.JButton jbtnSignUp;
    private javax.swing.JLabel jlBackground;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlSignUp;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JLabel jlUser;
    private javax.swing.JPanel jpLogIn;
    private javax.swing.JTextField jtfUser;
    // End of variables declaration//GEN-END:variables
}
