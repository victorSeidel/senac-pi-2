package view;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import model.User;
import model.UserList;

public class view_Login extends javax.swing.JFrame {

    public view_Login() {
        initComponents();
        
        char[] p = {'a'};
        char[] b = {'b'};
        User newAdmin= new User("a", p, true);
        User newUser = new User("b", b, false);
        UserList.addUser(newUser);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelWhite = new javax.swing.JPanel();
        lblLoginTitle = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblNoAccount = new javax.swing.JLabel();
        btnRegister = new javax.swing.JLabel();
        fldUsername = new javax.swing.JTextField();
        fldPassword = new javax.swing.JPasswordField();
        cbVisiblePass = new javax.swing.JCheckBox();
        panelGray = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelWhite.setBackground(new java.awt.Color(240, 240, 240));
        panelWhite.setForeground(new java.awt.Color(204, 204, 204));

        lblLoginTitle.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        lblLoginTitle.setForeground(new java.awt.Color(51, 51, 51));
        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Login");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(51, 51, 51));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setLabelFor(this);
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(51, 51, 51));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setLabelFor(this);
        lblPassword.setText("Password");

        btnLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setToolTipText("");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblNoAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNoAccount.setForeground(new java.awt.Color(51, 51, 51));
        lblNoAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblNoAccount.setLabelFor(this);
        lblNoAccount.setText("Do not have an account?");

        btnRegister.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(51, 51, 51));
        btnRegister.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegister.setLabelFor(this);
        btnRegister.setText("Sign Up");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });

        fldUsername.setBackground(new java.awt.Color(240, 240, 240));
        fldUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldUsername.setForeground(new java.awt.Color(0, 0, 0));
        fldUsername.setMargin(new java.awt.Insets(2, 18, 2, 18));

        fldPassword.setBackground(new java.awt.Color(240, 240, 240));
        fldPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldPassword.setForeground(new java.awt.Color(0, 0, 0));
        fldPassword.setMargin(new java.awt.Insets(2, 18, 2, 18));

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

        javax.swing.GroupLayout panelWhiteLayout = new javax.swing.GroupLayout(panelWhite);
        panelWhite.setLayout(panelWhiteLayout);
        panelWhiteLayout.setHorizontalGroup(
            panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLoginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelWhiteLayout.createSequentialGroup()
                .addGroup(panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelWhiteLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelWhiteLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbVisiblePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelWhiteLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(fldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelWhiteLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addGroup(panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelWhiteLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lblNoAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelWhiteLayout.setVerticalGroup(
            panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWhiteLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblLoginTitle)
                .addGap(31, 31, 31)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbVisiblePass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNoAccount)
                    .addComponent(btnRegister))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        getContentPane().add(panelWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 360, 420));

        panelGray.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout panelGrayLayout = new javax.swing.GroupLayout(panelGray);
        panelGray.setLayout(panelGrayLayout);
        panelGrayLayout.setHorizontalGroup(
            panelGrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        panelGrayLayout.setVerticalGroup(
            panelGrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(panelGray, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Login();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void cbVisiblePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVisiblePassActionPerformed
        if (cbVisiblePass.isSelected()) 
            fldPassword.setEchoChar((char)0);
        else 
            fldPassword.setEchoChar((char)8226);
    }//GEN-LAST:event_cbVisiblePassActionPerformed

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        view_Register registerView = new view_Register();
        registerView.setVisible(true);
    }//GEN-LAST:event_btnRegisterMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JCheckBox cbVisiblePass;
    private javax.swing.JPasswordField fldPassword;
    private javax.swing.JTextField fldUsername;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblNoAccount;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panelGray;
    private javax.swing.JPanel panelWhite;
    // End of variables declaration//GEN-END:variables

    User activeUser;
    String  username;
    char[] password;
    
    public void GetData()
    {
        username = fldUsername.getText();
        password = fldPassword.getPassword();
    }
    
    public void Login()
    {
        if (!Verify()) return;
        
        fldUsername.setText("");
        fldPassword.setText("");
        cbVisiblePass.setSelected(false);
        
        if (activeUser.isAdmin())
        {
            view_Navigation navigationView = new view_Navigation();
            navigationView.setVisible(true);   
        }
        else 
        {
            view_UserNavigation userNavigationView = new view_UserNavigation();
            
            userNavigationView.setUser(activeUser);
            
            userNavigationView.setVisible(true);   
        }
        
        dispose();
    }
    
    public boolean Verify()
    {
        GetData();
        
        List<User> userList = UserList.getUserList();
        
        for (int i = 0; i < userList.size(); i++)
        {
            if (username.equals(userList.get(i).getUserName()) && 
                    Arrays.equals(password, userList.get(i).getPassword()))
            {
                activeUser = userList.get(i);
                return true;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Username or Password incorrect.");
        return false;
    }
}
