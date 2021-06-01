/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.dialog;

/**
 *
 * @author Minh Tu
 */
public class SelectIngredients extends javax.swing.JDialog {

    /**
     * Creates new form selectIngredients
     */
    public SelectIngredients(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        label_titleSelectIngre = new javax.swing.JLabel();
        scrollPane_IngredientList = new javax.swing.JScrollPane();
        table_IngredientList = new javax.swing.JTable();
        scrollPane_selectedIngredients = new javax.swing.JScrollPane();
        table_selectedIngredients = new javax.swing.JTable();
        seperator = new javax.swing.JSeparator();
        label_IngredientList = new javax.swing.JLabel();
        label_SelectedIngredients = new javax.swing.JLabel();
        button_Choose = new javax.swing.JButton();
        panel_Buttons = new javax.swing.JPanel();
        button_Remove = new javax.swing.JButton();
        button_Clear = new javax.swing.JButton();
        button_SaveAllChanges = new javax.swing.JButton();
        label_ProductName = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        label_titleSelectIngre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_titleSelectIngre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_titleSelectIngre.setText("Select/Modify Ingredient For");

        table_IngredientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Type", "Unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane_IngredientList.setViewportView(table_IngredientList);

        table_selectedIngredients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Type", "Unit", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPane_selectedIngredients.setViewportView(table_selectedIngredients);

        seperator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        label_IngredientList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_IngredientList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_IngredientList.setText("Ingredient list");

        label_SelectedIngredients.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_SelectedIngredients.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_SelectedIngredients.setText("Selected ingredients");

        button_Choose.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        button_Choose.setText("Choose");

        panel_Buttons.setBackground(new java.awt.Color(255, 255, 255));
        panel_Buttons.setLayout(new java.awt.GridLayout(1, 0, 40, 0));

        button_Remove.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        button_Remove.setText("Remove");
        panel_Buttons.add(button_Remove);

        button_Clear.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        button_Clear.setText("Clear");
        panel_Buttons.add(button_Clear);

        button_SaveAllChanges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_save-all-changes.png"))); // NOI18N
        button_SaveAllChanges.setContentAreaFilled(false);
        button_SaveAllChanges.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        label_ProductName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label_ProductName.setForeground(new java.awt.Color(255, 51, 0));
        label_ProductName.setText("<Name>");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_cancel_50.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 119, Short.MAX_VALUE)
                        .addComponent(label_titleSelectIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_SaveAllChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label_IngredientList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(scrollPane_IngredientList, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_SelectedIngredients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollPane_selectedIngredients)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(button_Choose, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Buttons, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_titleSelectIngre)
                    .addComponent(label_ProductName))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(252, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(scrollPane_IngredientList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_SelectedIngredients)
                                    .addComponent(label_IngredientList))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollPane_selectedIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel_Buttons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Choose, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_SaveAllChanges)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectIngredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectIngredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectIngredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectIngredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SelectIngredients dialog = new SelectIngredients(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Choose;
    private javax.swing.JButton button_Clear;
    private javax.swing.JButton button_Remove;
    private javax.swing.JButton button_SaveAllChanges;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel label_IngredientList;
    private javax.swing.JLabel label_ProductName;
    private javax.swing.JLabel label_SelectedIngredients;
    private javax.swing.JLabel label_titleSelectIngre;
    private javax.swing.JPanel panel_Buttons;
    private javax.swing.JScrollPane scrollPane_IngredientList;
    private javax.swing.JScrollPane scrollPane_selectedIngredients;
    private javax.swing.JSeparator seperator;
    private javax.swing.JTable table_IngredientList;
    private javax.swing.JTable table_selectedIngredients;
    // End of variables declaration//GEN-END:variables
}
