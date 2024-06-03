package view.intern.usernav;

import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import model.User;
import view.view_UserNavigation;


public class view_UserDailyCheckIn extends javax.swing.JInternalFrame {

    public view_UserDailyCheckIn() {
        initComponents();
        SetDate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCheckIn = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Daily Check in");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCheckIn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnCheckIn.setForeground(new java.awt.Color(0, 0, 0));
        btnCheckIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCheckIn.setText("22");
        btnCheckIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCheckIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckInMouseClicked
        btnCheckIn.setEnabled(false);
        
        MouseListener[] listener = btnCheckIn.getMouseListeners();
        btnCheckIn.removeMouseListener(listener[0]);
        
        CheckIn();
    }//GEN-LAST:event_btnCheckInMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCheckIn;
    private javax.swing.JButton btnEditData;
    private javax.swing.JButton btnEditData1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private User activeUser;
        
    private LocalDate localDate = LocalDate.now();
    private Random rand = new Random();
    
    public void setUser(User user) {
        this.activeUser = user;
    }
    
    public void SetDate()
    {
        btnCheckIn.setText(String.valueOf(localDate.getDayOfMonth()));
    }
    
    public void CheckIn()
    {
        int intRand = rand.nextInt(9) + 1;
        JOptionPane.showMessageDialog(null, "You won " + intRand  + " coins.");
        // add to class Gameplay the coins where id = activeUser.getId();
    }
}
