/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shobhitsrivastava
 */
public class Doctor {

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    private String doctorName;
    private int doctorId;
    private Vitals vitalSigns;
    private DoctorDirectory doctorDirectory;

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public Vitals getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(Vitals vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
}


