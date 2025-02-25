/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author PC
 */
public abstract class Course {
    protected String courseId;
    protected String courseName;
    protected int credits;
    public Course(){
        this.courseId ="";
        this.courseName ="";
        this.credits = 0;
    }

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }
    public abstract void inputAll();
    public abstract void display();
    public String getCourseId(){
        return courseId;
    }
    public int getCredits(){
        return credits;
    }
    
}
