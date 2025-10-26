/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Transcripts;

import Business.Course.CourseOffering;

/**
 *
 * @author chinm
 */
public class TranscriptEntry {
    private CourseOffering offering;
    private String term;
    private String grade;
    private int creditHours;
    private double qualityPoints;

    public TranscriptEntry(CourseOffering offering, String term, String grade, int creditHours) {
        this.offering = offering;
        this.term = term;
        this.grade = grade;
        this.creditHours = creditHours;
    }
}
