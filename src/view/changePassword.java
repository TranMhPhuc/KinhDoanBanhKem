/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author TRUONG MINH TAN
 */
public class changePassword extends javax.swing.JFrame {

    /**
     * Creates new form changePassword
     */
    public changePassword() {
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

        label_changePass = new javax.swing.JLabel();
        label_oldPass = new javax.swing.JLabel();
        label_newPass = new javax.swing.JLabel();
        button_changePass = new javax.swing.JButton();
        label_verifyPass = new javax.swing.JLabel();
        PWF_oldPW = new javax.swing.JPasswordField();
        PWF_newPW = new javax.swing.JPasswordField();
        PWF_verifyNewPW = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_changePass.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        label_changePass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_changePass.setText("Change your password");

        label_oldPass.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        label_oldPass.setText("Old Password ");

        label_newPass.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        label_newPass.setText("New Password");

        button_changePass.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        button_changePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buttonIMG_updatePW.png"))); // NOI18N
        button_changePass.setContentAreaFilled(false);
        button_changePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_changePassActionPerformed(evt);
            }
        });

        label_verifyPass.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        label_verifyPass.setText("Verify New Password");

        PWF_oldPW.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        PWF_newPW.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        PWF_verifyNewPW.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_changePass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_changePass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PWF_verifyNewPW, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_verifyPass)
                    .addComponent(PWF_newPW, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_newPass)
                    .addComponent(PWF_oldPW, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_oldPass))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(label_changePass)
                .addGap(22, 22, 22)
                .addComponent(label_oldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PWF_oldPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_newPass, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PWF_newPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_verifyPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PWF_verifyNewPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(button_changePass, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_changePassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_changePassActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PWF_newPW;
    private javax.swing.JPasswordField PWF_oldPW;
    private javax.swing.JPasswordField PWF_verifyNewPW;
    private javax.swing.JButton button_changePass;
    private javax.swing.JLabel label_changePass;
    private javax.swing.JLabel label_newPass;
    private javax.swing.JLabel label_oldPass;
    private javax.swing.JLabel label_verifyPass;
    // End of variables declaration//GEN-END:variables
}
