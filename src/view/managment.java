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
public class managment extends javax.swing.JFrame {

    /**
     * Creates new form managment
     */
    public managment() {
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

        buttonGroup_gender = new javax.swing.ButtonGroup();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        tabbedPane_layout = new javax.swing.JTabbedPane();
        panel_empInfo = new javax.swing.JPanel();
        label_empManagment = new javax.swing.JLabel();
        panel_infoEmpl = new javax.swing.JPanel();
        lable_emplID = new javax.swing.JLabel();
        lable_name = new javax.swing.JLabel();
        lable_EmplID2 = new javax.swing.JLabel();
        lable_mobile = new javax.swing.JLabel();
        textField_emplID = new javax.swing.JTextField();
        textField_name = new javax.swing.JTextField();
        textField_mobile = new javax.swing.JTextField();
        textField_perID = new javax.swing.JTextField();
        lable_pass = new javax.swing.JLabel();
        textField_emplID1 = new javax.swing.JTextField();
        lable_email = new javax.swing.JLabel();
        textField_email = new javax.swing.JTextField();
        lable_gender = new javax.swing.JLabel();
        radioButton_male = new javax.swing.JRadioButton();
        radioButton_female = new javax.swing.JRadioButton();
        lable_status = new javax.swing.JLabel();
        combobox_status = new javax.swing.JComboBox<>();
        lable_basicSalary = new javax.swing.JLabel();
        textField_basicSalary = new javax.swing.JTextField();
        lable_position = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        datePicker_dayJoint = new com.github.lgooddatepicker.components.DatePicker();
        lable_dayJoint = new javax.swing.JLabel();
        lable_birthDay = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        lable_shift = new javax.swing.JLabel();
        label_search = new javax.swing.JLabel();
        textField_search = new javax.swing.JTextField();
        button_modify = new javax.swing.JButton();
        button_add = new javax.swing.JButton();
        button_refresh = new javax.swing.JButton();
        label_empInfo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("jCheckBoxMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbedPane_layout.setBackground(new java.awt.Color(255, 255, 255));
        tabbedPane_layout.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        panel_empInfo.setBackground(new java.awt.Color(255, 255, 255));

        label_empManagment.setText("  Emloyee informations managment   ");
        label_empManagment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label_empManagment.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N

        panel_infoEmpl.setBackground(new java.awt.Color(255, 255, 255));
        panel_infoEmpl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lable_emplID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_emplID.setText("Employee ID");
        lable_emplID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lable_name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_name.setText("Name");
        lable_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lable_EmplID2.setText("Personal ID");
        lable_EmplID2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lable_mobile.setText("Mobile");
        lable_mobile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textField_emplID.setPreferredSize(new java.awt.Dimension(160, 30));

        textField_name.setPreferredSize(new java.awt.Dimension(160, 30));

        textField_mobile.setPreferredSize(new java.awt.Dimension(160, 30));

        textField_perID.setPreferredSize(new java.awt.Dimension(160, 30));

        lable_pass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_pass.setText("Password");
        lable_pass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textField_emplID1.setPreferredSize(new java.awt.Dimension(160, 30));

        lable_email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_email.setText("Email");
        lable_email.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textField_email.setPreferredSize(new java.awt.Dimension(160, 30));

        lable_gender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_gender.setText("Gender");
        lable_gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        radioButton_male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup_gender.add(radioButton_male);
        radioButton_male.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        radioButton_male.setText("Male");

        radioButton_female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup_gender.add(radioButton_female);
        radioButton_female.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        radioButton_female.setText("Female");

        lable_status.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_status.setText("Status");
        lable_status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        combobox_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang hoạt động", "Đã nghỉ việc" }));
        combobox_status.setPreferredSize(new java.awt.Dimension(160, 30));

        lable_basicSalary.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_basicSalary.setText("Basic Salary");
        lable_basicSalary.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textField_basicSalary.setEditable(false);
        textField_basicSalary.setPreferredSize(new java.awt.Dimension(160, 30));

        lable_position.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_position.setText("Position");
        lable_position.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Quản lý", "Bán hàng" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(160, 30));

        datePicker_dayJoint.setMinimumSize(new java.awt.Dimension(160, 30));
        datePicker_dayJoint.setPreferredSize(new java.awt.Dimension(160, 30));

        lable_dayJoint.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_dayJoint.setText("Day Joint");
        lable_dayJoint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lable_birthDay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_birthDay.setText("Day Joint");
        lable_birthDay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        datePicker1.setPreferredSize(new java.awt.Dimension(160, 30));

        lable_shift.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lable_shift.setText("Shift");
        lable_shift.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout panel_infoEmplLayout = new javax.swing.GroupLayout(panel_infoEmpl);
        panel_infoEmpl.setLayout(panel_infoEmplLayout);
        panel_infoEmplLayout.setHorizontalGroup(
            panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoEmplLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lable_shift, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_infoEmplLayout.createSequentialGroup()
                        .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lable_EmplID2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lable_emplID)
                                .addComponent(lable_name, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(panel_infoEmplLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(lable_mobile)))
                        .addGap(29, 29, 29)
                        .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textField_emplID, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_name, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_perID, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lable_email)
                            .addComponent(lable_pass)
                            .addComponent(lable_gender)
                            .addComponent(lable_status))
                        .addGap(29, 29, 29)
                        .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_infoEmplLayout.createSequentialGroup()
                                .addComponent(radioButton_male)
                                .addGap(40, 40, 40)
                                .addComponent(radioButton_female))
                            .addComponent(combobox_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textField_emplID1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textField_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(40, 40, 40)
                        .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lable_basicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable_position, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable_dayJoint, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable_birthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePicker_dayJoint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datePicker1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_basicSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        panel_infoEmplLayout.setVerticalGroup(
            panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoEmplLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lable_emplID)
                    .addComponent(textField_emplID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable_pass)
                    .addComponent(textField_emplID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable_basicSalary)
                    .addComponent(textField_basicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable_name)
                    .addComponent(lable_email)
                    .addComponent(textField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lable_position)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_infoEmplLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lable_gender)
                            .addComponent(radioButton_female)
                            .addComponent(radioButton_male)))
                    .addGroup(panel_infoEmplLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datePicker_dayJoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable_dayJoint)))
                    .addGroup(panel_infoEmplLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lable_mobile))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lable_birthDay)
                        .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textField_perID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lable_EmplID2))
                    .addGroup(panel_infoEmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combobox_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lable_status)))
                .addGap(15, 15, 15)
                .addComponent(lable_shift)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        label_search.setText("Search");

        textField_search.setPreferredSize(new java.awt.Dimension(190, 30));

        button_modify.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        button_modify.setText("Modify");
        button_modify.setPreferredSize(new java.awt.Dimension(115, 40));

        button_add.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        button_add.setText("Add");
        button_add.setPreferredSize(new java.awt.Dimension(115, 40));

        button_refresh.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        button_refresh.setText("Refresh");
        button_refresh.setPreferredSize(new java.awt.Dimension(115, 40));

        label_empInfo.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        label_empInfo.setText("  Emloyee informations  ");
        label_empInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Emp ID", "Name", "Mobile", "Birthday", "Email", "Gender", "Shift", "Basic Salary", "Position", "Day joint", "Password", "Personal ID", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_empInfoLayout = new javax.swing.GroupLayout(panel_empInfo);
        panel_empInfo.setLayout(panel_empInfoLayout);
        panel_empInfoLayout.setHorizontalGroup(
            panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_infoEmpl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_empInfoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(label_search)
                .addGap(39, 39, 39)
                .addComponent(textField_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(button_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(button_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(button_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_empInfoLayout.createSequentialGroup()
                .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_empManagment)
                    .addComponent(label_empInfo))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_empInfoLayout.setVerticalGroup(
            panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empInfoLayout.createSequentialGroup()
                .addComponent(label_empManagment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_infoEmpl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_empInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_search)
                    .addComponent(textField_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(label_empInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane_layout.addTab("Employees Informations", panel_empInfo);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );

        tabbedPane_layout.addTab("Products", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );

        tabbedPane_layout.addTab("Ingredients", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );

        tabbedPane_layout.addTab("Bills", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );

        tabbedPane_layout.addTab("Providers", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane_layout)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane_layout)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_gender;
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_modify;
    private javax.swing.JButton button_refresh;
    private javax.swing.JComboBox<String> combobox_status;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker_dayJoint;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_empInfo;
    private javax.swing.JLabel label_empManagment;
    private javax.swing.JLabel label_search;
    private javax.swing.JLabel lable_EmplID2;
    private javax.swing.JLabel lable_basicSalary;
    private javax.swing.JLabel lable_birthDay;
    private javax.swing.JLabel lable_dayJoint;
    private javax.swing.JLabel lable_email;
    private javax.swing.JLabel lable_emplID;
    private javax.swing.JLabel lable_gender;
    private javax.swing.JLabel lable_mobile;
    private javax.swing.JLabel lable_name;
    private javax.swing.JLabel lable_pass;
    private javax.swing.JLabel lable_position;
    private javax.swing.JLabel lable_shift;
    private javax.swing.JLabel lable_status;
    private javax.swing.JPanel panel_empInfo;
    private javax.swing.JPanel panel_infoEmpl;
    private javax.swing.JRadioButton radioButton_female;
    private javax.swing.JRadioButton radioButton_male;
    private javax.swing.JTabbedPane tabbedPane_layout;
    private javax.swing.JTextField textField_basicSalary;
    private javax.swing.JTextField textField_email;
    private javax.swing.JTextField textField_emplID;
    private javax.swing.JTextField textField_emplID1;
    private javax.swing.JTextField textField_mobile;
    private javax.swing.JTextField textField_name;
    private javax.swing.JTextField textField_perID;
    private javax.swing.JTextField textField_search;
    // End of variables declaration//GEN-END:variables
}
