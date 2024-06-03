/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.intern.adminnav;

import javax.swing.JOptionPane;
import model.Game;
import model.GameList;
import model.User;
import model.UserList;

/**
 *
 * @author victo
 */
public class view_NewGameForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form view_NewGameForm
     */
    public view_NewGameForm() {
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
        btnCloseForm = new javax.swing.JLabel();
        btnAddGame = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();
        fldName = new javax.swing.JTextField();
        lblUsername2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fldDesc = new javax.swing.JTextArea();

        setTitle("New Game");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCloseForm.setBackground(new java.awt.Color(102, 102, 102));
        btnCloseForm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCloseForm.setForeground(new java.awt.Color(0, 0, 0));
        btnCloseForm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCloseForm.setText("CANCEL");
        btnCloseForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCloseForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseFormMouseClicked(evt);
            }
        });

        btnAddGame.setBackground(new java.awt.Color(102, 102, 102));
        btnAddGame.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddGame.setForeground(new java.awt.Color(0, 0, 0));
        btnAddGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAddGame.setText("SAVE");
        btnAddGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddGameMouseClicked(evt);
            }
        });

        lblUsername1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername1.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername1.setText("Description *");
        lblUsername1.setToolTipText("");

        fldName.setBackground(new java.awt.Color(240, 240, 240));
        fldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldName.setForeground(new java.awt.Color(0, 0, 0));
        fldName.setMargin(new java.awt.Insets(2, 18, 2, 18));
        fldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldNameActionPerformed(evt);
            }
        });

        lblUsername2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblUsername2.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername2.setText("Name *");
        lblUsername2.setToolTipText("");

        fldDesc.setBackground(new java.awt.Color(240, 240, 240));
        fldDesc.setColumns(20);
        fldDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldDesc.setForeground(new java.awt.Color(0, 0, 0));
        fldDesc.setRows(5);
        fldDesc.setMargin(new java.awt.Insets(2, 8, 2, 8));
        jScrollPane1.setViewportView(fldDesc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddGame, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fldName)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddGame, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCloseForm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseFormMouseClicked
        dispose();
    }//GEN-LAST:event_btnCloseFormMouseClicked

    private void btnAddGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddGameMouseClicked
        AddGame();
    }//GEN-LAST:event_btnAddGameMouseClicked

    private void fldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddGame;
    private javax.swing.JLabel btnCloseForm;
    private javax.swing.JTextArea fldDesc;
    private javax.swing.JTextField fldName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsername1;
    private javax.swing.JLabel lblUsername2;
    // End of variables declaration//GEN-END:variables

    String  name, desc;
    
    public void GetData()
    {
        name = fldName.getText();
        desc = fldDesc.getText();
    }
    
    public void AddGame()
    {
        if (!Verify()) return;
        
        Game newGame = new Game(name, desc);
        GameList.addGame(newGame);
        
        JOptionPane.showMessageDialog(null, "Success!");
        
        dispose();
    }
    
    public boolean Verify()
    {
        GetData();
        
        if (name.isEmpty() || desc.isEmpty() )
        {
            JOptionPane.showMessageDialog(null, "Fill in all fields.");
            return false;
        }
        
        return true;
    }
}