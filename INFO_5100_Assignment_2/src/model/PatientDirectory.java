/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Rishab
 */
public class PatientDirectory {
     private ArrayList<Patient> patientDirectory;

    public PatientDirectory() {
        this.patientDirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPersonDetails() {
        return patientDirectory;
    }

    public Patient addPatient() {

        Patient p = new Patient();
        patientDirectory.add(p);

        return p;

    }

    public void deletePatient(Patient selectedPatient) {

        patientDirectory.remove(selectedPatient);

    }
}
