/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Domain.ContentButtons;
import Domain.Friends;
import java.awt.Color;
import java.awt.Point;

/**
 *
 * @author User
 */
public class JFAddPost extends javax.swing.JFrame {

    private ContentButtons button;
    private Friends friends;

    /**
     * Creates new form JFFriendRequests
     */
    public JFAddPost(Friends friends) {
        this.friends = friends;
        this.button = new ContentButtons();
        for (int i = 0; i < this.friends.getFriends().size(); i++) {
            for (int j = 0; j < this.friends.getFriends().get(i).getPost().size(); j++) {
                this.button.getCircularDoublyList().addEnd(this.friends.getFriends().get(i).getName()+
                    "\n \n"+this.friends.getFriends().get(i).getPost().get(j).getMessage());
            }

        }
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

        jPanel1 = new javax.swing.JPanel();
        jpIcons = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jbtnHome = new javax.swing.JButton();
        jbtnAddPost = new javax.swing.JButton();
        jbtnAddFriends = new javax.swing.JButton();
        jbtnShowFriends = new javax.swing.JButton();
        jbtnLogOut = new javax.swing.JButton();
        jlIconImagran = new javax.swing.JLabel();
        jbtnSearchFriends = new javax.swing.JButton();
        jpFriends = new javax.swing.JPanel();
        jBAccept = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAPost = new javax.swing.JTextArea();
        jlBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIcons.setBackground(new java.awt.Color(255, 255, 255));
        jpIcons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jbtnHome.setBackground(new java.awt.Color(255, 255, 255));
        jbtnHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnHome.setForeground(new java.awt.Color(0, 0, 0));
        jbtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-casa-40_1.png"))); // NOI18N
        jbtnHome.setText("Home     ");
        jbtnHome.setToolTipText("home");
        jbtnHome.setBorder(null);
        jbtnHome.setBorderPainted(false);
        jbtnHome.setFocusPainted(false);
        jbtnHome.setFocusable(false);
        jbtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHomeActionPerformed(evt);
            }
        });

        jbtnAddPost.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAddPost.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnAddPost.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAddPost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-añadir-texto-40.png"))); // NOI18N
        jbtnAddPost.setText("Add Post");
        jbtnAddPost.setToolTipText("AddPost");
        jbtnAddPost.setBorder(null);
        jbtnAddPost.setFocusPainted(false);
        jbtnAddPost.setFocusable(false);
        jbtnAddPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddPostActionPerformed(evt);
            }
        });

        jbtnAddFriends.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAddFriends.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnAddFriends.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAddFriends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-añadir-grupo-de-usuarios-hombre-hombre-40.png"))); // NOI18N
        jbtnAddFriends.setText("Add Friends");
        jbtnAddFriends.setToolTipText("AddFriends");
        jbtnAddFriends.setBorder(null);
        jbtnAddFriends.setFocusPainted(false);
        jbtnAddFriends.setFocusable(false);
        jbtnAddFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddFriendsActionPerformed(evt);
            }
        });

        jbtnShowFriends.setBackground(new java.awt.Color(255, 255, 255));
        jbtnShowFriends.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnShowFriends.setForeground(new java.awt.Color(0, 0, 0));
        jbtnShowFriends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-amigos-40.png"))); // NOI18N
        jbtnShowFriends.setText("Friends");
        jbtnShowFriends.setToolTipText("Friends");
        jbtnShowFriends.setBorder(null);
        jbtnShowFriends.setFocusPainted(false);
        jbtnShowFriends.setFocusable(false);
        jbtnShowFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnShowFriendsActionPerformed(evt);
            }
        });

        jbtnLogOut.setBackground(new java.awt.Color(255, 255, 255));
        jbtnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-panel-cerrado-40.png"))); // NOI18N
        jbtnLogOut.setToolTipText("Log out");
        jbtnLogOut.setBorder(null);
        jbtnLogOut.setFocusPainted(false);
        jbtnLogOut.setFocusable(false);
        jbtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogOutActionPerformed(evt);
            }
        });

        jlIconImagran.setBackground(new java.awt.Color(255, 255, 255));
        jlIconImagran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-Imagran-panel-Icons.png"))); // NOI18N

        jbtnSearchFriends.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSearchFriends.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnSearchFriends.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSearchFriends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-lupa-35.png"))); // NOI18N
        jbtnSearchFriends.setText("Search \nfriends");
        jbtnSearchFriends.setToolTipText("SearchFriends");
        jbtnSearchFriends.setBorder(null);
        jbtnSearchFriends.setFocusPainted(false);
        jbtnSearchFriends.setFocusable(false);
        jbtnSearchFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchFriendsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpIconsLayout = new javax.swing.GroupLayout(jpIcons);
        jpIcons.setLayout(jpIconsLayout);
        jpIconsLayout.setHorizontalGroup(
            jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIconsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpIconsLayout.createSequentialGroup()
                        .addGroup(jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addGroup(jpIconsLayout.createSequentialGroup()
                                .addGap(0, 8, Short.MAX_VALUE)
                                .addGroup(jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtnAddPost)
                                    .addComponent(jbtnAddFriends))))
                        .addGap(13, 13, 13))
                    .addGroup(jpIconsLayout.createSequentialGroup()
                        .addComponent(jbtnLogOut)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIconsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlIconImagran)
                        .addContainerGap())
                    .addGroup(jpIconsLayout.createSequentialGroup()
                        .addGroup(jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIconsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbtnSearchFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpIconsLayout.createSequentialGroup()
                                .addComponent(jbtnShowFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jpIconsLayout.setVerticalGroup(
            jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIconsLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlIconImagran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnAddFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnAddPost, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnShowFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnSearchFriends)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jbtnLogOut)
                .addContainerGap())
        );

        jPanel1.add(jpIcons, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 680));

        jpFriends.setBackground(new java.awt.Color(255, 255, 255));
        jpFriends.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jpFriends.setPreferredSize(new java.awt.Dimension(720, 680));

        jBAccept.setBackground(new java.awt.Color(204, 204, 204));
        jBAccept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBAccept.setForeground(new java.awt.Color(0, 0, 0));
        jBAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-lleno-más-2-matemáticas-30.png"))); // NOI18N
        jBAccept.setText("Add");
        jBAccept.setToolTipText("AddPost");
        jBAccept.setBorder(null);
        jBAccept.setFocusPainted(false);
        jBAccept.setFocusable(false);
        jBAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcceptActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-AddPost.png"))); // NOI18N

        jTAPost.setBackground(new java.awt.Color(255, 255, 255));
        jTAPost.setColumns(20);
        jTAPost.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTAPost.setForeground(new java.awt.Color(51, 51, 51));
        jTAPost.setRows(5);
        jScrollPane1.setViewportView(jTAPost);

        javax.swing.GroupLayout jpFriendsLayout = new javax.swing.GroupLayout(jpFriends);
        jpFriends.setLayout(jpFriendsLayout);
        jpFriendsLayout.setHorizontalGroup(
            jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFriendsLayout.createSequentialGroup()
                .addGroup(jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFriendsLayout.createSequentialGroup()
                            .addGap(500, 500, 500)
                            .addComponent(jBAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpFriendsLayout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(jLabel1))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jpFriendsLayout.setVerticalGroup(
            jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFriendsLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jBAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel1.add(jpFriends, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 720, 680));

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo imagran.png"))); // NOI18N
        jPanel1.add(jlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

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

    private void jBAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcceptActionPerformed

        if (jBAccept == evt.getSource()) {

            this.jTAPost.setText("");
        }
    }//GEN-LAST:event_jBAcceptActionPerformed

    private void jbtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHomeActionPerformed
        if (jbtnHome == evt.getSource()) {
            JFFeed jff = new JFFeed(this.friends);
            jff.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtnHomeActionPerformed

    private void jbtnAddPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddPostActionPerformed
        if (jbtnAddPost == evt.getSource()){
            JFAddPost jfap = new JFAddPost(this.friends);
            jfap.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtnAddPostActionPerformed

    private void jbtnAddFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriendsActionPerformed
        JFFriendRequests jff = new JFFriendRequests(this.friends);
        jff.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnAddFriendsActionPerformed

    private void jbtnShowFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnShowFriendsActionPerformed
        if (jbtnShowFriends == evt.getSource()){
            JFShowFriends jfap = new JFShowFriends(this.friends);
            jfap.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtnShowFriendsActionPerformed

    private void jbtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogOutActionPerformed
        if (jbtnLogOut == evt.getSource()){
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnLogOutActionPerformed

    private void jbtnSearchFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchFriendsActionPerformed
                if (this.jbtnSearchFriends == evt.getSource()) {
            JFSearchFriends jfSF = new JFSearchFriends(friends);
            jfSF.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtnSearchFriendsActionPerformed

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
            java.util.logging.Logger.getLogger(JFAddPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAddPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAddPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAddPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAccept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTAPost;
    private javax.swing.JButton jbtnAddFriends;
    private javax.swing.JButton jbtnAddPost;
    private javax.swing.JButton jbtnHome;
    private javax.swing.JButton jbtnLogOut;
    private javax.swing.JButton jbtnSearchFriends;
    private javax.swing.JButton jbtnShowFriends;
    private javax.swing.JLabel jlBackground;
    private javax.swing.JLabel jlIconImagran;
    private javax.swing.JPanel jpFriends;
    private javax.swing.JPanel jpIcons;
    // End of variables declaration//GEN-END:variables
}