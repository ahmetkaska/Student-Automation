/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentAutomation;

import java.util.ArrayList;

/**
 *
 * @author ahmetkaska
 */
public class Course {
    ArrayList<Student> studentListOfCourse;
    static private int courseId = 0;
    private String courseTittle;
    private double grade;
    private int credits;

    public Course( String courseTittle, double grade, int credits) {
        courseId++;
        this.courseTittle = courseTittle;
        this.grade = grade;
        this.credits = credits;
        studentListOfCourse = new ArrayList<>();
    }

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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
  
     
    public void showCourseInformation(){
        String info = "Course ID : " + courseId + " --> Course Title : " + this.courseTittle + " Grade of Course : " + this.grade + " Credits of Course : " + this.credits;
        System.out.println(info);
        
    }

    @Override
    public String toString() {
        return "Course ID : " + courseId + " --> Course Title : " + this.courseTittle + " Grade of Course : " + this.grade + " Credits of Course : " + this.credits;
    }
    
    public void studentsOfCourse(){
        for(int i = 0; i < this.studentListOfCourse.size(); i++){
            System.out.println("- " + this.studentListOfCourse.get(i).toString());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");
        }
    }
    
    
    
    
    
    
}
