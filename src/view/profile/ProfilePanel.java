package view.profile;

import control.app.MainFrameControllerInterface;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JLabel;
import model.employee.EmployeeModelInterface;
import model.setting.AppSetting;
import model.setting.SettingUpdateObserver;
import model.user.UserModelInterface;
import util.constant.AppConstant;

public class ProfilePanel extends javax.swing.JPanel implements SettingUpdateObserver {

    private UserModelInterface userModel;
    private MainFrameControllerInterface mainFrameController;

    public ProfilePanel() {
        initComponents();
        createView();
        createControl();
    }

    public void setUserModel(UserModelInterface userModel) {
        this.userModel = userModel;

        EmployeeModelInterface impl = userModel.getImpl();

        this.textfName.setText(impl.getName());
        this.textfPosition.setText(impl.getPositionName());
        this.textfEmail.setText(impl.getEmail());
        this.dateChooserBirthday.setDate(impl.getBirthday());
        this.textfPhoneNum.setText(impl.getPhoneNum());
    }

    public void setMainFrameController(MainFrameControllerInterface mainFrameController) {
        this.mainFrameController = mainFrameController;
    }

    public boolean isProfileEditing() {
        return textfEmail.isEnabled();
    }

    private void createView() {
        this.textfName.setEnabled(false);
        this.textfPosition.setEnabled(false);
        this.textfEmail.setEnabled(false);
        this.dateChooserBirthday.setEnabled(false);
        this.textfPhoneNum.setEnabled(false);
    }

    private void createControl() {
        JLabel[] labels = new JLabel[]{
            labelEditProfile, labelChangePassword
        };
        for (JLabel label : labels) {
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    label.setBackground(AppConstant.COLOR_MENU_MOUSE_PRESS);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    label.setBackground(AppConstant.COLOR_MENU_MOUSE_EXIT);
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    if (label == labelEditProfile) {
                        if (textfEmail.isEnabled()) {
                            mainFrameController.requestUpdateProfile();
                        } else {
                            setInputEnable(true);
                        }
                    } else if (label == labelChangePassword) {
                        mainFrameController.requestChangePassword();
                    }
                }
            });
        }
    }

    public void resetProfileEditing() {
        EmployeeModelInterface impl = userModel.getImpl();
        this.textfEmail.setText(impl.getEmail());
        this.textfPhoneNum.setText(impl.getPhoneNum());
    }

    public void setUserName(String name) {
        this.textfName.setText(name);
    }

    public void setUserPosition(String positionName) {
        this.textfPosition.setText(positionName);
    }

    public void setUserEmail(String email) {
        this.textfEmail.setText(email);
    }

    public void setUserBirthday(Date date) {
        this.dateChooserBirthday.setDate(date);
    }

    public void setPhoneNum(String phoneNum) {
        this.textfPhoneNum.setText(phoneNum);
    }

    public void setInputEnable(boolean enable) {
        this.textfEmail.setEnabled(enable);
        this.textfPhoneNum.setEnabled(enable);
        if (enable) {
            labelEditProfile.setText("Save");
        } else {
            labelEditProfile.setText("Edit profile");
        }
    }

    public String getUserEmailInput() {
        return this.textfEmail.getText().trim();
    }

    public String getUserPhoneNumInput() {
        return this.textfPhoneNum.getText().trim();
    }

    @Override
    public void updateSettingObserver() {
        AppSetting.Language language = AppSetting.getInstance().getAppLanguage();

        switch (language) {
            case ENGLISH: {
                labelName.setText("Name");
                labelPosition.setText("Position");
                labelBirthday.setText("Birthday");
                labelPhoneNum.setText("Phone number");
                labelEditProfile.setText("Edit profile");
                labelChangePassword.setText("Change password");
                break;
            }
            case VIETNAMESE: {
                labelName.setText("Họ tên");
                labelPosition.setText("Chức vụ");
                labelBirthday.setText("Ngày sinh");
                labelPhoneNum.setText("Số điện thoại");
                labelEditProfile.setText("Chỉnh sửa");
                labelChangePassword.setText("Đổi mật khẩu");
                break;
            }
        }
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelPosition = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        dateChooserBirthday = new com.toedter.calendar.JDateChooser();
        textfEmail = new javax.swing.JTextField();
        textfName = new javax.swing.JTextField();
        textfPhoneNum = new javax.swing.JTextField();
        labelPhoneNum = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        textfPosition = new javax.swing.JTextField();
        labelBirthday = new javax.swing.JLabel();
        labelEditProfile = new javax.swing.JLabel();
        labelChangePassword = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("Profile"); // NOI18N
        setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_256px.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setPreferredSize(new java.awt.Dimension(256, 350));
        add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("Profile"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(887, 400));

        labelPosition.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelPosition.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelPosition.setText("Position:");

        labelEmail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelEmail.setText("Email:");

        dateChooserBirthday.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        textfEmail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        textfName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        textfPhoneNum.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        labelPhoneNum.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelPhoneNum.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelPhoneNum.setText("Phone number:");

        labelName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelName.setText("Name:");

        textfPosition.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        labelBirthday.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelBirthday.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelBirthday.setText("Birthday:");

        labelEditProfile.setBackground(new java.awt.Color(113, 168, 255));
        labelEditProfile.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelEditProfile.setForeground(new java.awt.Color(255, 255, 255));
        labelEditProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEditProfile.setText("Edit profile");
        labelEditProfile.setOpaque(true);
        labelEditProfile.setPreferredSize(new java.awt.Dimension(117, 21));

        labelChangePassword.setBackground(new java.awt.Color(113, 168, 255));
        labelChangePassword.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        labelChangePassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelChangePassword.setText("Change password");
        labelChangePassword.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(labelChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPhoneNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textfName, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateChooserBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserBirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBirthday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateChooserBirthday;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBirthday;
    private javax.swing.JLabel labelChangePassword;
    private javax.swing.JLabel labelEditProfile;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPhoneNum;
    private javax.swing.JLabel labelPosition;
    private javax.swing.JTextField textfEmail;
    private javax.swing.JTextField textfName;
    private javax.swing.JTextField textfPhoneNum;
    private javax.swing.JTextField textfPosition;
    // End of variables declaration//GEN-END:variables
}