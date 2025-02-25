/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author PC
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourserManager manager = new CourserManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n===== COURSE MANAGEMENT =====");
            System.out.println("1. Add Online Course");
            System.out.println("2. Add Offline Course");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Show All Online Courses");
            System.out.println("6. Show All Offline Courses");
            System.out.println("7. Show All Courses");
            System.out.println("8. Search Course by Name");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    manager.addOnlineCourse();
                    break;
                case 2:
                    manager.addOfflineCourse();
                    break;
                case 3:
                    System.out.print("Enter Course ID to update: ");
                    String updateId = scanner.nextLine();
                    manager.updateCourse(updateId);
                    break;
                case 4:
                    System.out.print("Enter Course ID to delete: ");
                    String deleteId = scanner.nextLine();
                    manager.deleteCourse(deleteId);
                    break;
                case 5:
                    manager.showOnlineCourses();
                    break;
                case 6:
                    manager.showOfflineCourses();
                    break;
                case 7:
                    manager.showAllCourses();
                    break;
                case 8:
                    System.out.print("Enter Course Name to search: ");
                    String searchName = scanner.nextLine();
                    manager.searchCourseByName(searchName);
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.err.println("Invalid choice! Please enter a number from 1 to 9.");
            }
        }
    }
}

