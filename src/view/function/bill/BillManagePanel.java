/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.function.bill;

/**
 *
 * @author Minh Tu
 */
public class BillManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form Function_Selling
     */
    public BillManagePanel() {
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

        TabbedPanel = new javax.swing.JTabbedPane();
        panelBillCreate = new view.function.bill.BillCreatePanel();
        panelBillHistory = new view.function.bill.BillHistoryPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        TabbedPanel.addTab("Selling", panelBillCreate);
        TabbedPanel.addTab("Bill", panelBillHistory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1239, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabbedPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 894, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPanel;
    private view.function.bill.BillCreatePanel panelBillCreate;
    private view.function.bill.BillHistoryPanel panelBillHistory;
    // End of variables declaration//GEN-END:variables
}
