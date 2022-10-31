/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Rishab
 */


import java.util.ArrayList;


public class VitalHistory {
    
    private ArrayList<VitalSigns> vitalsHistory;
    
    
    public VitalHistory() {
        this.vitalsHistory = new ArrayList<>();
    }

    public ArrayList<VitalSigns> getVitalDetails() {
        return vitalsHistory;
    }

    public VitalSigns addVitals() {

        VitalSigns v = new VitalSigns();
        vitalsHistory.add(v);

        return v;

    }

    public void deleteVital(VitalSigns selectedVital) {

        vitalsHistory.remove(selectedVital);

    }
    
    
}

