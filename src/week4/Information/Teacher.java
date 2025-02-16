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
class Teacher extends Person {
    private int yearsInProfession;
    private String contractType;
    private double salaryCoefficient;

    public Teacher() {
        super();
        this.yearsInProfession = 0;
        this.contractType = "";
        this.salaryCoefficient = 0;
    }

    public int getYearsInProfession() {
        return yearsInProfession;
    }

    public void inputAll(Scanner sc) {
        super.inputAll(sc);
        
        while (true) {
            System.out.print("Years in Profession: ");
            yearsInProfession = sc.nextInt();
            if (yearsInProfession >= 0 && yearsInProfession < (Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth)) break;
            System.out.println("Data input is invalid");
        }

        sc.nextLine();
        while (true) {
            System.out.print("Contract Type (Long/Short): ");
            contractType = sc.next();
            if (contractType.equals("Long") || contractType.equals("Short")) break;
            System.out.println("Data input is invalid");
        }
        
        while (true) {
            System.out.print("Salary Coefficient: ");
            salaryCoefficient = sc.nextDouble();
            if (salaryCoefficient >= 0) break;
            System.out.println("Data input is invalid");
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" - %d - %s - %.2f\n", yearsInProfession, contractType, salaryCoefficient);
    }
}
