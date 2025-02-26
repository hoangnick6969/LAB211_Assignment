/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_course_largeNumber;

/**
 *
 * @author PC
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CourserManager manager = new CourserManager();

    OnlineCourse online1 = new OnlineCourse("PRO192", "Java Programming", 3, "Udemy", "NguyenA", "Advanced course");
    OnlineCourse online2 = new OnlineCourse("WED201", "HTML&CSS Programming", 4, "Coursera", "VanB", "Beginner Design Web");

    OfflineCourse offline1 = new OfflineCourse("DBI", "Database Systems", 3, "2025-03-01", "2025-29-01", "Campus DaNang");

    manager.addOnlineCourse(online1);
    manager.addOnlineCourse(online2);
    manager.addOfflineCourse(offline1);

    System.out.println("\nList of Online Courses:");
    manager.showOnlineCourses();

    System.out.println("\nList of Offline Courses:");
    manager.showOfflineCourses();
    }
}
// Scanner scanner = new Scanner(System.in);
//        
//        while (true) {
//            System.out.println("\n===== COURSE MANAGEMENT =====");
//            System.out.println("1. Add Online Course");
//            System.out.println("2. Add Offline Course");
//            System.out.println("3. Update Course");
//            System.out.println("4. Delete Course");
//            System.out.println("5. Show All Online Courses");
//            System.out.println("6. Show All Offline Courses");
//            System.out.println("7. Show All Courses");
//            System.out.println("8. Search Course by Name");
//            System.out.println("9. Exit");
//            System.out.print("Choose an option: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); 
//
//            switch (choice) {
//                case 1:
//                    manager.addOnlineCourse();
//                    break;
//                case 2:
//                    manager.addOfflineCourse();
//                    break;
//                case 3:
//                    System.out.print("Enter Course ID to update: ");
//                    String updateId = scanner.nextLine();
//                    manager.updateCourse(updateId);
//                    break;
//                case 4:
//                    System.out.print("Enter Course ID to delete: ");
//                    String deleteId = scanner.nextLine();
//                    manager.deleteCourse(deleteId);
//                    break;
//                case 5:
//                    manager.showOnlineCourses();
//                    break;
//                case 6:
//                    manager.showOfflineCourses();
//                    break;
//                case 7:
//                    manager.showAllCourses();
//                    break;
//                case 8:
//                    System.out.print("Enter Course Name to search: ");
//                    String searchName = scanner.nextLine();
//                    manager.searchCourseByName(searchName);
//                    break;
//                case 9:
//                    System.out.println("Exiting program...");
//                    scanner.close();
//                    return;
//                default:
//                    System.err.println("Invalid choice! Please enter a number from 1 to 9.");
//            }
//        }
//    }
//}
//

