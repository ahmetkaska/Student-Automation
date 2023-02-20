package StudentAutomations;

import java.util.ArrayList;

/**
 *
 * @author ahmetkaska
 */
public class Student extends Person { // Inheritance Person class

    ArrayList<Course> coursesOfStudentList; // Student can take a lot of courses.
    static int studentId = 0; // static implemented
    private int studentNumber;
    private String department;

    public Student(String name, String surname, String password, int age, String address, String telephoneNumber, int studentNumber, String department) {
        super(name, surname, password, age, address, telephoneNumber); // Person constructor
        studentId++; // Automatically increasing, when object is created
        this.studentNumber = studentNumber;
        this.department = department;
        this.coursesOfStudentList = new ArrayList<>(); // There will be a course list for each student. For testing.
    }
    // Encapsulation

    public static int getStudentId() {
        return studentId;
    }

    public static void setStudentId(int studentId) {
        Student.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public void showInformation() {
        System.out.println("--- Student Information ---");
        System.out.print(" Student Number : " + this.studentNumber + " ");
        super.showInformation();
        System.out.println(" Department : " + this.department);
    }
    // For testing, The toString() method is overridden because we store objects in lists.

    @Override
    public String toString() {
        return super.toString() + " Student Number : " + this.studentNumber + " Department :  " + this.department;
    }

    // Courses of student
    public void showCoursesOfStudent() {
        System.out.println("--- Courses ---");
        for (int i = 0; i < coursesOfStudentList.size(); i++) {
            System.out.println("* " + coursesOfStudentList.get(i).toString());
        }
        System.out.println("////////////////////////////////////////");
    }

}
