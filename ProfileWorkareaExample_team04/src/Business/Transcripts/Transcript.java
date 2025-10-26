/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Transcripts;

/**
 *
 * @author chinm
 */
import java.util.ArrayList;

public class Transcript {

    private ArrayList<TranscriptEntry> entries;

    public Transcript() {
        entries = new ArrayList<>();
    }

    public double calculateTermGPA(String term) {
        return 0.0;
    }

    public double calculateOverallGPA() {
        return 0.0;
    }

    public String determineStanding() {
        return "Good Standing";
    }
}
