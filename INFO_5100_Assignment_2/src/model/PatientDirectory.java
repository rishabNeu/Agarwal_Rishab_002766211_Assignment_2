/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Rishab Agarwal
 */
public class PatientDirectory {
    
      private ArrayList<Patient> patient;

    public PatientDirectory() {

        this.patient = new ArrayList<Patient>();

    }
    
    public void setHistory(ArrayList<Patient> patientHistory) {
        this.patient = patientHistory;
    }

    public ArrayList<Patient> getPatientList() {
        return patient;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patient = patientList;
    }
    public Patient addPatient(){
        Patient newPatientDetails=new Patient();
        patient.add(newPatientDetails);
        return newPatientDetails;
    }  
    
}
