/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */

import Business.Business;
import Business.Course.Course;
import Business.Course.CourseOffering;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");
        

// Create Persons
        PersonDirectory persondirectory = business.getPersonDirectory();
// person representing sales organization        
        Person person001 = persondirectory.newPerson("John Smith");
        Person person002 = persondirectory.newPerson("Gina Montana");
        Person person003 = persondirectory.newPerson("Adam Rollen");

        Person person005 = persondirectory.newPerson("Jim Dellon");
        Person person006 = persondirectory.newPerson("Anna Shnider");
        Person person007 = persondirectory.newPerson("Laura Brown");
        Person person008 = persondirectory.newPerson("Jack While");
        Person person009 = persondirectory.newPerson("Fidelity");

// Create Admins to manage the business
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(person001);

        StudentDirectory studentdirectory = business.getStudentDirectory();
        StudentProfile studentprofile0 = studentdirectory.newStudentProfile(person003);

        FacultyDirectory facultydirectory = business.getFacultyDirectory();
        FacultyProfile facultyProfile0 = facultydirectory.newFacultyProfile(person002);

        FacultyDirectory facultydirectory1 = business.getFacultyDirectory();
        FacultyProfile facultyProfile1 = facultydirectory1.newFacultyProfile(person005);

        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "****");
        UserAccount ua4 = uadirectory.newUserAccount(studentprofile0, "adam", "****");
        UserAccount ua5 = uadirectory.newUserAccount(facultyProfile0, "Gina", "****");
        
        prepopulateCourses(business,facultyProfile0, facultyProfile1);
        return business;
    }

    public static void prepopulateCourses(Business business, FacultyProfile f1, FacultyProfile f2) {
        Course c1 = new Course("INFO5100", "App Eng & Dev", "Core course", 4);
        Course c2 = new Course("INFO6200", "DBMS", "Database Systems", 4);
        Course c3 = new Course("INFO6210", "Web Dev", "Full-stack", 4);
        Course c4 = new Course("INFO6350", "Cloud Computing", "AWS & Azure", 4);
        Course c5 = new Course("INFO6500", "AI Systems", "Intro to AI", 4);

        business.getCourseDirectory().addOffering(new CourseOffering(c1, "Fall 2025", f1, 30, true));
        business.getCourseDirectory().addOffering(new CourseOffering(c2, "Fall 2025", f2, 25, true));
        business.getCourseDirectory().addOffering(new CourseOffering(c3, "Fall 2025", f1, 20, false));
        business.getCourseDirectory().addOffering(new CourseOffering(c4, "Fall 2025", f2, 20, true));
        business.getCourseDirectory().addOffering(new CourseOffering(c5, "Fall 2025", f1, 20, false));
    }

}
