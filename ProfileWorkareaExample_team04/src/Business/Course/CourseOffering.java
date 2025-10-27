/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Profiles.FacultyProfile;
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
    private boolean enrollmentOpen;
    private ArrayList<Enrollment> enrollments;

    public CourseOffering(Course course, String semester, FacultyProfile faculty, int capacity, boolean enrollmentOpen) {
        this.course = course;
        this.semester = semester;
        this.faculty = faculty;
        this.capacity = capacity;
        this.enrollmentOpen = enrollmentOpen;
        this.enrollments = new ArrayList<>();
    }

    public boolean isEnrollmentOpen() {
        return enrollmentOpen;
    }

    public void setEnrollmentOpen(boolean open) {
        this.enrollmentOpen = open;
    }

    public Course getCourse() {
        return course;
    }

    public FacultyProfile getFaculty() {
        return faculty;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setFaculty(FacultyProfile faculty) {
        this.faculty = faculty;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setEnrollments(ArrayList<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getSemester() {
        return semester;
    }

    public ArrayList<Enrollment> getEnrollments() {
        return enrollments;
    }

    public boolean enrollStudent(Enrollment e) {
        if (!enrollmentOpen) {
            return false;
        }
        if (enrollments.size() >= capacity) {
            return false;
        }
        enrollments.add(e);
        return true;
    }

}
