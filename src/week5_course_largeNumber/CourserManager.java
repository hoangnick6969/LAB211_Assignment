/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_course_largeNumber;
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

    public List<OnlineCourse> getOnlineCourses() {
        return onlineCourses;
    }

    public List<OfflineCourse> getOfflineCourses() {
        return offlineCourses;
    }
    
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

    public void addOnlineCourse(OnlineCourse course) {
        
//        course.inputAll();
        if (!checkExistCourse(course.getCourseId())) {
            onlineCourses.add(course);
            System.out.println("Online course added successfully.");
        } else {
            System.err.println("Course ID already exists!");
        }
    }

    public void addOfflineCourse(OfflineCourse course) {
        
//        course.inputAll();
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
    public String getCourseType(String id) {
        for (Course c : onlineCourses) {
            if (c.getCourseId().equals(id)) {
                return "Online";
            }
        }
        for (Course c : offlineCourses) {
            if (c.getCourseId().equals(id)) {
                return "Offline";
            }
        }
        return "Not Found";
    }

    public boolean deleteCourse(String id) {
        String type = getCourseType(id);
        if (type.equals("Online")) {
            onlineCourses.removeIf(course -> course.getCourseId().equals(id));
            System.out.println("Deleted Online Course: " + id);
            return true;
        } else if (type.equals("Offline")) {
            offlineCourses.removeIf(course -> course.getCourseId().equals(id));
            System.out.println("Deleted Offline Course: " + id);
            return true;
        } else {
            System.err.println("Course not found!");
            return false;
        }
    }

    public boolean updateCourse(String id) {
        String type = getCourseType(id);
        if (type.equals("Online")) {
            for (OnlineCourse c : onlineCourses) {
                if (c.getCourseId().equals(id)) {
                    System.out.print("Enter new name: ");
                    c.setCourseName(scanner.nextLine());
                    System.out.print("Enter new credits: ");
                    c.setCredits(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Updated Online Course: " + id);
                    return true;
                }
            }
        } else if (type.equals("Offline")) {
            for (OfflineCourse c : offlineCourses) {
                if (c.getCourseId().equals(id)) {
                    System.out.print("Enter new name: ");
                    c.setCourseName(scanner.nextLine());
                    System.out.print("Enter new credits: ");
                    c.setCredits(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("Updated Offline Course: " + id);
                    return true;
                }
            }
        } else {
            System.err.println("Course not found!");
            return false;
        }
        return false;
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


}
