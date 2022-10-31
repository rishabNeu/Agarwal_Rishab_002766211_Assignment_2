/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.House;
import model.City;
import model.Community;
import model.CommunityHistory;

/**
 *
 * @author Rishab
 */
public class CommunityPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalPanel
     */
    City city;
    CommunityHistory comHistory;
    static String userRole;

    public CommunityPanel(CommunityHistory comHistory, String userRole) {
        this.comHistory = comHistory;
        initComponents();
        this.userRole = userRole;
        validateUserRoles();
    }

    public void validateUserRoles() {
        if (userRole == "Community Admin") {
            System.out.println("the user role" + userRole);
            btnDeleteCommunity.setVisible(false);
        }

        if (userRole == "Patient") {
            btnDeleteCommunity.setVisible(false);
            btnUpdateCommunity.setVisible(false);

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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cityField = new javax.swing.JTextField();
        communityField = new javax.swing.JTextField();
        btnCreateCommunity = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        communityTableModel = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cityFieldUpdate = new javax.swing.JTextField();
        communityFieldUpdate = new javax.swing.JTextField();
        btnUpdateCommunity = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnViewCommunity = new javax.swing.JButton();
        btnDeleteCommunity = new javax.swing.JButton();

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("City Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 115, -1, -1));

        jLabel2.setText("Community Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 176, -1, -1));

        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });
        cityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cityFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityFieldKeyTyped(evt);
            }
        });
        jPanel1.add(cityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 112, 174, -1));

        communityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityFieldActionPerformed(evt);
            }
        });
        communityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                communityFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                communityFieldKeyTyped(evt);
            }
        });
        jPanel1.add(communityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 173, 174, -1));

        btnCreateCommunity.setText("CREATE");
        btnCreateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCommunityActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 254, 124, 32));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("MANAGE COMMUNITY");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 29, -1, -1));

        jTabbedPane1.addTab("CREATE", jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        communityTableModel.setBackground(new java.awt.Color(242, 242, 242));
        communityTableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Community", "City"
            }
        ));
        jScrollPane1.setViewportView(communityTableModel);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 943, 285));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("City Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 135, -1, -1));

        jLabel5.setText("Community Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 207, -1, -1));

        cityFieldUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cityFieldUpdateKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityFieldUpdateKeyTyped(evt);
            }
        });
        jPanel3.add(cityFieldUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 132, 174, -1));

        communityFieldUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                communityFieldUpdateKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                communityFieldUpdateKeyTyped(evt);
            }
        });
        jPanel3.add(communityFieldUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 204, 174, -1));

        btnUpdateCommunity.setText("UPDATE");
        btnUpdateCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCommunityActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdateCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 272, -1, -1));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel7.setText("UPDATE");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 73, 163, -1));

        btnViewCommunity.setText("View");
        btnViewCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCommunityActionPerformed(evt);
            }
        });
        jPanel3.add(btnViewCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 0, 96, 29));

        btnDeleteCommunity.setText("Delete");
        btnDeleteCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCommunityActionPerformed(evt);
            }
        });
        jPanel3.add(btnDeleteCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 0, 100, 29));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        jTabbedPane1.addTab("VIEW", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1153, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCommunityActionPerformed
        // TODO add your handling code here:
         boolean chckCity = false;
        boolean chckCommunity= false;
       

        chckCity = cityField.getText().isEmpty() ? true : false;
        chckCommunity = communityField.getText().isEmpty() ? true : false;


        if ((chckCity == false) && (chckCommunity == false)) {
        String community = communityField.getText();
        String city = cityField.getText();
        Community com = comHistory.addCommunity();
        com.setCommunityName(community);
        com.setCity(new City(city));
        JOptionPane.showMessageDialog(this, "Community Information Saved");
        }
    }//GEN-LAST:event_btnCreateCommunityActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        displayCommunity();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void cityFieldUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldUpdateActionPerformed

    private void btnUpdateCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCommunityActionPerformed
        // TODO add your handling code here:
         boolean chckCity = false;
        boolean chckCommunity= false;
       

        chckCity = cityFieldUpdate.getText().isEmpty() ? true : false;
        chckCommunity = communityFieldUpdate.getText().isEmpty() ? true : false;


        if ((chckCity == false) && (chckCommunity == false)) {
        int selectedRowIndex = communityTableModel.getSelectedRow(); // Get the selected row index from the table
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the row to view");
            return;
        }
          try {
        DefaultTableModel model = (DefaultTableModel) communityTableModel.getModel();
        Community selectedCommunity = (Community) model.getValueAt(selectedRowIndex, 0);
        String community = communityFieldUpdate.getText();
        String city = cityFieldUpdate.getText();
        //String house = houseFieldUpdate.getText();
        selectedCommunity.setCommunityName(community);
        //selectedCommunity.setHouse(new House(house));
        selectedCommunity.setCity(new City(city));
        JOptionPane.showMessageDialog(this, "Community Information Updated");
        displayCommunity();
        }
          catch (Exception e) {
                System.out.println("Error" + e);
                JOptionPane.showMessageDialog(this, "Please provide correct values");
        }
        }
        
    }//GEN-LAST:event_btnUpdateCommunityActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCommunityActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = communityTableModel.getSelectedRow(); // Get the selected row index from the table
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) communityTableModel.getModel();
        Community selectedCommunity = (Community) model.getValueAt(selectedRowIndex, 0);
        communityFieldUpdate.setText(selectedCommunity.getCommunityName());
        cityFieldUpdate.setText(String.valueOf(selectedCommunity.getCity()));
        //houseFieldUpdate.setText(String.valueOf(selectedCommunity.getHouse()));
    }//GEN-LAST:event_btnViewCommunityActionPerformed

    private void btnDeleteCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCommunityActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = communityTableModel.getSelectedRow(); // Get the selected row index from the table
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) communityTableModel.getModel();
        Community selectedCommunity = (Community) model.getValueAt(selectedRowIndex, 0);
        comHistory.deleteCommunity(selectedCommunity);
        JOptionPane.showMessageDialog(this, "This record has been deleted");
        communityFieldUpdate.setText("");
        //houseFieldUpdate.setText("");
        cityFieldUpdate.setText("");
        displayCommunity();
    }//GEN-LAST:event_btnDeleteCommunityActionPerformed

    private void btnViewCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = communityTableModel.getSelectedRow(); // Get the selected row index from the table
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) communityTableModel.getModel();
        Community selectedCommunity = (Community) model.getValueAt(selectedRowIndex, 0);
        communityFieldUpdate.setText(selectedCommunity.getCommunityName());
        cityFieldUpdate.setText(String.valueOf(selectedCommunity.getCity()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void communityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityFieldActionPerformed

    private void cityFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityFieldKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_cityFieldKeyPressed

    private void communityFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_communityFieldKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_communityFieldKeyPressed

    private void cityFieldUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityFieldUpdateKeyPressed
        // TODO add your handling code here:
           
    }//GEN-LAST:event_cityFieldUpdateKeyPressed

    private void communityFieldUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_communityFieldUpdateKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_communityFieldUpdateKeyPressed

    private void cityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityFieldKeyTyped
        // TODO add your handling code here:
          char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_cityFieldKeyTyped

    private void communityFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_communityFieldKeyTyped
        // TODO add your handling code here:
          char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_communityFieldKeyTyped

    private void cityFieldUpdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityFieldUpdateKeyTyped
        // TODO add your handling code here:
        char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_cityFieldUpdateKeyTyped

    private void communityFieldUpdateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_communityFieldUpdateKeyTyped
        // TODO add your handling code here:
          char value = evt.getKeyChar();
        if((!Character.isAlphabetic(value))){
            evt.consume();
        }
    }//GEN-LAST:event_communityFieldUpdateKeyTyped

    private void displayCommunity() {
        System.out.println("Inside community");
        DefaultTableModel model = (DefaultTableModel) communityTableModel.getModel();
        model.setRowCount(0);
        for (Community em : comHistory.getCommunityHistory()) {
            System.out.println("commhistory" + em);
            Object[] row = new Object[3];
            row[0] = em;
            row[1] = em.getCity();
            model.addRow(row);

        }
//    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateCommunity;
    private javax.swing.JButton btnDeleteCommunity;
    private javax.swing.JButton btnUpdateCommunity;
    private javax.swing.JButton btnViewCommunity;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField cityFieldUpdate;
    private javax.swing.JTextField communityField;
    private javax.swing.JTextField communityFieldUpdate;
    private javax.swing.JTable communityTableModel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
