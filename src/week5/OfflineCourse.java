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
public class OfflineCourse extends Course {
    private String begin;
    private String end;
    private String campus;
    
    public OfflineCourse(){
        super();
        this.begin="";
        this.end="";
        this.campus="";
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
        System.out.println("Enter Begin Date: ");
        this.begin=scanner.nextLine();
        System.out.println("Enter End Data: ");
        this.end=scanner.nextLine();
        System.out.println("Enter Campus: ");
        this.campus=scanner.nextLine();
        
        
        if(this.courseId.isEmpty()||this.courseName.isEmpty()||this.campus.isEmpty()||this.begin.compareTo(this.end)>=0){
            System.out.println("Data input is invalid!");
            return;
        }
    }

    @Override
    public void display() {
        System.out.println("Offline Course - ID: "+courseId+", Name: "+courseName+", Credits: "+credits+", Begin: "+begin+", End: "+end+", Campus:"+campus);
    }
    
}
