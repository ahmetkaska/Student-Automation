package StudentAutomations;

import StudentAutomations.Person;
import StudentAutomations.Course;
import java.util.ArrayList;

/**
 *
 * @author ahmetkaska
 */
public class Teacher extends Person { // Inheritance Person class

    ArrayList<Course> courseListOfTeacher; // For testing, teacher can have a lot of courses.
    static int teacherId = 0;
    private String department;

    private String status;

    public Teacher(String name, String surname, String password, int age, String address, String telephoneNumber, String department, String status) {
        super(name, surname, password, age, address, telephoneNumber); // Person constructor
        teacherId++; // Automaticilly increasing
        this.department = department;
        this.status = status;
        courseListOfTeacher = new ArrayList<>(); // Every teacher has a course list for testing
    }
    // Encapsulation

    public static int getTeacherId() {
        return teacherId;
    }

    public static void setTeacherId(int teacherId) {
        Teacher.teacherId = teacherId;
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

    // For testing 
    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println(" Department : " + this.department + " Status : " + this.status);
    }

    public void coursesOfTeacher() {
        for (int i = 0; i < this.courseListOfTeacher.size(); i++) {
            System.out.println("* " + this.courseListOfTeacher.get(i).toString());
            System.out.println("/////////////////////////////////////////////////////");
        }
    }
    // For testing, The toString() method is overridden because we store objects in lists.

    @Override
    public String toString() {
        return super.toString() + " Department : " + this.department + " Status : " + this.status;
    }

}
