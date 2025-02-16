/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.Information;

/**
 *
 * @author PC
 */
import java.util.*;
import java.util.regex.*;

public class InformationManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        
        while (true) {
            System.out.println("*** Information Management ***");
            System.out.println("1. Teacher\n2. Student\n3. Exit");
            System.out.print("You choose: ");
            int choice = sc.nextInt();
            if (choice == 3) break;
            
            if (choice == 1) {
                System.out.println("1. Input\n2. Print");
                System.out.print("You choose: ");
                int subChoice = sc.nextInt();
                if (subChoice == 1) {
                    Teacher t = new Teacher();
                    t.inputAll(sc);
                    teachers.add(t);
                } else if (subChoice == 2) {
                    teachers.sort(Comparator.comparingInt(Teacher::getYearsInProfession).reversed());
if (teachers.isEmpty()) {
    System.out.println("No teacher data available.");
} else {
    for (Teacher t : teachers) t.display();
}
                }
            } else if (choice == 2) {
                System.out.println("1. Input\n2. Print");
                System.out.print("You choose: ");
                int subChoice = sc.nextInt();
                if (subChoice == 1) {
                    Student s = new Student();
                    s.inputAll(sc);
                    students.add(s);
                } else if (subChoice == 2) {
                    students.sort(Comparator.comparingInt(Student::getYearOfAdmission));
if (students.isEmpty()) {
    System.out.println("No student data available.");
} else {
    for (Student s : students) s.display();
}
                }
            }
        }
        sc.close();
    }
}
