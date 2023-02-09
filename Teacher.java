
package StudentAutomation;

import java.util.ArrayList;

/**
 *
 * @author ahmetkaska
 */
public class Teacher extends Person{
    
    ArrayList<Course> courseListOfTeacher;
    private String department;
    
    private String status;
    
    public Teacher(String name, String surname, String password, int age, String address, String telephoneNumber, String department,  String status){
        super(name, surname, password, age, address, telephoneNumber);
        this.department = department;
       
        this.status = status;
        courseListOfTeacher = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

 

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    @Override
    public void showInformation() {
        super.showInformation(); 
        System.out.println(" Department : " + this.department + " Status : " + this.status);
    }
    
    public void coursesOfTeacher(){
        for(int i = 0; i < this.courseListOfTeacher.size();i++){
            System.out.println("* " + this.courseListOfTeacher.get(i).toString());
            System.out.println("/////////////////////////////////////////////////////");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Department : " + this.department + " Status : " + this.status; 
    }
    
    
    
}
