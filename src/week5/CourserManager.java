/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class CourserManager {
    private List<OnlineCourse> onlineCourses = new ArrayList<>();
    private List<OfflineCourse> offlineCourses = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
private boolean checkExistCourse(String id) {
        for (Course c : onlineCourses) {
            if (c.getCourseId().equals(id)) return true;
        }
        for (Course c : offlineCourses) {
            if (c.getCourseId().equals(id)) return true;
        }
        return false;
    }
    public void addOnlineCourse() {
        OnlineCourse course = new OnlineCourse();
        course.inputAll();
        if (!checkExistCourse(course.getCourseId())) {
            onlineCourses.add(course);
            System.out.println("Online course added successfully.");
        } else {
            System.err.println("Course ID already exists!");
        }
    }

    public void addOfflineCourse() {
        OfflineCourse course = new OfflineCourse();
        course.inputAll();
        if (!checkExistCourse(course.getCourseId())) {
            offlineCourses.add(course);
            System.out.println("Offline course added successfully.");
        } else {
            System.err.println("Course ID already exists!");
        }
    }

    

    public void showOnlineCourses() {
        if (onlineCourses.isEmpty()) {
            System.out.println("No online courses available.");
        } else {
            for (OnlineCourse c : onlineCourses) {
                System.out.println(c);
            }
        }
    }

    public void showOfflineCourses() {
        if (offlineCourses.isEmpty()) {
            System.out.println("No offline courses available.");
        } else {
            for (OfflineCourse c : offlineCourses) {
                System.out.println(c);
            }
        }
    }

    public void showAllCourses() {
        showOnlineCourses();
        showOfflineCourses();
    }

    public void searchCourseByName(String name) {
        boolean found = false;
        for (Course c : onlineCourses) {
            if (c.getCourseName().equalsIgnoreCase(name)) {
                System.out.println(c);
                found = true;
            }
        }
        for (Course c : offlineCourses) {
            if (c.getCourseName().equalsIgnoreCase(name)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No course found with name: " + name);
        }
    }
public boolean deleteCourse(String id) {
        for (Course c : onlineCourses) {
            if (c.getCourseId().equals(id)) {
                onlineCourses.remove(c);
                System.out.println("Deleted Online Course: " + id);
                return true;
            }
        }
        for (Course c : offlineCourses) {
            if (c.getCourseId().equals(id)) {
                offlineCourses.remove(c);
                System.out.println("Deleted Offline Course: " + id);
                return true;
            }
        }
        System.err.println("Course not found!");
        return false;
    }

    public boolean updateCourse(String id) {
        for (Course c : onlineCourses) {
            if (c.getCourseId().equals(id)) {
                System.out.print("Enter new name: ");
                c.setCourseName(scanner.nextLine());
                System.out.print("Enter new credits: ");
                c.setCredits(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Course updated successfully.");
                return true;
            }
        }
        for (Course c : offlineCourses) {
            if (c.getCourseId().equals(id)) {
                System.out.print("Enter new name: ");
                c.setCourseName(scanner.nextLine());
                System.out.print("Enter new credits: ");
                c.setCredits(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Course updated successfully.");
                return true;
            }
        }
        System.err.println("Course not found!");
        return false;
    }
    
}

