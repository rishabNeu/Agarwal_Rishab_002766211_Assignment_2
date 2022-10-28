/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Rishab
 */
public class Encounter {
    //private Vitals vital;
    private int encounterCount = 0;

    public int getEncounterCount() {
        return encounterCount;
    }
    
    
    public Encounter()
    {
        
    }
    
    public Encounter(int encCount)
    {
       this.encounterCount = encCount;
    }
    

    public void setEncounterCount(int encounterCount) {
        this.encounterCount = encounterCount;
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
    
    
    
}
