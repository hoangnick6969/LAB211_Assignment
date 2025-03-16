/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.worker;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class Main {
    public static void main (String[]args){
        WorkerManagement workerManagement= new WorkerManagement();
//    try{
//        Worker w1=new Worker("1", "Nguyen B", 20, new ArrayList<>(), "FPT");
//        w1.addSalary(new Salary(1000,"INTIAL","01/03/2025"));
//        wk.addWorker(w1);
//        wk.changeDownSalary("1", 500);
//        wk.changeUpSalary("1", 200);
//        for(Salary s : wk.getInformationSalary()){
//            System.out.println(s);
//        }
//        
//    }catch (Exception e){
//        System.out.println("Error:"+e.getMessage());
//    }    
        ArrayList<Salary> salaryHistory1=new ArrayList<>();
        salaryHistory1.add(new Salary(10000,"Begin",java.time.LocalDate.now().toString()));
        Worker worker1=new Worker("1","nguyen B",20,salaryHistory1,"FPT" );
        workerManagement.addWorker(worker1);
        
         ArrayList<Salary> salaryHistory2=new ArrayList<>();
        salaryHistory2.add(new Salary(20000,"Begin",java.time.LocalDate.now().toString()));
        Worker worker2=new Worker("2","nguyen c",20,salaryHistory2,"SOFT" );
        workerManagement.addWorker(worker2);
    }
    
}
