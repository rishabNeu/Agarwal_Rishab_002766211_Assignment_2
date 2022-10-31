/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;
import model.VitalHistory;


/**
 *
 * @author Rishab
 */
public class EncounterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EncounterJPanel
     */
     private String patientName;
    PersonDirectory personDirectory;
    PatientDirectory patientDirectory;
    VitalHistory vitalHistory;
    static String userRole;
    static String userName;
    static int userId;

    public EncounterJPanel(PersonDirectory personDir, PatientDirectory patientDir, VitalHistory vitalHist, String userName, String userRole, int userId) {
        initComponents();
        personDirectory = personDir;
        patientDirectory = patientDir;
        vitalHistory = vitalHist;
        this.userRole = userRole;
        this.userName = userName;
        this.userId = userId;
        populateVitalsTable(userId);
        populatePatientTable();

    }

    private void populatePatientTable() {

        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);

        for (Patient pa : patientDirectory.getPatientList()) {
            Object[] row = new Object[9];
            row[0] = pa;
            row[1] = pa.getId();
            row[2] = pa.getAge();
            row[3] = pa.getGender();
            row[4] = pa.getPhone();
            row[5] = pa.getCity().getcityName();
            row[6] = pa.getCommunity().getCommunityName();
            row[7] = pa.getHouse().getAddress();
            model.addRow(row);

        }

    }

    private void populateVitalsTable(int patientId) {

        DefaultTableModel model = (DefaultTableModel) tableEncounter.getModel();
        model.setRowCount(0);

        for (Patient pat : patientDirectory.getPatientList()) {
           // if (patientId == pat.get) {
                ArrayList<Encounter> pa;
                pa = pat.getEncounterHistory();
                for (Encounter et : pa) {
                    Object[] row = new Object[6];
                    row[0] = et.getBloodSugar();
                    row[1] = et.getBloodPressue();
                    row[2] = et.getTemperature();
                    row[3] = et.getPulse();
                    row[4] = et.isAbnormal();
                    row[5] = et.getUpdateTime();

                    model.addRow(row);
                }
            //}
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        btnUpdatePatient = new javax.swing.JButton();
        txtPerName = new javax.swing.JTextField();
        lblPatientName1 = new javax.swing.JLabel();
        lblAge1 = new javax.swing.JLabel();
        txtPerAge = new javax.swing.JTextField();
        lblGender1 = new javax.swing.JLabel();
        ComboPerGender = new javax.swing.JComboBox<>();
        lblMobile1 = new javax.swing.JLabel();
        txtPerMobile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnViewPatient = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEncounter = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        tblPatient.setBackground(new java.awt.Color(242, 242, 242));
        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Patient ID", "Age", "Gender", "Mobile No", "City", "Community", "House"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        btnUpdatePatient.setText("Update Patient");
        btnUpdatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatientActionPerformed(evt);
            }
        });

        txtPerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPerNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPerNameKeyTyped(evt);
            }
        });

        lblPatientName1.setText("Name :");

        lblAge1.setText("Age :");

        txtPerAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPerAgeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPerAgeKeyTyped(evt);
            }
        });

        lblGender1.setText("Gender :");

        ComboPerGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));

        lblMobile1.setText("Mobile No :");

        txtPerMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPerMobileKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPerMobileKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("PATIENT INFORMATION");

        btnViewPatient.setText("View Patient");
        btnViewPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientActionPerformed(evt);
            }
        });

        tableEncounter.setBackground(new java.awt.Color(242, 242, 242));
        tableEncounter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Blood Sugar", "Pressure", "Temperature", "Pulse Rate", "Abnormal", "Encounter Timestamp"
            }
        ));
        jScrollPane2.setViewportView(tableEncounter);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(btnViewPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPatientName1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPerName, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtPerAge))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboPerGender, 0, 115, Short.MAX_VALUE)
                            .addComponent(txtPerMobile)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(btnUpdatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(129, 129, 129))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnViewPatient)))
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPatientName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtPerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPerAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMobile1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPerMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ComboPerGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addComponent(btnUpdatePatient)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -3, 1000, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientActionPerformed

      int selectRowIndex = tblPatient.getSelectedRow();

        if (selectRowIndex < 0) {
            JOptionPane.showConfirmDialog(this, "Please select a row to view the data");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        Patient selectedPerson = (Patient) model.getValueAt(selectRowIndex, 0);

        patientName = selectedPerson.getName();
        txtPerName.setText(selectedPerson.getName());
        txtPerAge.setText(String.valueOf(selectedPerson.getAge()));

        int index = 0;
        if (selectedPerson.getGender().equalsIgnoreCase("male")) {
            index = 1;
        } else if (selectedPerson.getGender().equalsIgnoreCase("female")) {
            index = 2;
        } else if (selectedPerson.getGender().equalsIgnoreCase("other")) {
            index = 3;
        }


        
        ComboPerGender.setSelectedIndex(index);
        txtPerMobile.setText(String.valueOf(selectedPerson.getPhone()));
        
        //txtPerAddress.setT

    }//GEN-LAST:event_btnViewPatientActionPerformed

    private void txtPerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPerNameKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txtPerNameKeyPressed

    private void txtPerAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPerAgeKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtPerAgeKeyPressed

    private void txtPerMobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPerMobileKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPerMobileKeyPressed

    private void btnUpdatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatePatientActionPerformed

    private void txtPerNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPerNameKeyTyped
        // TODO add your handling code here:
          char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPerNameKeyTyped

    private void txtPerAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPerAgeKeyTyped
        // TODO add your handling code here:
            char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPerAgeKeyTyped

    private void txtPerMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPerMobileKeyTyped
        // TODO add your handling code here:
           char value = evt.getKeyChar();
        if((!Character.isDigit(value))){
            evt.consume();
        }
    }//GEN-LAST:event_txtPerMobileKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPerGender;
    private javax.swing.JButton btnUpdatePatient;
    private javax.swing.JButton btnViewPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAge1;
    private javax.swing.JLabel lblGender1;
    private javax.swing.JLabel lblMobile1;
    private javax.swing.JLabel lblPatientName1;
    private javax.swing.JTable tableEncounter;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtPerAge;
    private javax.swing.JTextField txtPerMobile;
    private javax.swing.JTextField txtPerName;
    // End of variables declaration//GEN-END:variables
}