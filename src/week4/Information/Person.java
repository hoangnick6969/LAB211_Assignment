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

class Person {
    protected String id, fullName, phoneNumber, major;
    protected int yearOfBirth;

    public Person() {
        this.id = "";
        this.fullName = "";
        this.phoneNumber = "";
        this.major = "";
        this.yearOfBirth = 0;
    }

    public void inputAll(Scanner sc) {
        while (true) {
            System.out.print("ID (6 digits): ");
            id = sc.next();
            if (id.matches("\\d{6}")) break;
            System.out.println("Data input is invalid");
        }

        sc.nextLine(); 
        while (true) {
            System.out.print("Full Name: ");
            fullName = sc.nextLine();
            if (fullName.matches("[A-Za-z ]+")) break;
            System.out.println("Data input is invalid");
        }

        while (true) {
            System.out.print("Phone Number (12 digits): ");
            phoneNumber = sc.next();
            if (phoneNumber.matches("\\d{12}")) break;
            System.out.println("Data input is invalid");
        }

        while (true) {
            System.out.print("Year of Birth: ");
            yearOfBirth = sc.nextInt();
            if (yearOfBirth < Calendar.getInstance().get(Calendar.YEAR)) break;
            System.out.println("Data input is invalid");
        }

        sc.nextLine(); 
        while (true) {
            System.out.print("Major (<=30 characters): ");
            major = sc.nextLine();
            if (major.length() <= 30) break;
            System.out.println("Data input is invalid");
        }
    }

    public void display() {
        System.out.printf("%s - %s - %s - %d - %s\n", id, fullName, phoneNumber, yearOfBirth, major);
    }
}
