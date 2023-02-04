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
public class Teacher extends Person{
    
    ArrayList<Course> courseListOfTeacher;
    private String department;
    private String graduatedSchool;
    
    public Teacher(String name, String surname, String password, int age, String address, String telephoneNumber, String department, String graduatedSchool){
        super(name, surname, password, age, address, telephoneNumber);
        this.department = department;
        this.graduatedSchool = graduatedSchool;
        courseListOfTeacher = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGraduatedSchool() {
        return graduatedSchool;
    }

    public void setGraduatedSchool(String graduatedSchool) {
        this.graduatedSchool = graduatedSchool;
    }

    @Override
    public void showInformation() {
        super.showInformation(); 
        System.out.println(" Department : " + this.department + " Graduated School : " + this.graduatedSchool);
    }
    
    public void coursesOfTeacher(){
        for(int i = 0; i < this.courseListOfTeacher.size();i++){
            System.out.println("* " + this.courseListOfTeacher.get(i).toString());
            System.out.println("/////////////////////////////////////////////////////");
        }
    }
    
    
    
}
