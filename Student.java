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
public class Student extends Person {

    ArrayList<Course> coursesOfStudentList;
    private int studentNumber;
    private String department;

    public Student(String name, String surname, String password, int age, String address, String telephoneNumber, int studentNumber, String department) {
        super(name, surname, password, age, address, telephoneNumber);
        this.studentNumber = studentNumber;
        this.department = department;
        this.coursesOfStudentList = new ArrayList<>();
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

    @Override
    public String toString() {
        return super.toString()+ " Student Number : " + this.studentNumber + " Department :  " + this.department; 
    }
    
    public void showCoursesOfStudent() {
        System.out.println("--- Courses ---");
        for (int i = 0; i < coursesOfStudentList.size(); i++) {
            System.out.println("* " + coursesOfStudentList.get(i).toString());
        }
        System.out.println("////////////////////////////////////////");
    }

   
    
    
    
}
