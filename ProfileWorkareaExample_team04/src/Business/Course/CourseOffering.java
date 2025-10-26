/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author pranjalpatil
 */
public class CourseOffering {
        private Course course;
    private String semester;
    private FacultyProfile faculty;
    private int capacity;
    private ArrayList<Enrollment> enrollments;
 
    public CourseOffering(Course course, String semester, FacultyProfile faculty, int capacity) {
        this.course = course;
        this.semester = semester;
        this.faculty = faculty;
        this.capacity = capacity;
        this.enrollments = new ArrayList<>();
    }
 
    // methods: enrollStudent(), dropStudent(), getEnrolledCount()
    
}
