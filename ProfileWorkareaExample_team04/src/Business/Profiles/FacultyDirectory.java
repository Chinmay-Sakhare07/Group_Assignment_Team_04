/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chinm
 */
public class FacultyDirectory {
    private final ArrayList<FacultyProfile> facultyList;
    
    public FacultyDirectory() {

        this.facultyList = new ArrayList<>();
    }

    public FacultyProfile newFacultyProfile(Person p) {
        FacultyProfile fp = new FacultyProfile(p);
        facultyList.add(fp);
        return fp;
    }

    public FacultyProfile findFacultyByPersonId(String id) {
        for (FacultyProfile fp : facultyList) {
            if (fp.isMatch(id)) {
                return fp;
            }
        }
        return null;
    }

//    public FacultyProfile findByUsername(String username) {
//
//        return facultyList.stream()
//                .filter(fp -> business.getUserAccountDirectory().getUserAccountList().stream()
//                .anyMatch(ua -> ua.getAssociatedPersonProfile() == fp
//                && ua.getUserLoginName().equalsIgnoreCase(username)))
//                .findFirst()
//                .orElse(null);
//    }

//    public List<FacultyProfile> searchByDepartment(String department) {
//        ArrayList<FacultyProfile> results = new ArrayList<>();
//        for (FacultyProfile fp : facultyList) {
//             if (department != null && department.equalsIgnoreCase(fp.getDepartment())) {
//                 results.add(fp);
//             }
//        }
//        return results;
//    }
    public List<FacultyProfile> getAllFaculty() {
        return new ArrayList<>(facultyList);
    }

    public boolean removeFaculty(FacultyProfile fp) {
        return facultyList.remove(fp);
    }

    public int size() {
        return facultyList.size();
    }
}
