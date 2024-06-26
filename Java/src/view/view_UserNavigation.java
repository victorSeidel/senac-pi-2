/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.User;
import view.intern.usernav.view_ConfigUserForm;
import view.intern.usernav.view_UserDailyCheckIn;

/**
 *
 * @author victo
 */
public class view_UserNavigation extends javax.swing.JFrame {

    /**
     * Creates new form view_UserNavigation
     */
    public view_UserNavigation() {
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
        txtUserName = new javax.swing.JLabel();
        btnConfigUser = new javax.swing.JButton();
        txtCoins = new javax.swing.JLabel();
        btnCheckin = new javax.swing.JButton();
        btnMiniGames = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnShop = new javax.swing.JButton();
        desktopPanel = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Navigation");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(180, 180, 180));

        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 0, 0));
        txtUserName.setText("Hello, name");

        btnConfigUser.setBackground(new java.awt.Color(240, 240, 240));
        btnConfigUser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnConfigUser.setForeground(new java.awt.Color(0, 0, 0));
        btnConfigUser.setToolTipText("");
        btnConfigUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfigUser.setFocusPainted(false);
        btnConfigUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigUserActionPerformed(evt);
            }
        });

        txtCoins.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCoins.setForeground(new java.awt.Color(0, 0, 0));
        txtCoins.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCoins.setText("000 coins");

        btnCheckin.setBackground(new java.awt.Color(180, 180, 180));
        btnCheckin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnCheckin.setForeground(new java.awt.Color(0, 0, 0));
        btnCheckin.setText("Daily Check in");
        btnCheckin.setToolTipText("");
        btnCheckin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCheckin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckin.setFocusPainted(false);
        btnCheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckinActionPerformed(evt);
            }
        });

        btnMiniGames.setBackground(new java.awt.Color(180, 180, 180));
        btnMiniGames.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnMiniGames.setForeground(new java.awt.Color(0, 0, 0));
        btnMiniGames.setText("Mini Games");
        btnMiniGames.setToolTipText("");
        btnMiniGames.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMiniGames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMiniGames.setFocusPainted(false);
        btnMiniGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiniGamesActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(180, 180, 180));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setText("Log Out");
        btnLogout.setToolTipText("");
        btnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setFocusPainted(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnShop.setBackground(new java.awt.Color(180, 180, 180));
        btnShop.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnShop.setForeground(new java.awt.Color(0, 0, 0));
        btnShop.setText("Shop");
        btnShop.setToolTipText("");
        btnShop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnShop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShop.setFocusPainted(false);
        btnShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCoins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCheckin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfigUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMiniGames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfigUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(txtCoins, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMiniGames, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 520));

        desktopPanel.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout desktopPanelLayout = new javax.swing.GroupLayout(desktopPanel);
        desktopPanel.setLayout(desktopPanelLayout);
        desktopPanelLayout.setHorizontalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        desktopPanelLayout.setVerticalGroup(
            desktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(desktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 530, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        view_Login loginView = new view_Login();
        loginView.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnCheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckinActionPerformed
        view_UserDailyCheckIn userDailyCheckIn = new view_UserDailyCheckIn();
        desktopPanel.add(userDailyCheckIn);
        userDailyCheckIn.setUser(getUser());
        userDailyCheckIn.setVisible(true);
    }//GEN-LAST:event_btnCheckinActionPerformed

    private void btnShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShopActionPerformed

    private void btnMiniGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiniGamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMiniGamesActionPerformed

    private void btnConfigUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigUserActionPerformed
        view_ConfigUserForm configUserFormView = new view_ConfigUserForm();
        desktopPanel.add(configUserFormView);
        configUserFormView.setUser(getUser());
        configUserFormView.SetUserNavigationView(this);
        configUserFormView.setVisible(true);
    }//GEN-LAST:event_btnConfigUserActionPerformed

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
            java.util.logging.Logger.getLogger(view_UserNavigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_UserNavigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_UserNavigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_UserNavigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_UserNavigation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckin;
    private javax.swing.JButton btnConfigUser;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMiniGames;
    private javax.swing.JButton btnShop;
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtCoins;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables

    private User activeUser;
    
    public void setUser(User user) {
        this.activeUser = user;
        
        SetTexts();
    }
    
    public User getUser() {
        return activeUser;
    }
    
    public void SetTexts() {
        txtUserName.setText("Hello, " + getUser().getName());
    }
}
