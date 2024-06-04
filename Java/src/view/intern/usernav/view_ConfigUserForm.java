package view.intern.usernav;

import java.util.Arrays;
import javax.swing.JOptionPane;
import model.User;
import view.view_UserNavigation;


public class view_ConfigUserForm extends javax.swing.JInternalFrame {

    public view_ConfigUserForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fldName = new javax.swing.JTextField();
        fldEmail = new javax.swing.JTextField();
        fldPhone = new javax.swing.JTextField();
        fldUsername = new javax.swing.JTextField();
        fldPassword = new javax.swing.JPasswordField();
        fldNewPass = new javax.swing.JPasswordField();
        lblUsername = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        lblUsername2 = new javax.swing.JLabel();
        lblUsername3 = new javax.swing.JLabel();
        lblUsername4 = new javax.swing.JLabel();
        lblUsername5 = new javax.swing.JLabel();
        btnSaveData = new javax.swing.JButton();
        btnEditData = new javax.swing.JButton();
        cbVisiblePass = new javax.swing.JCheckBox();

        setClosable(true);
        setTitle("Configuration");

        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        fldName.setBackground(new java.awt.Color(240, 240, 240));
        fldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldName.setForeground(new java.awt.Color(0, 0, 0));
        fldName.setEnabled(false);
        fldName.setMargin(new java.awt.Insets(2, 18, 2, 18));

        fldEmail.setBackground(new java.awt.Color(240, 240, 240));
        fldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldEmail.setForeground(new java.awt.Color(0, 0, 0));
        fldEmail.setEnabled(false);
        fldEmail.setMargin(new java.awt.Insets(2, 18, 2, 18));

        fldPhone.setBackground(new java.awt.Color(240, 240, 240));
        fldPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldPhone.setForeground(new java.awt.Color(0, 0, 0));
        fldPhone.setEnabled(false);
        fldPhone.setMargin(new java.awt.Insets(2, 18, 2, 18));

        fldUsername.setBackground(new java.awt.Color(240, 240, 240));
        fldUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldUsername.setForeground(new java.awt.Color(0, 0, 0));
        fldUsername.setEnabled(false);
        fldUsername.setMargin(new java.awt.Insets(2, 18, 2, 18));

        fldPassword.setBackground(new java.awt.Color(240, 240, 240));
        fldPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldPassword.setForeground(new java.awt.Color(0, 0, 0));
        fldPassword.setEnabled(false);
        fldPassword.setMargin(new java.awt.Insets(2, 18, 2, 18));

        fldNewPass.setBackground(new java.awt.Color(240, 240, 240));
        fldNewPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldNewPass.setForeground(new java.awt.Color(0, 0, 0));
        fldNewPass.setEnabled(false);
        fldNewPass.setMargin(new java.awt.Insets(2, 18, 2, 18));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername.setText("Name *");
        lblUsername.setToolTipText("");

        lblUsername1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername1.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername1.setText("E-mail *");
        lblUsername1.setToolTipText("");

        lblUsername2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername2.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername2.setText("Username *");
        lblUsername2.setToolTipText("");

        lblUsername3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername3.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername3.setText("Phone");
        lblUsername3.setToolTipText("");

        lblUsername4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername4.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername4.setText("Password");
        lblUsername4.setToolTipText("");

        lblUsername5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername5.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername5.setText("New Password");
        lblUsername5.setToolTipText("");

