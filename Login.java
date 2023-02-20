
package StudentAutomations;

/**
 *
 * @author ahmetkaska
 */
public class Login {
    // Attributes
    private String userName;
    private String password;
    
    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    // Getter Setter Methods
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    // This function takes 2 parameters, name and password. And it compares these values ​​with the values ​​of the parameters sent to the constructor method. 
    public boolean login(String userName, String password){
        if(userName.equals(this.userName) && password.equals(this.password)){
            return true;
        }else{
            return false;
        }
    }
    
}
