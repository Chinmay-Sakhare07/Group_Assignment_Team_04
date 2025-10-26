/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import java.util.ArrayList;
/**
 *
 * @author pranjalpatil
 */
public class Course {
    private String courseId;
    private String courseName;
    private String description;
    private int creditHours;
 
    public Course(String id, String name, String desc, int credits) {
        this.courseId = id;
        this.courseName = name;
        this.description = desc;
        this.creditHours = credits;
    }
 
    // getters and setters
    
}
