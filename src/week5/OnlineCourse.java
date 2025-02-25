/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package week5;

import java.util.Scanner;

public class OnlineCourse extends Course {
    private String platform;
    private String instructor;
    private String note;

    public OnlineCourse() {
        super();
        this.platform = "";
        this.instructor = "";
        this.note = "";
    }

    public OnlineCourse(String courseId, String courseName, int credits, String platform, String instructor, String note) {
        super(courseId, courseName, credits);
        this.platform = platform;
        this.instructor = instructor;
        this.note = note;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPlatform() {
        return platform;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getNote() {
        return note;
    }

    @Override
    public void inputAll() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Course ID: ");
        setCourseId(scanner.nextLine());

        System.out.print("Enter Course Name: ");
        setCourseName(scanner.nextLine());

        System.out.print("Enter Credits: ");
        setCredits(scanner.nextInt());
        scanner.nextLine(); 

        System.out.print("Enter Platform: ");
        setPlatform(scanner.nextLine());

        System.out.print("Enter Instructor: ");
        setInstructor(scanner.nextLine());

        System.out.print("Enter Note: ");
        setNote(scanner.nextLine());
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Platform: " + platform + ", Instructor: " + instructor + ", Note: " + note;
    }
}


    

    
    

