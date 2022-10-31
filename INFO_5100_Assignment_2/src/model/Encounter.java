/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Rishab
 */
public class Encounter extends Vitals {
    //private Vitals vital;
    private int encounterCount = 0;
    private String updateTime;

    public int getEncounterCount() {
        return encounterCount;
    }
    
    
    public Encounter()
    {
        
    }

//    public Vitals getVital() {
//        return vital;
//    }

//    public void setVital(Vitals vital) {
//        this.vital = vital;
//    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    private EncounterHistory encounterHistory;
     public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    
    
}
