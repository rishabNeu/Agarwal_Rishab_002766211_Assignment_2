/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PersonDirectory;
import model.House;
import model.City;
import model.CommunityHistory;
import model.HospitalDirectory;
import model.PatientDirectory;
import model.VitalHistory;

/**
 *
 * @author Rishab
 */
public class CrudPanel extends javax.swing.JFrame {

    /**
     * Creates new form CrudPanel
     */
    PersonDirectory personDirectory;
    CommunityHistory communityHistory;
    HospitalDirectory hospitalDirectory;
    PatientDirectory patientDirectory;
    VitalHistory vitalHistory;
    City city;
    House house;
    static String userName;
    static String userRole;
    static int userId;
    static ArrayList<User> userList = new ArrayList<>();
    static User doctor;
    static User communityAdmin;
    static User patientAdmin; 
   static User hospitalAdmin;
    static User systemAdmin;

    public CrudPanel(String userName, String userRole, int userId) {
        initComponents();
        manageHospital.setVisible(false);
        manageDoctor.setVisible(false);
        managePatient.setVisible(false);
        manageEncounter.setVisible(false);
        manageCommunity.setVisible(false);
          searchPatient.setVisible(false);
        doctor = new User();
        communityAdmin = new User();
        patientAdmin = new User();
        hospitalAdmin = new User();
        systemAdmin = new User();

        doctor.setUserName("doctor");
        doctor.setUserId(1);
        doctor.setPassword("password");
        doctor.setRole("Doctor");
        userList.add(doctor);
        communityAdmin.setUserName("community");
        communityAdmin.setUserId(1);
        communityAdmin.setPassword("password");
        communityAdmin.setRole("Community Admin");
        userList.add(communityAdmin);
        patientAdmin.setUserName("patient");
        patientAdmin.setUserId(1);
        patientAdmin.setPassword("password");
        patientAdmin.setRole("Patient");
        userList.add(patientAdmin);
        hospitalAdmin.setUserName("hospital");
        hospitalAdmin.setUserId(1);
        hospitalAdmin.setPassword("password");
        hospitalAdmin.setRole("Hospital Admin");
        userList.add(hospitalAdmin);
        systemAdmin.setUserName("system");
        systemAdmin.setUserId(1);
        systemAdmin.setPassword("password");
        systemAdmin.setRole("System Admin");
        userList.add(systemAdmin);
        personDirectory = new PersonDirectory();
        communityHistory = new CommunityHistory();
        hospitalDirectory = new HospitalDirectory();
        patientDirectory = new PatientDirectory();
        vitalHistory = new VitalHistory();
        this.userName = userName;
        this.userRole = userRole;
        this.userId = userId;
        //validateUserRoles();
    }

