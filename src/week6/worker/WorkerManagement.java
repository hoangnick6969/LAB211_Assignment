/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.worker;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Collections;

/**
 *
 * @author PC
 */
public class WorkerManagement {
//    public List<Worker> workers=new ArrayList<>();
//    public List<Salary> salaryHistory=new ArrayList<>();
    public List<Worker> workerList=new ArrayList<> ();
    
     public void addWorker(Worker w){
    workerList.add(w);
    }
        public void getInformationSalary(){
        for(Worker w:workerList){
        String temp=w.toString();
        for(Salary s: w.getSalaryhistory){
        System.out.println(temp+ s.toString());
            }
        }   
    }
    public void changeUpSalary(String id,double money){
        for(Worker w: workerList){
            if(w.getId().equals(id)){
                w.addSalary(new Salary(money,"UP",java.time.LocalDate.now().toString()));
            }
        }
    }
//    
//    public boolean addWorker(Worker worker) throws Exception{
//        if(worker.getId()==null||worker.getId().trim().isEmpty()){
//            throw new Exception("Worker ID cannot be null");
//        }
//        for(Worker w :workers){
//            if(w.getId().equals(worker.getId())){
//                throw new Exception("Worker ID have already");
//            }
//        }
//        if(worker.getAge()<18||worker.getAge()>50){
//            throw new Exception("Age of worker must be in range 18 to 50");
//        }
//        if(!worker.getSalaryhistory().isEmpty()&& worker.getSalaryhistory().get(0).getSalary()<=0){
//            throw new Exception("Salary must bew greater than 0");
//        }
//        return workers.add(worker);
//    }
//    public boolean changeUpSalary(String code,double amount)throws Exception{
//        if(amount<=0){
//        throw new Exception("Amount must be greater than 0");
//    }
//        for(Worker worker: workers){
//            if(worker.getId().equals(code)){
//                double currentSalary=worker.getSalaryhistory().isEmpty()?0:worker.getSalaryhistory().get(worker.getSalaryhistory().size()-1).getSalary();
//                double newSalary=currentSalary+amount;
//                
//                Salary newSalaryRecord=new Salary(newSalary, "UP","03/03/2025");
//                        worker.addSalary(newSalaryRecord);
//                        
//                        salaryHistory.add(newSalaryRecord);
//                        return true;
//            }
//        }
//        throw new Exception("worker id not found");
// 
//    }
//    public boolean changeDownSalary(String code,double amount)throws Exception{
//         if(amount<=0){
//        throw new Exception("Amount must be greater than 0");
//    }
//         for(Worker worker: workers){
//            if(worker.getId().equals(code)){
//                double currentSalary=worker.getSalaryhistory().isEmpty()?0:worker.getSalaryhistory().get(worker.getSalaryhistory().size()-1).getSalary();
//                double newSalary=currentSalary-amount;
//                
//                Salary newSalaryRecord=new Salary(newSalary, "UP","03/03/2025");
//                        worker.addSalary(newSalaryRecord);
//                        
//                        salaryHistory.add(newSalaryRecord);
//                        return true;
//            }
//        }
//        throw new Exception("worker id not found");
//        
//    }
//    
//    public List<Salary> getInformationSalary(){
//        Collections.sort(salaryHistory,new Comparator<Salary>(){
//        @Override
//        public int compare(Salary s1,Salary s2){
//            return s1.getDate().compareTo(s2.getDate());
//        }
//    });
//      return salaryHistory;  
//        
//        
//    }
//}
   
}