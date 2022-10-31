/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shobhitsrivastava
 */
public class SystemAdministrator {

    public DoctorDirectory getDoctoDirectory() {
        return doctoDirectory;
    }

    public void setDoctoDirectory(DoctorDirectory doctoDirectory) {
        this.doctoDirectory = doctoDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    private DoctorDirectory doctoDirectory;
    private PatientDirectory patientDirectory;
    private PersonDirectory personDirectory;
    private City city;
    
}
