/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Domain.ContentButtons;
import Domain.Friends;
import Domain.User;
import Logic.LinkedStack;
import Utility.UsuarioXML;
import java.awt.Color;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom.JDOMException;

/**
 *
 * @author User
 */
public class JFFeed extends javax.swing.JFrame {

    private ContentButtons button;
    private User user;
    private LinkedStack stack;
    private UsuarioXML xML;

    /**
     * Creates new form JFFriendRequests
     */
    public JFFeed(User user) {
        try {
            this.user = user;
            this.button = new ContentButtons();
            this.stack = new LinkedStack();
            this.xML = new UsuarioXML();
            this.stack = this.xML.recuperarPosts(user.getUser());
            initComponents();
            if (stack != null) {
                if (!stack.isEmpty() && stack.top() != null) {
                    this.jtaPost.setText("" + this.stack.top());
                } else {
                    this.jtaPost.setText("");

                }
            }
        } catch (JDOMException ex) {
            Logger.getLogger(JFFeed.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFFeed.class.getName()).log(Level.SEVERE, null, ex);
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
        jpIcons = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jbtnHome = new javax.swing.JButton();
        jbtnAddPost = new javax.swing.JButton();
        jbtnAddFriends = new javax.swing.JButton();
        jbtnShowFriends = new javax.swing.JButton();
        jlIconImagran = new javax.swing.JLabel();
        jbtnLogOut = new javax.swing.JButton();
        jbtnSearchFriends1 = new javax.swing.JButton();
        jpFriends = new javax.swing.JPanel();
        jlFriends = new javax.swing.JLabel();
        jbtnLeft = new javax.swing.JButton();
        jbtnRight = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaShowFriends = new javax.swing.JTextArea();
        jlThoughts = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaPost = new javax.swing.JTextArea();
        jbtnUp = new javax.swing.JButton();
        jbtnDown = new javax.swing.JButton();
        jlBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpIcons.setBackground(new java.awt.Color(255, 255, 255));
        jpIcons.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jpIcons.setFocusable(false);

        jbtnHome.setBackground(new java.awt.Color(255, 255, 255));
        jbtnHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnHome.setForeground(new java.awt.Color(0, 0, 0));
        jbtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-casa-40_1.png"))); // NOI18N
        jbtnHome.setText("Home     ");
        jbtnHome.setToolTipText("");
        jbtnHome.setBorder(null);
        jbtnHome.setBorderPainted(false);
        jbtnHome.setContentAreaFilled(false);
        jbtnHome.setFocusPainted(false);
        jbtnHome.setFocusable(false);
        jbtnHome.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jbtnHome.setOpaque(true);
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
        jbtnAddPost.setToolTipText("");
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
        jbtnAddFriends.setToolTipText("");
        jbtnAddFriends.setBorder(null);
        jbtnAddFriends.setFocusPainted(false);
        jbtnAddFriends.setFocusable(false);
        jbtnAddFriends.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
        jbtnShowFriends.setToolTipText("");
        jbtnShowFriends.setBorder(null);
        jbtnShowFriends.setFocusPainted(false);
        jbtnShowFriends.setFocusable(false);
        jbtnShowFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnShowFriendsActionPerformed(evt);
            }
        });

        jlIconImagran.setBackground(new java.awt.Color(255, 255, 255));
        jlIconImagran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-Imagran-panel-Icons.png"))); // NOI18N

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

        jbtnSearchFriends1.setBackground(new java.awt.Color(255, 255, 255));
        jbtnSearchFriends1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnSearchFriends1.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSearchFriends1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-lupa-35.png"))); // NOI18N
        jbtnSearchFriends1.setText("Search \nfriends");
        jbtnSearchFriends1.setToolTipText("");
        jbtnSearchFriends1.setBorder(null);
        jbtnSearchFriends1.setFocusPainted(false);
        jbtnSearchFriends1.setFocusable(false);
        jbtnSearchFriends1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchFriends1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpIconsLayout = new javax.swing.GroupLayout(jpIcons);
        jpIcons.setLayout(jpIconsLayout);
        jpIconsLayout.setHorizontalGroup(
            jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIconsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jpIconsLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnAddPost)
                            .addComponent(jbtnAddFriends)
                            .addComponent(jbtnShowFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnLogOut))))
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpIconsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIconImagran, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnSearchFriends1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpIconsLayout.setVerticalGroup(
            jpIconsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpIconsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
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
                .addComponent(jbtnSearchFriends1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(jbtnLogOut)
                .addContainerGap())
        );

        jPanel1.add(jpIcons, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 680));

        jpFriends.setBackground(new java.awt.Color(255, 255, 255));
        jpFriends.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jlFriends.setFont(new java.awt.Font("RTL-Adam Script Heavy", 1, 24)); // NOI18N
        jlFriends.setForeground(new java.awt.Color(0, 0, 51));
        jlFriends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-post.png"))); // NOI18N

        jbtnLeft.setBackground(new java.awt.Color(255, 255, 255));
        jbtnLeft.setForeground(new java.awt.Color(102, 102, 102));
        jbtnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-izquierda-en-cuadrado-50.png"))); // NOI18N
        jbtnLeft.setToolTipText("left");
        jbtnLeft.setBorderPainted(false);
        jbtnLeft.setFocusPainted(false);
        jbtnLeft.setFocusable(false);
        jbtnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLeftActionPerformed(evt);
            }
        });

        jbtnRight.setBackground(new java.awt.Color(255, 255, 255));
        jbtnRight.setForeground(new java.awt.Color(102, 102, 102));
        jbtnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-derecha-en-cuadrado-50.png"))); // NOI18N
        jbtnRight.setToolTipText("right");
        jbtnRight.setBorderPainted(false);
        jbtnRight.setFocusPainted(false);
        jbtnRight.setFocusable(false);
        jbtnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRightActionPerformed(evt);
            }
        });

        jtaShowFriends.setEditable(false);
        jtaShowFriends.setBackground(new java.awt.Color(255, 255, 255));
        jtaShowFriends.setColumns(20);
        jtaShowFriends.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtaShowFriends.setForeground(new java.awt.Color(153, 153, 153));
        jtaShowFriends.setRows(5);
        jtaShowFriends.setText("\n");
        jtaShowFriends.setToolTipText("Friends");
        jtaShowFriends.setBorder(null);
        jtaShowFriends.setCaretColor(new java.awt.Color(153, 153, 153));
        jtaShowFriends.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtaShowFriends.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jtaShowFriends.setEnabled(false);
        jtaShowFriends.setFocusable(false);
        jtaShowFriends.setRequestFocusEnabled(false);
        jtaShowFriends.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(jtaShowFriends);

        jlThoughts.setBackground(new java.awt.Color(255, 255, 255));
        jlThoughts.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlThoughts.setForeground(new java.awt.Color(0, 0, 0));
        jlThoughts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icon-Throughts.png"))); // NOI18N

        jtaPost.setBackground(new java.awt.Color(204, 204, 204));
        jtaPost.setColumns(20);
        jtaPost.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtaPost.setForeground(new java.awt.Color(0, 0, 0));
        jtaPost.setRows(5);
        jtaPost.setText("Se hace con pilas");
        jtaPost.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jtaPost.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jtaPost);

        jbtnUp.setBackground(new java.awt.Color(255, 255, 255));
        jbtnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dispositivo-gps-40.png"))); // NOI18N
        jbtnUp.setToolTipText("Up");
        jbtnUp.setBorder(null);
        jbtnUp.setBorderPainted(false);
        jbtnUp.setFocusPainted(false);
        jbtnUp.setFocusable(false);
        jbtnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpActionPerformed(evt);
            }
        });

        jbtnDown.setBackground(new java.awt.Color(255, 255, 255));
        jbtnDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-dispositivo-gps-abajo-40.png"))); // NOI18N
        jbtnDown.setToolTipText("Down");
        jbtnDown.setBorder(null);
        jbtnDown.setBorderPainted(false);
        jbtnDown.setFocusPainted(false);
        jbtnDown.setFocusable(false);
        jbtnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFriendsLayout = new javax.swing.GroupLayout(jpFriends);
        jpFriends.setLayout(jpFriendsLayout);
        jpFriendsLayout.setHorizontalGroup(
            jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFriendsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFriendsLayout.createSequentialGroup()
                        .addComponent(jbtnUp)
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFriendsLayout.createSequentialGroup()
                        .addComponent(jbtnDown)
                        .addGap(336, 336, 336))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFriendsLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))))
            .addGroup(jpFriendsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jbtnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFriends)
                    .addGroup(jpFriendsLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlThoughts))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jpFriendsLayout.setVerticalGroup(
            jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFriendsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jlFriends, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnDown)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jlThoughts)
                .addGap(18, 18, 18)
                .addGroup(jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFriendsLayout.createSequentialGroup()
                        .addComponent(jbtnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFriendsLayout.createSequentialGroup()
                        .addGroup(jpFriendsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );

        jPanel1.add(jpFriends, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 720, 680));

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondo imagran.png"))); // NOI18N
        jPanel1.add(jlBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

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

    private void jbtnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLeftActionPerformed

    }//GEN-LAST:event_jbtnLeftActionPerformed

    private void jbtnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRightActionPerformed

    }//GEN-LAST:event_jbtnRightActionPerformed

    private void jbtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHomeActionPerformed
        if (jbtnHome == evt.getSource()) {
            JFFeed jff = new JFFeed(this.user);
            jff.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtnHomeActionPerformed

    private void jbtnAddPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddPostActionPerformed
        if (jbtnAddPost == evt.getSource()) {
            JFAddPost jfap = new JFAddPost(this.user);
            jfap.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtnAddPostActionPerformed

    private void jbtnAddFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddFriendsActionPerformed
        JFFriendRequests jff = new JFFriendRequests(this.user);
        jff.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnAddFriendsActionPerformed

    private void jbtnShowFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnShowFriendsActionPerformed
        if (jbtnShowFriends == evt.getSource()) {
            JFShowFriends jfap = new JFShowFriends(this.user);
            jfap.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtnShowFriendsActionPerformed

    private void jbtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogOutActionPerformed
        if (jbtnLogOut == evt.getSource()) {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnLogOutActionPerformed

    private void jbtnSearchFriends1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchFriends1ActionPerformed
        if (this.jbtnSearchFriends1 == evt.getSource()) {
            JFSearchFriends jfSF = new JFSearchFriends(user);
            jfSF.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbtnSearchFriends1ActionPerformed

    private void jbtnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpActionPerformed
        this.button.moveRight(stack);
        if (stack != null) {
            if (!stack.isEmpty() && stack.top() != null) {
                this.jtaPost.setText("" + this.stack.top());
            } else {
                this.jtaPost.setText("");

            }
        }
    }//GEN-LAST:event_jbtnUpActionPerformed

    private void jbtnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDownActionPerformed
        this.button.moveLeft(stack);
        if (stack != null) {
            if (!stack.isEmpty() && stack.top() != null) {
                this.jtaPost.setText("" + this.stack.top());
            } else {
                this.jtaPost.setText("");

            }
        }
    }//GEN-LAST:event_jbtnDownActionPerformed

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
            java.util.logging.Logger.getLogger(JFFeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFFeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFFeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFFeed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnAddFriends;
    private javax.swing.JButton jbtnAddPost;
    private javax.swing.JButton jbtnDown;
    private javax.swing.JButton jbtnHome;
    private javax.swing.JButton jbtnLeft;
    private javax.swing.JButton jbtnLogOut;
    private javax.swing.JButton jbtnRight;
    private javax.swing.JButton jbtnSearchFriends1;
    private javax.swing.JButton jbtnShowFriends;
    private javax.swing.JButton jbtnUp;
    private javax.swing.JLabel jlBackground;
    private javax.swing.JLabel jlFriends;
    private javax.swing.JLabel jlIconImagran;
    private javax.swing.JLabel jlThoughts;
    private javax.swing.JPanel jpFriends;
    private javax.swing.JPanel jpIcons;
    private javax.swing.JTextArea jtaPost;
    private javax.swing.JTextArea jtaShowFriends;
    // End of variables declaration//GEN-END:variables
}
