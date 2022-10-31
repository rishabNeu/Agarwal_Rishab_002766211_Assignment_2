/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shobhitsrivastava
 */
public class City {
    
    private String cityName;
    private Community community;
    
    
    public City(String cityName){
        this.cityName=cityName;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public String getcityName() {
        return cityName;
    }

    public void setcityName(String cityName) {
        this.cityName = cityName;
    }
     @Override
    public String toString() {
        return String.valueOf(cityName) ;
    }
    
}
