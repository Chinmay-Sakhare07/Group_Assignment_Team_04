/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.StudentProfile;

/**
 *
 * @author pranjalpatil
 */
public class Enrollment {
    private StudentProfile student;
    private CourseOffering offering;
    private String status; // Enrolled, Dropped, Completed
    private String grade;
 
    public Enrollment(StudentProfile student, CourseOffering offering) {
        this.student = student;
        this.offering = offering;
        this.status = "Enrolled";
    }
 
    // methods: assignGrade(), drop(), etc.
    
}
