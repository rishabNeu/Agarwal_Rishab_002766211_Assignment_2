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
public class HospitalDirectory {
    
      private ArrayList<Hospital> hospitalDirectory;

    public HospitalDirectory() {
        this.hospitalDirectory = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitalDetails() {
        return hospitalDirectory;
    }

    public Hospital addHospital() {

        Hospital h = new Hospital();
        hospitalDirectory.add(h);

        return h;

    }

    public void deleteHospital(Hospital selectedHospital) {

        hospitalDirectory.remove(selectedHospital);

    }
    
    
}
