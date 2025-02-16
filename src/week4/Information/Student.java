/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.Information;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author PC
 */
class Student extends Person {
    private int yearOfAdmission;
    private int entranceEnglishScore;

    public Student() {
        super();
        this.yearOfAdmission = 0;
        this.entranceEnglishScore = 0;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void inputAll(Scanner sc) {
        super.inputAll(sc);
        
        while (true) {
            System.out.print("Year of Admission: ");
            yearOfAdmission = sc.nextInt();
            if (yearOfAdmission >= yearOfBirth && yearOfAdmission <= Calendar.getInstance().get(Calendar.YEAR)) break;
            System.out.println("Data input is invalid");
        }
        
        while (true) {
            System.out.print("Entrance English Score (0-100): ");
            entranceEnglishScore = sc.nextInt();
            if (entranceEnglishScore >= 0 && entranceEnglishScore <= 100) break;
            System.out.println("Data input is invalid");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" - %d - %d\n", yearOfAdmission, entranceEnglishScore);
    }
}