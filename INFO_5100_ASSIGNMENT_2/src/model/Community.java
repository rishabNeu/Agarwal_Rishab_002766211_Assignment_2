/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Rishab
 */
public class Community {
    
    
    public Community(House house, String communityName, City city){
        this.house = house;
        this.communityName = communityName;
        this.city = city;
    }
    
    public Community(String communityName){
        this.communityName = communityName;
    }
    
    public Community(){
        
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    private String communityName;
    private City city;
    private House house;

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
     @Override
    public String toString() {
        return String.valueOf(communityName) ;
    }
    
    
}
