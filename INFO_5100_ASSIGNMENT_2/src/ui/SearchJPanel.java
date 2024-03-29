/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author Rishab
 */




public class SearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJPanel
     */
    
    PersonDirectory p;
    PatientDirectory pDirec;
    
    public SearchJPanel(PersonDirectory perDir , PatientDirectory pa) {
        initComponents();
        p=perDir;
        pDirec = pa;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchOperation = new javax.swing.JButton();
        comboSearch = new javax.swing.JComboBox<>();
        txtComboValue = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 153, 255));

        btnSearchOperation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearchOperation.setText("Search");
        btnSearchOperation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchOperationActionPerformed(evt);
            }
        });

        comboSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Id", "Age", " " }));
        comboSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSearchActionPerformed(evt);
            }
        });

        txtComboValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComboValueActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        personTable.setBackground(new java.awt.Color(242, 242, 242));
        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Id", "Age", "Gender", "Phone", "City", "Community", "House"
            }
        ));
        jScrollPane1.setViewportView(personTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtComboValue, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchOperation)
                    .addComponent(txtComboValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addGap(89, 89, 89)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchOperationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchOperationActionPerformed

        boolean isPresent = false;
        //list we got now
        ArrayList<Person> personList = p.getHistory();

        String comboSearchType = comboSearch.getSelectedItem().toString();

        String comboValue = txtComboValue.getText();

        if (comboValue.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter something in the search box");
            txtComboValue.requestFocus();
            return;
        }

        ArrayList<Person> searchedEmployeeList = new ArrayList<>();

        if (comboSearchType.equalsIgnoreCase("Name")) {
            for (Person employee : personList) {
                if (employee.getName().toLowerCase().contains(comboValue.toLowerCase())) {

                    searchedEmployeeList.add(employee);
                    isPresent = true;
                }
            }
        } else if (comboSearchType.equalsIgnoreCase("Id")) {

            //isNumeric check
            if(isNumeric(comboValue)==false){
                JOptionPane.showMessageDialog(this,"Please enter in numeric format only");
                txtComboValue.requestFocus();
                txtComboValue.setText("");
                return;
            }

            for (Person employee : personList) {

                if (Integer.parseInt(comboValue)== employee.getId()) {

                    searchedEmployeeList.add(employee);
                    isPresent = true;
                }

            }
        } else if (comboSearchType.equalsIgnoreCase("Age")) {

            //isNumeric check
            if(isNumeric(comboValue)==false){
                JOptionPane.showMessageDialog(this,"Please enter in numeric format only");
                txtComboValue.requestFocus();
                txtComboValue.setText("");
                return;
            }

            for (Person employee : personList) {

                if (Integer.parseInt(comboValue)== employee.getAge()) {

                    searchedEmployeeList.add(employee);
                    isPresent = true;
                }

            }
        }

        DefaultTableModel model = (DefaultTableModel) personTable.getModel();

        model.setRowCount(0);

        for (Person emp : searchedEmployeeList) {
            Object[] row = new Object[10];
            row[0] = emp;
            row[1] = emp.getId();
            row[2] = emp.getAge();
            row[3] = emp.getGender();
            row[4] = emp.getPhone();
            row[5] = emp.getCity().getcityName();
            row[6] = emp.getCommunity().getCommunityName();
            row[7] = emp.getHouse().getAddress();
          
            model.addRow(row);

        }

        if (isPresent == false) {
            JOptionPane.showMessageDialog(null, "No Records found");
            return;
        }

    }//GEN-LAST:event_btnSearchOperationActionPerformed

    private void comboSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSearchActionPerformed

    private void txtComboValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComboValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComboValueActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        txtComboValue.setText("");
        DefaultTableModel model = (DefaultTableModel) personTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        // comboSearch.setse
    }//GEN-LAST:event_btnClearActionPerformed

    
    
     private boolean isNumeric(String value) {

        if (value == null || value == "") {
            return false;
        }
        try {
            int temp = Integer.parseInt(value);

        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearchOperation;
    private javax.swing.JComboBox<String> comboSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable personTable;
    private javax.swing.JTextField txtComboValue;
    // End of variables declaration//GEN-END:variables
}
