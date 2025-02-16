/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4.Student;

import week4.Student.Student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author PC
 */
import java.util.*;


public class StudentManagement {
    private List<Student> students = new ArrayList<>();

    public void createStudent() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter student ID: ");
            String id = scanner.nextLine();
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            System.out.println("Enter semester: ");
            String semester = scanner.nextLine();
            System.out.println("Enter course name (Java, .Net, C/C++): ");
            String course = scanner.nextLine();

            students.add(new Student(id, name, semester, course));

            if (students.size() > 3) {
                System.out.println("Do you want to add more students? (Y/N)");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }
    }

    public void findAndSortStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name or part of name to search: ");
        String name = scanner.nextLine();

        List<Student> foundStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getStudentName().toLowerCase().contains(name.toLowerCase())) {
                foundStudents.add(student);
            }
        }

        foundStudents.sort(Comparator.comparing(Student::getStudentName));

        if (foundStudents.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : foundStudents) {
                System.out.println(student);
            }
        }
    }

    public void updateOrDeleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID to search: ");
        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Found student: " + student);
                System.out.println("Do you want to update (U) or delete (D) this student?");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("U")) {
                    System.out.println("Enter new name: ");
                    student.setStudentName(scanner.nextLine());
                    System.out.println("Enter new semester: ");
                    student.setSemester(scanner.nextLine());
                    System.out.println("Enter new course: ");
                    student.setCourseName(scanner.nextLine());
                    System.out.println("Student updated successfully.");
                } else if (choice.equalsIgnoreCase("D")) {
                    students.remove(student);
                    System.out.println("Student deleted successfully.");
                }
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void report() {
        Map<String, Map<String, Integer>> reportData = new HashMap<>();
        for (Student student : students) {
            String name = student.getStudentName();
            String course = student.getCourseName();
            reportData.putIfAbsent(name, new HashMap<>());
            Map<String, Integer> courses = reportData.get(name);
            courses.put(course, courses.getOrDefault(course, 0) + 1);
        }

        for (Map.Entry<String, Map<String, Integer>> entry : reportData.entrySet()) {
            String name = entry.getKey();
            Map<String, Integer> courses = entry.getValue();
            for (Map.Entry<String, Integer> courseEntry : courses.entrySet()) {
                System.out.println(name + " | " + courseEntry.getKey() + " | " + courseEntry.getValue());
            }
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWELCOME TO STUDENT MANAGEMENT");
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    createStudent();
                    break;
                case 2:
                    findAndSortStudents();
                    break;
                case 3:
                    updateOrDeleteStudent();
                    break;
                case 4:
                    report();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        management.displayMenu();
    }
}
