
package StudentAutomations;

/**
 *
 * @author ahmetkaska
 */
public class Admin extends Teacher{ // Inheritance teacher class

   
    // Constructor
    public Admin(String name, String surname, String password, int age, String address, String telephoneNumber, String department, String status) {
        super(name, surname, password, age, address, telephoneNumber,department,status); 
        
    }

    
    
    
}
