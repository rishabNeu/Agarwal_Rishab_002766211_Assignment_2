/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Rishab Agarwal
 */


import java.util.ArrayList;


public class VitalHistory {
    
    private ArrayList<Vitals> vitalsHistory;
    
    
    public VitalHistory() {
        this.vitalsHistory = new ArrayList<>();
    }

    public ArrayList<Vitals> getVitalDetails() {
        return vitalsHistory;
    }

    public Vitals addVitals() {

        Vitals v = new Vitals();
        vitalsHistory.add(v);

        return v;

    }

    public void deleteVital(Vitals selectedVital) {

        vitalsHistory.remove(selectedVital);

    }
    
    
}

