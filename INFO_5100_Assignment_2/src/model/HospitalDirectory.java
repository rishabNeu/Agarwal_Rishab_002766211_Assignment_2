/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shobhitsrivastava
 */

public class HospitalDirectory {
    
      private ArrayList<Hospital> hospital;

    public HospitalDirectory() {

        this.hospital = new ArrayList<Hospital>();

    }
     public Hospital addNewHospital() {
        Hospital newHospital = new Hospital();
        hospital.add(newHospital);
        return newHospital;

    }
      public void deleteHospital(Hospital p){
        hospital.remove(p); 
    }
     public ArrayList<Hospital> getHospitalList() {
        return hospital;
    }

    
}
