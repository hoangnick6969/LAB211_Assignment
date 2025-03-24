/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlysinhvien;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[]args){
        QuanLy ql=new QuanLy();
        ql.addStudent(1,"Nguyen A","Computer Science");
        ql.addStudent(2, "Tran b", "Mathematics");
        ql.addStudent(3, "Le C", "Physics");
        
        
        System.out.println("Tat ca sinh vien");
        ql.displayStudents();
        
        System.out.println("Tim sv theo ID:");
        ql.searchStudent(1);
        System.out.println("Xoa sv theo ID");
        ql.deleteStudent(1);
         System.out.println("Tat ca sv sau khi xoa");
        ql.displayStudents();
    }
}
