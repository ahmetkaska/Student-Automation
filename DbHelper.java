
package StudentAutomation;

//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ahmetkaska
 */
public class DbHelper {
 
    static String username = "root";
    static String password = "12345678";
    static String dbUrl = "jdbc:mysql://localhost:3306/Other databases/StudentAutomation.db";
    
    public Connection getConnection() throws SQLException{
        return (Connection) DriverManager.getConnection(dbUrl,username,password);
    }
    
    public void ShowError(SQLException ex){
        System.out.println("Error : " + ex.getMessage() ); 
        System.out.println("Error Code : " + ex.getErrorCode());
    }
    
}
