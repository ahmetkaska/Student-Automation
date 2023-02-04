/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentAutomation;

/**
 *
 * @author ahmetkaska
 */
public class Admin extends Person{

    private String status;

    public Admin(String name, String surname, String password, int age, String address, String telephoneNumber, String status) {
        super(name, surname, password, age, address, telephoneNumber);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
