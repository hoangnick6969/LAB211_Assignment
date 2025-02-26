/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_course_largeNumber;

/**
 *
 * @author PC
 */


public abstract class Course {
    protected String courseId;
    protected String courseName;
    protected int credits;

    public Course() {
        this.courseId = "";
        this.courseName = "";
        this.credits = 0;
    }

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.setCredits(credits); 
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(int credits) {
        if (credits > 0) {
            this.credits = credits;
        } else {
            System.err.println("Credits must be greater than 0!");
        }
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public abstract void inputAll();
    public abstract void display();

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Name: " + courseName + ", Credits: " + credits;
    }
}

