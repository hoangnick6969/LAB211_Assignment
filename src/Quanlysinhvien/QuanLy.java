/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlysinhvien;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class QuanLy {
    List<Student> st=new ArrayList();
    
    
    public void addStudent(int id, String name, String course){
      Student student =new Student(id, name, course);
        st.add(student);
        System.out.println("Student added"+student);
    }
    public void deleteStudent(int id){
        Student studentremove=null;
        for(Student student:st){
            if(student.getID()==id){
                studentremove=student;
                break;
    }
    }
    if(studentremove!=null){
        st.remove(studentremove);
        System.out.println("Student removed"+studentremove);
          
    }else{
        System.out.println("Student with id"+id+"khong tim thay");
    }
    }
    public Student searchStudent(int id){
        for(Student student :st){
            if(student.getID()==id){
                System.out.println("Tim"+student);
                return student;
            }
        }
        System.out.println("Student with ID"+id+"bot found");
        return null;
    }
    public void displayStudents(){
        if(st.isEmpty()) System.out.println("Khong co ");
        else{
            for(Student student:st){
                System.out.println(student);
            }
        }
    }
}
