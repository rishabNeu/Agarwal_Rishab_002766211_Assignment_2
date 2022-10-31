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
public class PersonDirectory {

    private ArrayList<Person> person;

    public PersonDirectory() {

        this.person = new ArrayList<Person>();

    }

    public Person addNewPerson() {
        Person newPerson = new Person();
        person.add(newPerson);
        return newPerson;

    }
    public void setHistory(ArrayList<Person> person) {
        this.person = person;
    }
    
     public ArrayList<Person> getHistory() {
        return person;
    }
     
      public void deletePerson(Person p){
        person.remove(p); 
    }
    

}
