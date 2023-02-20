
package StudentAutomations;

import StudentAutomations.Student;
import java.util.ArrayList;

/**
 *
 * @author ahmetkaska
 */
public class Course  {
    ArrayList<Student> studentListOfCourse; // for testing 
    static private int courseId = 0;   // implemented static because the need for constant processing
    private String courseTittle;
    private double passGrade;
    private int credits;

    public Course( String courseTittle, double passGrade, int credits) {
        courseId++; // It will increase for each created object reference.
        this.courseTittle = courseTittle;
        this.passGrade = passGrade;
        this.credits = credits;
        studentListOfCourse = new ArrayList<>(); // Each created object reference, A student list will be created for each course.
    }
   // Getters and Setter (Encapsulation)
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTittle() {
        return courseTittle;
    }

    public void setCourseTittle(String courseTittle) {
        this.courseTittle = courseTittle;
    }

    public double getPassGrade() {
        return passGrade;
    }

    public void setPassGrade(double grade) {
        this.passGrade = grade;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
  
    // For testing
    public void showCourseInformation(){
        String info = "Course ID : " + courseId + " --> Course Title : " + this.courseTittle + " Grade of Course : " + this.passGrade + " Credits of Course : " + this.credits;
        System.out.println(info);
        
    }
    
    // For testing, The toString() method is overridden because we store objects in lists.
    @Override
    public String toString() {
        return "Course ID : " + courseId + " --> Course Title : " + this.courseTittle + " Grade of Course : " + this.passGrade + " Credits of Course : " + this.credits;
    }

    
    // Students of the Course
    public void studentsOfCourse(){
        for(int i = 0; i < this.studentListOfCourse.size(); i++){
            System.out.println("- " + this.studentListOfCourse.get(i).toString());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        }
    }
    
    
    
    
    
    
}
