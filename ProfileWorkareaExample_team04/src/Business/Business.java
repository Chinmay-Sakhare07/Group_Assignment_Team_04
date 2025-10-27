/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.PersonDirectory;
import Business.Profiles.CourseDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.StudentDirectory;

import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role

    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultyDirectory;
    CourseDirectory courseDirectory;

    public Business(String n) {
        name = n;
        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        studentdirectory = new StudentDirectory();
        facultyDirectory = new FacultyDirectory();
        courseDirectory = new CourseDirectory();
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public EmployeeDirectory getEmployeedirectory() {
        return employeedirectory;
    }

    public void setEmployeedirectory(EmployeeDirectory employeedirectory) {
        this.employeedirectory = employeedirectory;
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    public void setUseraccountdirectory(UserAccountDirectory useraccountdirectory) {
        this.useraccountdirectory = useraccountdirectory;
    }

    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }

    public void setStudentdirectory(StudentDirectory studentdirectory) {
        this.studentdirectory = studentdirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentdirectory;
    }

}
