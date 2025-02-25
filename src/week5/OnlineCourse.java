/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class OnlineCourse extends Course {
    private String platform;
    private String instructors;
    private String note;
    public OnlineCourse(){
        super();
        this.platform="";
        this.instructors ="";
        this.note="";
    }
    public void inputAll(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Course ID: ");
        this.courseId=scanner.nextLine();
        System.out.println("Enter Course Name: ");
        this.courseName=scanner.nextLine();
        System.out.println("Enter Credits: ");
        this.credits=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Platform: ");
        this.platform=scanner.nextLine();
        System.out.println("Enter Instructors: ");
        this.instructors=scanner.nextLine();
        System.out.println("Enter Note: ");
        this.note=scanner.nextLine();
        if(this.courseId.isEmpty() || this.courseName.isEmpty()|| this.platform.isEmpty()){
            System.out.println("Data input is invalid!");
            return;
        }
        
    }
    public void display(){
        System.out.println("Online Course - ID: "+courseId+", Name: "+courseName+
                ", Credits: "+credits+", Platform: "+platform+", Instructors: "+instructors+", Note: "+note);
    }
}
