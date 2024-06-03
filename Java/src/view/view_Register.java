package view;

import java.util.Arrays;
import javax.swing.JOptionPane;
import model.User;
import model.UserList;

public class view_Register extends javax.swing.JFrame {

    public view_Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWhite = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        fldName = new javax.swing.JTextField();
        lblUsername1 = new javax.swing.JLabel();
        fldEmail = new javax.swing.JTextField();
        lblUsername2 = new javax.swing.JLabel();
        fldPhone = new javax.swing.JTextField();
        lblLoginTitle1 = new javax.swing.JLabel();
        panelGray = new javax.swing.JPanel();
        lblUsername3 = new javax.swing.JLabel();
        fldUsername = new javax.swing.JTextField();
        lblUsername4 = new javax.swing.JLabel();
        lblUsername5 = new javax.swing.JLabel();
        fldPassword = new javax.swing.JPasswordField();
        fldConPassword = new javax.swing.JPasswordField();
        lblLoginTitle = new javax.swing.JLabel();
        cbVisiblePass = new javax.swing.JCheckBox();
        btnRegister = new javax.swing.JButton();
        btnBackToLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelWhite.setBackground(new java.awt.Color(240, 240, 240));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Name *");
        lblUsername.setToolTipText("");

        fldName.setBackground(new java.awt.Color(240, 240, 240));
        fldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldName.setForeground(new java.awt.Color(0, 0, 0));
        fldName.setMargin(new java.awt.Insets(2, 18, 2, 18));

        lblUsername1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername1.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername1.setText("E-mail *");

        fldEmail.setBackground(new java.awt.Color(240, 240, 240));
        fldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldEmail.setForeground(new java.awt.Color(0, 0, 0));
        fldEmail.setMargin(new java.awt.Insets(2, 18, 2, 18));

        lblUsername2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername2.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername2.setText("Phone (only numbers)");

        fldPhone.setBackground(new java.awt.Color(240, 240, 240));
        fldPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldPhone.setForeground(new java.awt.Color(0, 0, 0));
        fldPhone.setMargin(new java.awt.Insets(2, 18, 2, 18));

        lblLoginTitle1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblLoginTitle1.setForeground(new java.awt.Color(60, 63, 65));
        lblLoginTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle1.setText("Personal Data");

