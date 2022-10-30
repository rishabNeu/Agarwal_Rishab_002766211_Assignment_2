/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.CommunityHistory;
import model.Hospital;
import model.HospitalDirectory;

/**
 *
 * @author Rishab
 */
public class HospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalJPanel
     */
    
    CommunityHistory communityHistory;
    HospitalDirectory hospitalDirectory;
    
    
    private ArrayList<Community> cList;
    private HashSet<String> cityList;

    private ArrayList<String> communityNameList;
    private ArrayList<String> houseList;

    private HashMap<String, ArrayList<String>> map;
    private HashMap<String, ArrayList<String>> mapHouse;
    

    public HospitalJPanel(CommunityHistory communityHistory, HospitalDirectory hospitalDirectory) {
        this.communityHistory = communityHistory;
        this.hospitalDirectory = hospitalDirectory;
        initComponents();
        
        this.cList = new ArrayList<>();
       // this.personDirectory = personDirectory;
      //  this.patientDirectory = patientDirectory;
       
        cityList = new HashSet<>();
        communityNameList = new ArrayList<>();
        houseList = new ArrayList<>();
        map = new HashMap<>();
        mapHouse = new HashMap<>();

        cList = communityHistory.getCommunityDetails();
        for (Community community : cList) {

            cityList.add(community.getCity().getCityName());
            communityNameList.add(community.getCommunityName());
            houseList.add(community.getHouse().getAddress());
        }

        hospitalCityCombo.addItem("Select a city");

        for (String city : cityList) {
            hospitalCityCombo.addItem(city);
           

        }

        setCommunityAllProperties();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PersonTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblCreatePatient = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelHospitalId1 = new javax.swing.JLabel();
        hospitalId = new javax.swing.JTextField();
        labelHospitalName1 = new javax.swing.JLabel();
        hospitalName = new javax.swing.JTextField();
        labelHospitalCity1 = new javax.swing.JLabel();
        hospitalCityCombo = new javax.swing.JComboBox<>();
        labelHospitalCommunity1 = new javax.swing.JLabel();
        hospitalCommunityCombo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        doctorId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        doctorName = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalTable = new javax.swing.JTable();
        btnDeleteHospital = new javax.swing.JButton();
        btnViewHospital = new javax.swing.JButton();
        jlabel = new javax.swing.JLabel();
        hospitalNameUpdate = new javax.swing.JTextField();
        jlabel2 = new javax.swing.JLabel();
        cityNameUpdate = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        communityNameUpdate = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        doctorNameUpdate = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        PersonTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonTabMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        lblCreatePatient.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCreatePatient.setText("CREATE HOSPITAL");

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        labelHospitalId1.setText("Hospital Id");

        labelHospitalName1.setText("Hospital Name");

        hospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalNameActionPerformed(evt);
            }
        });

        labelHospitalCity1.setText("City");

        hospitalCityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalCityComboActionPerformed(evt);
            }
        });

        labelHospitalCommunity1.setText("Community");

        jLabel6.setText("Doctor Id");

        jLabel7.setText("Doctor Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorId)
                            .addComponent(doctorName)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHospitalId1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHospitalName1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHospitalCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelHospitalCommunity1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hospitalCommunityCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hospitalCityCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(254, 254, 254))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHospitalId1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHospitalName1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHospitalCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalCityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHospitalCommunity1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalCommunityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(doctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(doctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(442, 442, 442)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(lblCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(301, 301, 301))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        PersonTab.addTab("Create", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        hospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hospital Id", "Hospital Name", "City", "Community", "Doctor Name"
            }
        ));
        jScrollPane1.setViewportView(hospitalTable);

        btnDeleteHospital.setText("Delete");
        btnDeleteHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHospitalActionPerformed(evt);
            }
        });

        btnViewHospital.setText("View");
        btnViewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHospitalActionPerformed(evt);
            }
        });

        jlabel.setText("Hospital :");

        jlabel2.setText("City :");

        cityNameUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "New York" }));
        cityNameUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityNameUpdateActionPerformed(evt);
            }
        });

        jLabel8.setText("Community :");

        jLabel9.setText("Doctor :");

        doctorNameUpdate.setText("jTextField1");

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(620, 620, 620)
                        .addComponent(btnDeleteHospital))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewHospital)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addComponent(jlabel)
                                .addComponent(jlabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(communityNameUpdate, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cityNameUpdate, javax.swing.GroupLayout.Alignment.LEADING, 0, 198, Short.MAX_VALUE)
                            .addComponent(hospitalNameUpdate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doctorNameUpdate))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(474, 474, 474))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnDeleteHospital))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnViewHospital)))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jlabel)
                        .addGap(29, 29, 29)
                        .addComponent(jlabel2)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(hospitalNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(cityNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(communityNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(doctorNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        PersonTab.addTab("View", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonTab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PersonTab)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PersonTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonTabMouseClicked
displayHospitals();
      //  populatePeopleTable();
    }//GEN-LAST:event_PersonTabMouseClicked

    private void hospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalNameActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
         int docId = Integer.parseInt(doctorId.getText());
        String docName = doctorName.getText();
        String comm = hospitalCommunityCombo.getSelectedItem().toString();
      String city = hospitalCityCombo.getSelectedItem().toString();
        int hosId = Integer.parseInt(hospitalId.getText());
        String hosName = hospitalName.getText();
        
        
        Hospital em = hospitalDirectory.addHospital();
        em.setHospitalId(hosId);
        em.setDoctorId(docId);
        em.setName(docName);
        em.setHospitalName(hosName);
       em.setCity(new City(city));
        em.setCommunity(new Community(comm));
        JOptionPane.showMessageDialog(this, "Hospital Information Saved");
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void btnDeleteHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHospitalActionPerformed

        
        int selectedRowIndex = hospitalTable.getSelectedRow(); // Get the selected row index from the table
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) hospitalTable.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);
        hospitalDirectory.deleteHospital(selectedHospital);
        JOptionPane.showMessageDialog(this, "This Hospital record has been deleted");
        doctorNameUpdate.setText("");
        hospitalName.setText("");
        //personAddress.setText("");
        displayHospitals();
    }//GEN-LAST:event_btnDeleteHospitalActionPerformed

    private void btnViewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHospitalActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = hospitalTable.getSelectedRow(); // Get the selected row index from the table
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) hospitalTable.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);
        doctorNameUpdate.setText(selectedHospital.getName());
        hospitalNameUpdate.setText(selectedHospital.getHospitalName());
        cityNameUpdate.setSelectedItem(selectedHospital.getCity().getCityName());
        communityNameUpdate.setSelectedItem(selectedHospital.getCommunity().getCommunityName());
    }//GEN-LAST:event_btnViewHospitalActionPerformed

    private void cityNameUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityNameUpdateActionPerformed
        // TODO add your handling code here:
        String selectedCity = hospitalCityCombo.getSelectedItem().toString();
        //cityUpdateAction(selectedCity, "update");
    }//GEN-LAST:event_cityNameUpdateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = hospitalTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "please select the row to Update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) hospitalTable.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);

        String docName = doctorNameUpdate.getText();
        String comm = communityNameUpdate.getSelectedItem().toString();
        String city = cityNameUpdate.getSelectedItem().toString();
        String hosName = hospitalNameUpdate.getText();
        Hospital em = hospitalDirectory.addHospital();
        selectedHospital.setName(docName);
        selectedHospital.setHospitalName(hosName);
        selectedHospital.setCity(new City(city));
        selectedHospital.setCommunity(new Community(comm));
        JOptionPane.showMessageDialog(this, "Hospital Information Updated");
        doctorNameUpdate.setText("");
        hospitalNameUpdate.setText("");
        communityNameUpdate.setSelectedItem("");
        displayHospitals();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void hospitalCityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalCityComboActionPerformed
        // TODO add your handling code here:
        
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {

            if (hospitalCityCombo.getSelectedItem() != null) {

                if (hospitalCityCombo.getSelectedItem().equals(entry.getKey())) {
                    ArrayList<String> list = entry.getValue();
                    hospitalCommunityCombo.removeAllItems();

                    for (String community : list) {
                        //     comboCommunity.removeAllItems();
                        hospitalCommunityCombo.addItem(community);
                    }

                }

            }

        }
        
    }//GEN-LAST:event_hospitalCityComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PersonTab;
    private javax.swing.JButton btnDeleteHospital;
    private javax.swing.JButton btnViewHospital;
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> cityNameUpdate;
    private javax.swing.JComboBox<String> communityNameUpdate;
    private javax.swing.JTextField doctorId;
    private javax.swing.JTextField doctorName;
    private javax.swing.JTextField doctorNameUpdate;
    private javax.swing.JComboBox<String> hospitalCityCombo;
    private javax.swing.JComboBox<String> hospitalCommunityCombo;
    private javax.swing.JTextField hospitalId;
    private javax.swing.JTextField hospitalName;
    private javax.swing.JTextField hospitalNameUpdate;
    private javax.swing.JTable hospitalTable;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel labelHospitalCity1;
    private javax.swing.JLabel labelHospitalCommunity1;
    private javax.swing.JLabel labelHospitalId1;
    private javax.swing.JLabel labelHospitalName1;
    private javax.swing.JLabel lblCreatePatient;
    // End of variables declaration//GEN-END:variables

    private void displayHospitals() {

        
         DefaultTableModel model = (DefaultTableModel) hospitalTable.getModel();
        model.setRowCount(0);
        for (Hospital em : hospitalDirectory.getHospitalDetails()) {
            Object[] row = new Object[5];
            row[0] = em;
            row[1] = em.getHospitalName();
            row[2] = em.getCity().getCityName();
            row[3] = em.getCommunity().getCommunityName();
            row[4] = em.getName();
            model.addRow(row);

        }
        
    }

    private void setCommunityAllProperties() {
            
         for (Community community : cList) {

            ArrayList<String> communityVal = new ArrayList<>();

            if (cityList.contains(community.getCity().getCityName())) {
                if (map.get(community.getCity().getCityName()) == null) {
                    communityVal.add(community.getCommunityName());
                    map.put(community.getCity().getCityName(), communityVal);
                } else {

                    map.get(community.getCity().getCityName()).add(community.getCommunityName());

                }

            }

        }

    }
}
