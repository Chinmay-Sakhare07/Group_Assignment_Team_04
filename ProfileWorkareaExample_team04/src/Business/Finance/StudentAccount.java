/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Finance;

import java.util.ArrayList;

/**
 *
 * @author chinm
 */
public class StudentAccount {

    private double balance;
    private ArrayList<Payment> paymentHistory;

    public StudentAccount() {
        this.balance = 0.0;
        this.paymentHistory = new ArrayList<>();
    }

    public void payTuition(double amount) {
    }

    public void refund(double amount) {
    }

    public double getOutstandingBalance() {
        return balance;
    }

}
