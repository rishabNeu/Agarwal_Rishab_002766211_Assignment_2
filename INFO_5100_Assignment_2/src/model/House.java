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
public class House {
    
    //private Person person;
    private String address;
//    private String address;
    
//    @Override
//    public String toString(){
//        return address;
//    }
//    
    public House(String address){
        this.address = address;

    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
//    
//     public String addNewHouse() {
//        String newhouse = new String();
//        house.add(newhouse);
//        return newhouse;

//    public void setHouseHistory(ArrayList<String> house) {
//        this.house = house;
//    }
//    
//     public ArrayList<String> getHouseHistory() {
//        return house;
//    }
//     
//      public void deleteHouse(String h){
//        house.remove(h); 
//    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
     @Override
    public String toString() {
        return String.valueOf(address) ;
    }
    

    
}