    public void validateUserRoles(String userRole) {
        if (userRole == "Community Admin") {
            manageHospital.setVisible(false);
            manageDoctor.setVisible(false);
            managePatient.setVisible(false);
            manageEncounter.setVisible(false);
            manageCommunity.setVisible(true);
            searchPatient.setVisible(false);
            CommunityPanel panel = new CommunityPanel(communityHistory, userRole);
            
            jSplitPaneCrud.setRightComponent(panel);
        } else if (userRole == "Hospital Admin") {
            manageCommunity.setVisible(false);
            manageHospital.setVisible(true);
            manageDoctor.setVisible(true);
            managePatient.setVisible(true);
            manageEncounter.setVisible(true);
            searchPatient.setVisible(true);
            PersonPanel panel = new PersonPanel(personDirectory, communityHistory, patientDirectory, hospitalDirectory, userRole);
            jSplitPaneCrud.setRightComponent(panel);
        } else if (userRole == "Doctor") {
            manageCommunity.setVisible(false);
            manageHospital.setVisible(false);
//            manageDoctor.setVisible(false);
            manageEncounter.setVisible(false);
            managePatient.setVisible(false);
            manageDoctor.setVisible(true);
            searchPatient.setVisible(false);
            DoctorJPanel panel = new DoctorJPanel(personDirectory, patientDirectory, userName, userRole, userId);
            jSplitPaneCrud.setRightComponent(panel);
        } else if (userRole == "Patient") {
            manageDoctor.setVisible(false);
            manageHospital.setVisible(false);
            manageCommunity.setVisible(false);
            managePatient.setVisible(true);
            manageEncounter.setVisible(true);
          
            PersonPanel panel = new PersonPanel(personDirectory, communityHistory, patientDirectory, hospitalDirectory, userRole);
            jSplitPaneCrud.setRightComponent(panel);
        }
        else if (userRole == "System Admin") {
            manageDoctor.setVisible(true);
            manageHospital.setVisible(true);
            manageCommunity.setVisible(true);
            managePatient.setVisible(true);
            manageEncounter.setVisible(true);
            searchPatient.setVisible(true);
            PersonPanel panel = new PersonPanel(personDirectory, communityHistory, patientDirectory, hospitalDirectory, userRole);
            jSplitPaneCrud.setRightComponent(panel);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPaneCrud = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        manageDoctor = new javax.swing.JButton();
        managePatient = new javax.swing.JButton();
        manageHospital = new javax.swing.JButton();
        manageEncounter = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        manageCommunity = new javax.swing.JButton();
        searchPatient = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        userRoleComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        manageDoctor.setText("MANAGE DOCTOR");
        manageDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDoctorActionPerformed(evt);
            }
        });

        managePatient.setText("MANAGE PATIENT");
        managePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientActionPerformed(evt);
            }
        });

        manageHospital.setText("MANAGE HOSPITAL");
        manageHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHospitalActionPerformed(evt);
            }
        });

        manageEncounter.setText("MANAGE ENCOUNTER");
        manageEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEncounterActionPerformed(evt);
            }
        });

        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        manageCommunity.setText("MANAGE COMMUNITY");
        manageCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCommunityActionPerformed(evt);
            }
        });

        searchPatient.setText("SEARCH PATIENT");
        searchPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(managePatient, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(manageDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(manageCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(manageHospital, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(manageEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(searchPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(managePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(manageDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(manageCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(manageHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(manageEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(searchPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPaneCrud.setLeftComponent(jPanel3);

        loginPanel.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("HOSPITAL MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("USERNAME");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("PASSSWORD");

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("USER ROLE");

        userRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Doctor", "Patient", "Community Admin", "Hospital Admin" }));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(107, 107, 107)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(119, 119, 119)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(username)
                                    .addComponent(userRoleComboBox, 0, 226, Short.MAX_VALUE)))))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(284, 284, 284))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(userRoleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPaneCrud.setRightComponent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneCrud)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneCrud)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDoctorActionPerformed
        // TODO add your handling code here:
        DoctorJPanel panel = new DoctorJPanel(personDirectory, patientDirectory, userName, userRole, userId);
        jSplitPaneCrud.setRightComponent(panel);
    }//GEN-LAST:event_manageDoctorActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        manageHospital.setVisible(false);
        manageDoctor.setVisible(false);
        managePatient.setVisible(false);
        manageEncounter.setVisible(false);
        manageCommunity.setVisible(false);
          searchPatient.setVisible(false);
        jSplitPaneCrud.setRightComponent(loginPanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void managePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientActionPerformed
        // TODO add your handling code here:
        PersonPanel panel = new PersonPanel(personDirectory, communityHistory, patientDirectory, hospitalDirectory, userRole);
        jSplitPaneCrud.setRightComponent(panel);
    }//GEN-LAST:event_managePatientActionPerformed

    private void manageCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCommunityActionPerformed
        // TODO add your handling code here:
        CommunityPanel panel = new CommunityPanel(communityHistory, userRole);
        jSplitPaneCrud.setRightComponent(panel);
    }//GEN-LAST:event_manageCommunityActionPerformed

    private void manageHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHospitalActionPerformed
        // TODO add your handling code here:
        HospitalPanel panel = new HospitalPanel(communityHistory, hospitalDirectory, userRole);
        jSplitPaneCrud.setRightComponent(panel);
    }//GEN-LAST:event_manageHospitalActionPerformed

    private void manageEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEncounterActionPerformed
        // TODO add your handling code here:
        EncounterJPanel panel = new EncounterJPanel(personDirectory, patientDirectory, vitalHistory, userName, userRole, userId);
        jSplitPaneCrud.setRightComponent(panel);
    }//GEN-LAST:event_manageEncounterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        boolean chckUser = false;
        boolean chckPassword= false;
       

        chckUser = username.getText().isEmpty() ? true : false;
        chckPassword = password.getText().isEmpty() ? true : false;
       
        if ((chckUser == false) && (chckPassword == false)) {
        String user = username.getText();
        String userRole = userRoleComboBox.getSelectedItem().toString();
        for (User us : userList) {
            if (us.getUserName().equals((user))) {
                this.userName = us.getUserName();
                this.userId = us.getUserId();
                this.userRole = us.getRole();
                validateUserRoles(this.userRole);
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "Please provide values for Username and Password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientActionPerformed
        // TODO add your handling code here:
        SearchJPanel searc = new SearchJPanel(personDirectory,patientDirectory);
        jSplitPaneCrud.setRightComponent(searc);
    }//GEN-LAST:event_searchPatientActionPerformed

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
            java.util.logging.Logger.getLogger(CrudPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudPanel(userName, userRole, userId).setVisible(true);
            }
        });
    }

    public static class User {

        String userName;
        String password;
        String role;
        int userId;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPaneCrud;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton manageCommunity;
    private javax.swing.JButton manageDoctor;
    private javax.swing.JButton manageEncounter;
    private javax.swing.JButton manageHospital;
    private javax.swing.JButton managePatient;
    private javax.swing.JTextField password;
    private javax.swing.JButton searchPatient;
    private javax.swing.JComboBox<String> userRoleComboBox;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