        btnSaveData.setBackground(new java.awt.Color(218, 218, 218));
        btnSaveData.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSaveData.setForeground(new java.awt.Color(0, 0, 0));
        btnSaveData.setText("Save");
        btnSaveData.setToolTipText("");
        btnSaveData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSaveData.setEnabled(false);
        btnSaveData.setFocusPainted(false);
        btnSaveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveDataActionPerformed(evt);
            }
        });

        btnEditData.setBackground(new java.awt.Color(218, 218, 218));
        btnEditData.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnEditData.setForeground(new java.awt.Color(0, 0, 0));
        btnEditData.setText("Edit");
        btnEditData.setToolTipText("");
        btnEditData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditData.setFocusPainted(false);
        btnEditData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDataActionPerformed(evt);
            }
        });

        cbVisiblePass.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbVisiblePass.setForeground(new java.awt.Color(0, 0, 0));
        cbVisiblePass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbVisiblePass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cbVisiblePass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cbVisiblePass.setRequestFocusEnabled(false);
        cbVisiblePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVisiblePassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUsername1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblUsername2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblUsername5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblUsername4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbVisiblePass)))
                    .addComponent(lblUsername3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fldNewPass, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fldPassword)
                    .addComponent(fldUsername)
                    .addComponent(fldPhone)
                    .addComponent(fldEmail)
                    .addComponent(fldName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditData, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUsername4))
                    .addComponent(cbVisiblePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditData, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void btnSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveDataActionPerformed
        SaveNewData();
    }//GEN-LAST:event_btnSaveDataActionPerformed

    private void btnEditDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDataActionPerformed
        EnableEditData(true);
    }//GEN-LAST:event_btnEditDataActionPerformed

    private void cbVisiblePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVisiblePassActionPerformed
        if (cbVisiblePass.isSelected())
        {
            fldPassword.setEchoChar((char)0);
            fldNewPass.setEchoChar((char)0);
        }
        else
        {
            fldPassword.setEchoChar((char)8226);
            fldNewPass.setEchoChar((char)8226);
        }
    }//GEN-LAST:event_cbVisiblePassActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditData;
    private javax.swing.JButton btnSaveData;
    private javax.swing.JCheckBox cbVisiblePass;
    private javax.swing.JTextField fldEmail;
    private javax.swing.JTextField fldName;
    private javax.swing.JPasswordField fldNewPass;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JTextField fldPhone;
    private javax.swing.JTextField fldUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JLabel lblUsername4;
    private javax.swing.JLabel lblUsername5;
    // End of variables declaration//GEN-END:variables

    private User activeUser;
    
    private view_UserNavigation userNavigationView;
    
    private char[] activeUserPassword;
    
    public void setUser(User user) {
        this.activeUser = user;
        
        fldName.setText(user.getName());
        fldEmail.setText(user.getEmail());
        fldPhone.setText(user.getPhone());
        fldUsername.setText(user.getUserName());
        activeUserPassword = user.getPassword();
    }
    
    public void SetUserNavigationView(view_UserNavigation nav) {
        userNavigationView = nav;
    }
    
    public void EnableEditData(boolean state)
    {
        fldName.setEnabled(state);
        fldEmail.setEnabled(state);
        fldPhone.setEnabled(state);
        fldUsername.setEnabled(state);
        fldPassword.setEnabled(state);
        fldNewPass.setEnabled(state);
        btnSaveData.setEnabled(state);
        btnEditData.setEnabled(!state);
    }
    
    public void SaveNewData()
    {
        if (fldName.getText().isEmpty() || fldEmail.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Fill in all fields.");
            return;
        }
        
        if (fldNewPass.getPassword().length <= 0 && fldPassword.getPassword().length > 0)
        {
            JOptionPane.showMessageDialog(null, "'New Password' is empty.");
            return;
        }
        
        if (fldNewPass.getPassword().length > 0 && fldPassword.getPassword().length <= 0)
        {
            JOptionPane.showMessageDialog(null, "'Password' is empty.");
            return;
        }
        
        if (!Arrays.equals(activeUserPassword, fldPassword.getPassword()) && fldPassword.getPassword().length > 0)
        {
            JOptionPane.showMessageDialog(null, "Password do not match.");
            return;
        }
        
        if (fldPhone.getText().length() > 0)
        {
             try {
                    Long.parseLong(fldPhone.getText());
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    return;
            }   
        }
        
        activeUser.setName(fldName.getText());
        activeUser.setEmail(fldEmail.getText());
        activeUser.setPhone(fldPhone.getText());
        activeUser.setUserName(fldUsername.getText());
        
        if (fldNewPass.getPassword().length > 0 && fldPassword.getPassword().length > 0) 
            activeUser.setPassword(fldNewPass.getPassword());
        
        JOptionPane.showMessageDialog(null, "Success!");
        
        userNavigationView.SetTexts();
        dispose();
    }
}
