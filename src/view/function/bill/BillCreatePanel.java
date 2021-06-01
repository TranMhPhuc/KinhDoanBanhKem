/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.function.bill;

import javax.swing.JFrame;
import view.dialog.ExportBillDialog;

/**
 *
 * @author Minh Tu
 */
public class BillCreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form SellingPanel
     */
    ExportBillDialog exportConfirm = new ExportBillDialog(null, true);
    public BillCreatePanel() {
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

        panelProductOfferInfo = new javax.swing.JPanel();
        label_prodName = new javax.swing.JLabel();
        textfProductName = new javax.swing.JTextField();
        panelTimeUser = new javax.swing.JPanel();
        labelTitleTime = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelTitleUser = new javax.swing.JLabel();
        lableUser = new javax.swing.JLabel();
        label_prodChoose = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tableProductSelected = new javax.swing.JTable();
        btnChoose = new javax.swing.JButton();
        panel_BillInfo = new javax.swing.JPanel();
        label_billID = new javax.swing.JLabel();
        label_totalMoney = new javax.swing.JLabel();
        label_guestMoney = new javax.swing.JLabel();
        label_change = new javax.swing.JLabel();
        btnExportBill = new javax.swing.JButton();
        textfBillID = new javax.swing.JTextField();
        textfTotalMoney = new javax.swing.JTextField();
        textField_guestMoney = new javax.swing.JTextField();
        textField_Change = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tableProductOffered = new javax.swing.JTable();
        jPanel = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        label_prodChoose1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        panelProductOfferInfo.setBackground(new java.awt.Color(255, 255, 255));
        panelProductOfferInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search for products", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(190, 190, 190))); // NOI18N

        label_prodName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        label_prodName.setText("Product Name");

        textfProductName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        textfProductName.setPreferredSize(new java.awt.Dimension(160, 30));

        javax.swing.GroupLayout panelProductOfferInfoLayout = new javax.swing.GroupLayout(panelProductOfferInfo);
        panelProductOfferInfo.setLayout(panelProductOfferInfoLayout);
        panelProductOfferInfoLayout.setHorizontalGroup(
            panelProductOfferInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductOfferInfoLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(label_prodName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        panelProductOfferInfoLayout.setVerticalGroup(
            panelProductOfferInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductOfferInfoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panelProductOfferInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_prodName))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        panelTimeUser.setBackground(new java.awt.Color(255, 255, 255));
        panelTimeUser.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelTitleTime.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelTitleTime.setText("Time");

        labelTime.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelTime.setText("dd/mm/yyyy hh:mm");

        labelTitleUser.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelTitleUser.setText("User");

        lableUser.setText("____________________");

        javax.swing.GroupLayout panelTimeUserLayout = new javax.swing.GroupLayout(panelTimeUser);
        panelTimeUser.setLayout(panelTimeUserLayout);
        panelTimeUserLayout.setHorizontalGroup(
            panelTimeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimeUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitleTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(labelTitleUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lableUser)
                .addGap(37, 37, 37))
        );
        panelTimeUserLayout.setVerticalGroup(
            panelTimeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimeUserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTimeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitleTime)
                    .addComponent(labelTime)
                    .addComponent(labelTitleUser)
                    .addComponent(lableUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        label_prodChoose.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        label_prodChoose.setText("Chosen products");

        tableProductSelected.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Product", "Size", "Amount", "Price"
            }
        ));
        jScrollPane8.setViewportView(tableProductSelected);

        btnChoose.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnChoose.setText("Choose");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });

        panel_BillInfo.setBackground(new java.awt.Color(255, 255, 255));
        panel_BillInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bill information", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 14), new java.awt.Color(190, 190, 190))); // NOI18N

        label_billID.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        label_billID.setText("Bill ID");

        label_totalMoney.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        label_totalMoney.setText("Total Money");

        label_guestMoney.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        label_guestMoney.setText("Guest Money");

        label_change.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        label_change.setText("Change");

        btnExportBill.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnExportBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button_export.png"))); // NOI18N
        btnExportBill.setContentAreaFilled(false);
        btnExportBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportBill.setFocusPainted(false);
        btnExportBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportBillActionPerformed(evt);
            }
        });

        textfBillID.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        textfTotalMoney.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        textField_guestMoney.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        textField_Change.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout panel_BillInfoLayout = new javax.swing.GroupLayout(panel_BillInfo);
        panel_BillInfo.setLayout(panel_BillInfoLayout);
        panel_BillInfoLayout.setHorizontalGroup(
            panel_BillInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BillInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_BillInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_totalMoney)
                    .addComponent(label_billID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_BillInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BillInfoLayout.createSequentialGroup()
                        .addComponent(textfBillID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(label_guestMoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_guestMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BillInfoLayout.createSequentialGroup()
                        .addComponent(textfTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_change)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField_Change, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExportBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        panel_BillInfoLayout.setVerticalGroup(
            panel_BillInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BillInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_BillInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_BillInfoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(label_totalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_BillInfoLayout.createSequentialGroup()
                        .addGroup(panel_BillInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_BillInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textfBillID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField_guestMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_guestMoney, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(label_billID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_BillInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfTotalMoney, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_BillInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textField_Change, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(label_change, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExportBill, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        tableProductOffered.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Product Name", "Size", "Unit Price"
            }
        ));
        jScrollPane7.setViewportView(tableProductOffered);

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setPreferredSize(new java.awt.Dimension(89, 29));
        jPanel.add(btnClear);

        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnRemove.setText("Remove");
        jPanel.add(btnRemove);

        label_prodChoose1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        label_prodChoose1.setText("Product list");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelProductOfferInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(label_prodChoose1))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(label_prodChoose)
                        .addGap(201, 352, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_BillInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTimeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTimeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_BillInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_prodChoose)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelProductOfferInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_prodChoose1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnChoose)
                            .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnExportBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportBillActionPerformed
        exportConfirm.setVisible(true);
        exportConfirm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnExportBillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExportBill;
    private javax.swing.JButton btnRemove;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelTitleTime;
    private javax.swing.JLabel labelTitleUser;
    private javax.swing.JLabel label_billID;
    private javax.swing.JLabel label_change;
    private javax.swing.JLabel label_guestMoney;
    private javax.swing.JLabel label_prodChoose;
    private javax.swing.JLabel label_prodChoose1;
    private javax.swing.JLabel label_prodName;
    private javax.swing.JLabel label_totalMoney;
    private javax.swing.JLabel lableUser;
    private javax.swing.JPanel panelProductOfferInfo;
    private javax.swing.JPanel panelTimeUser;
    private javax.swing.JPanel panel_BillInfo;
    private javax.swing.JTable tableProductOffered;
    private javax.swing.JTable tableProductSelected;
    private javax.swing.JTextField textField_Change;
    private javax.swing.JTextField textField_guestMoney;
    private javax.swing.JTextField textfBillID;
    private javax.swing.JTextField textfProductName;
    private javax.swing.JTextField textfTotalMoney;
    // End of variables declaration//GEN-END:variables
}
