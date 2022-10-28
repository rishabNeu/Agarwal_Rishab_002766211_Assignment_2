/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.CommunityHistory;
import model.Person;
import model.PersonDirectory;



/**
 *
 * @author Rishab
 */
public class SystemJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    Person p ;
    PersonDirectory personDirectory;
    CommunityHistory cHistory ;
    public SystemJFrame() {
        initComponents();
       personDirectory = new PersonDirectory();
       p = new Person();
       cHistory =  new CommunityHistory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnManagePatient = new javax.swing.JButton();
        btnManageDoctor = new javax.swing.JButton();
        btnManageHospital = new javax.swing.JButton();
        btnManageEncounter = new javax.swing.JButton();
        btnManageCommunity = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        mainJTabbedPanel = new javax.swing.JTabbedPane();
        jPanelCreate = new javax.swing.JPanel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnManagePatient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManagePatient.setText("Manage Patients");
        btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientActionPerformed(evt);
            }
        });

        btnManageDoctor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageDoctor.setText("Manage Doctors");
        btnManageDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDoctorActionPerformed(evt);
            }
        });

        btnManageHospital.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageHospital.setText("Manage Hospitals");
        btnManageHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospitalActionPerformed(evt);
            }
        });

        btnManageEncounter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageEncounter.setText("Manage Encounters");
        btnManageEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEncounterActionPerformed(evt);
            }
        });

        btnManageCommunity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManageCommunity.setText("Manage Community");
        btnManageCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCommunityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageHospital, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManagePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnManagePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnManageDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnManageHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnManageEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnManageCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlPanel);

        javax.swing.GroupLayout jPanelCreateLayout = new javax.swing.GroupLayout(jPanelCreate);
        jPanelCreate.setLayout(jPanelCreateLayout);
        jPanelCreateLayout.setHorizontalGroup(
            jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        jPanelCreateLayout.setVerticalGroup(
            jPanelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        mainJTabbedPanel.addTab("Create", jPanelCreate);

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJTabbedPanel)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJTabbedPanel)
        );

        jSplitPane1.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientActionPerformed
        
         PersonJPanel personPanel = new PersonJPanel(personDirectory,cHistory); 
        jSplitPane1.setRightComponent(personPanel);
        
        
        
    }//GEN-LAST:event_btnManagePatientActionPerformed

    private void btnManageDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDoctorActionPerformed

        DoctorJPanel docPanel = new DoctorJPanel(  personDirectory);
        jSplitPane1.setRightComponent(docPanel);
    }//GEN-LAST:event_btnManageDoctorActionPerformed

    private void btnManageHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospitalActionPerformed
        // TODO add your handling code here:
        HospitalJPanel hospPanel = new HospitalJPanel();
        jSplitPane1.setRightComponent(hospPanel);
    }//GEN-LAST:event_btnManageHospitalActionPerformed

    private void btnManageEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEncounterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageEncounterActionPerformed

    private void btnManageCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCommunityActionPerformed
        // TODO add your handling code here:
        CommunityJPanel communityPanel = new CommunityJPanel( cHistory); 
        jSplitPane1.setRightComponent(communityPanel);
    }//GEN-LAST:event_btnManageCommunityActionPerformed

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
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCommunity;
    private javax.swing.JButton btnManageDoctor;
    private javax.swing.JButton btnManageEncounter;
    private javax.swing.JButton btnManageHospital;
    private javax.swing.JButton btnManagePatient;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanelCreate;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTabbedPane mainJTabbedPanel;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}
