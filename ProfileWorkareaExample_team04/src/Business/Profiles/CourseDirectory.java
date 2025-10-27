/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Course.CourseOffering;
import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class CourseDirectory {
    private ArrayList<CourseOffering> offerings;

    public CourseDirectory() {
        offerings = new ArrayList<>();
    }

    public ArrayList<CourseOffering> getOfferings() {
        return offerings;
    }

    public void addOffering(CourseOffering co) {
        offerings.add(co);
    }
}

