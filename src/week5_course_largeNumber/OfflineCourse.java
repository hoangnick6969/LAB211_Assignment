/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_course_largeNumber;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class OfflineCourse extends Course {
    private String begin;
    private String end;
    private String campus;

    public OfflineCourse() {
        super();
        this.begin = "";
        this.end = "";
        this.campus = "";
    }

    public OfflineCourse(String courseId, String courseName, int credits, String begin, String end, String campus) {
        super(courseId, courseName, credits);
        this.begin = begin;
        this.end = end;
        this.campus = campus;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getBegin() {
        return begin;
    }

    public String getEnd() {
        return end;
    }

    public String getCampus() {
        return campus;
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

        System.out.print("Enter Begin Date: ");
        setBegin(scanner.nextLine());

        System.out.print("Enter End Date: ");
        setEnd(scanner.nextLine());

        System.out.print("Enter Campus: ");
        setCampus(scanner.nextLine());
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Begin: " + begin + ", End: " + end + ", Campus: " + campus;
    }
}