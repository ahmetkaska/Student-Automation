/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentAutomation;

import java.util.ArrayList;

/**
 *
 * @author ahmetkaska
 */
public class Person extends Operations{
    
    private String name;
    private String surname;
    private int age;
    private String address;
    private String telephoneNumber;
    
    public Person(){
        this("Not Information", "Not Information", 0, "Not Information", "Not Information");
    }

    public Person(String name, String surname, int age, String address, String telephoneNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    
    public void showInformation(){
        String info = "Name : " + this.name + " Surname : " + this.surname + " Age : " + this.age + " Address : " + this.address + " Telephone Number : " + this.telephoneNumber;
        System.out.print(info);
    }

    @Override
    public String toString() {
        return "Name : " + this.name + " Surname : " + this.surname + " Age : " + this.age + " Address : " + this.address + " Telephone Number : " + this.telephoneNumber;
    }

    
    
    
    
}
