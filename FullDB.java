/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentAutomations;

/**
 *
 * @author ahmetkaska
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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

            

            /*Insert/Uodate data to Database
            query.executeUpdate("INSERT INTO list" + "(name)" + "VALUES('orange'), ('melons')," +
                    "('hotdogs'), ('buns')");
              */
            //Execute a select all statement
            //Create a sql statement
            

//            System.out.println("Connected to Database");
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