        javax.swing.GroupLayout panelWhiteLayout = new javax.swing.GroupLayout(panelWhite);
        panelWhite.setLayout(panelWhiteLayout);
        panelWhiteLayout.setHorizontalGroup(
            panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLoginTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelWhiteLayout.createSequentialGroup()
                .addGroup(panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelWhiteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelWhiteLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelWhiteLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelWhiteLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelWhiteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelWhiteLayout.setVerticalGroup(
            panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWhiteLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblLoginTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(panelWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 420));

        panelGray.setBackground(new java.awt.Color(102, 102, 102));

        lblUsername3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername3.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername3.setText("Username *");
        lblUsername3.setToolTipText("");

        fldUsername.setBackground(new java.awt.Color(102, 102, 102));
        fldUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldUsername.setForeground(new java.awt.Color(255, 255, 255));
        fldUsername.setMargin(new java.awt.Insets(2, 18, 2, 18));

        lblUsername4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername4.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername4.setText("Password *");
        lblUsername4.setToolTipText("");

        lblUsername5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername5.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername5.setText("Confirm password *");
        lblUsername5.setToolTipText("");

        fldPassword.setBackground(new java.awt.Color(102, 102, 102));
        fldPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldPassword.setForeground(new java.awt.Color(255, 255, 255));
        fldPassword.setMargin(new java.awt.Insets(2, 18, 2, 18));

        fldConPassword.setBackground(new java.awt.Color(102, 102, 102));
        fldConPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldConPassword.setForeground(new java.awt.Color(255, 255, 255));
        fldConPassword.setMargin(new java.awt.Insets(2, 18, 2, 18));

        lblLoginTitle.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Create Account");

        cbVisiblePass.setBackground(new java.awt.Color(102, 102, 102));
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

        btnRegister.setBackground(new java.awt.Color(240, 240, 240));
        btnRegister.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("Sign Up");
        btnRegister.setToolTipText("");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.setFocusPainted(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnBackToLogin.setBackground(new java.awt.Color(240, 240, 240));
        btnBackToLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnBackToLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnBackToLogin.setText("Cancel");
        btnBackToLogin.setToolTipText("");
        btnBackToLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackToLogin.setFocusPainted(false);
        btnBackToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGrayLayout = new javax.swing.GroupLayout(panelGray);
        panelGray.setLayout(panelGrayLayout);
        panelGrayLayout.setHorizontalGroup(
            panelGrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrayLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelGrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fldConPassword)
                    .addComponent(fldUsername)
                    .addComponent(fldPassword)
                    .addGroup(panelGrayLayout.createSequentialGroup()
                        .addGroup(panelGrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelGrayLayout.createSequentialGroup()
                        .addComponent(lblUsername4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(cbVisiblePass, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGrayLayout.createSequentialGroup()
                        .addComponent(btnBackToLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(lblLoginTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelGrayLayout.setVerticalGroup(
            panelGrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGrayLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblLoginTitle)
                .addGap(18, 18, 18)
                .addComponent(lblUsername3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsername4)
                    .addComponent(cbVisiblePass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldConPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelGrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(panelGray, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 360, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbVisiblePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVisiblePassActionPerformed
        if (cbVisiblePass.isSelected())
        {
            fldPassword.setEchoChar((char)0);
            fldConPassword.setEchoChar((char)0);
        }

        else
        {
            fldPassword.setEchoChar((char)8226);   
            fldConPassword.setEchoChar((char)8226);
        }
    }//GEN-LAST:event_cbVisiblePassActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        SignUp();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnBackToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToLoginActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackToLoginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox cbVisiblePass;
    private javax.swing.JPasswordField fldConPassword;
    private javax.swing.JTextField fldEmail;
    private javax.swing.JTextField fldName;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JTextField fldPhone;
    private javax.swing.JTextField fldUsername;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblLoginTitle1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    private javax.swing.JLabel lblUsername3;
    private javax.swing.JLabel lblUsername4;
    private javax.swing.JLabel lblUsername5;
    private javax.swing.JPanel panelGray;
    private javax.swing.JPanel panelWhite;
    // End of variables declaration//GEN-END:variables

    String name, email, phone, username;
    char[] password, conPassword;
    
    public void GetData()
    {
        name = fldName.getText();
        email = fldEmail.getText();
        phone = fldPhone.getText();
        username = fldUsername.getText();
        password = fldPassword.getPassword();
        conPassword = fldConPassword.getPassword();
    }
    
    public void SignUp()
    {
        if (!Verify()) return;
        
        User newUser = new User(name, username, email, phone, password, false);
        UserList.addUser(newUser);
        
        JOptionPane.showMessageDialog(null, "Success!");
        
        fldName.setText("");
        fldUsername.setText("");
        fldEmail.setText("");
        fldPhone.setText("");
        fldPassword.setText("");
        fldConPassword.setText("");
        cbVisiblePass.setSelected(false);
        
        dispose();
    }
    
    public boolean Verify()
    {
        GetData();
        
        if (name.isEmpty() || email.isEmpty() || username.isEmpty() || password.length <= 0)
        {
            JOptionPane.showMessageDialog(null, "Fill in all fields.");
            return false;
        }
        
        if (!Arrays.equals(password, conPassword))
        {
            JOptionPane.showMessageDialog(null, "Password do not match.");
            return false;
        }
        
        if (!fldPhone.getText().isEmpty())
        {
            try {
                    Long.parseLong(fldPhone.getText());
            } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Phone Error: " + e);
                    return false;
            }
        }
        
        return true;
    }
}
