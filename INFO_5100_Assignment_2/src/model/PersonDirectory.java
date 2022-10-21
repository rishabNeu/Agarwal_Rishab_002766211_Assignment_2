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
public class PersonDirectory {

    private ArrayList<Person> personDirectory;

    public PersonDirectory() {
        this.personDirectory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonDetails() {
        return personDirectory;
    }

    public Person addPerson() {

        Person p = new Person();
        personDirectory.add(p);

        return p;

    }

    public void deleteEmployee(Person selectedPerson) {

        personDirectory.remove(selectedPerson);

    }

}
