
package StudentAutomations;

/**
 *
 * @author ahmetkaska
 */

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FullDB {
   
    

    //Create a method to connect to database
    void createConnection(){
        try{
            //Connect to Database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/SchoolAutomation","root","12345678");


        }

        catch (ClassNotFoundException ex){
            Logger.getLogger(FullDB.class.getName()).log(Level.SEVERE,null,ex);
        }

        catch(SQLException ex){
            Logger.getLogger(FullDB.class.getName()).log(Level.SEVERE,null,ex);
            ex.printStackTrace();
        }
    }

}
