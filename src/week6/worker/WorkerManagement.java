/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.worker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class WorkerManagement {
    public List<Worker> workers=new ArrayList<>();
    
    
    
    public boolean addWorker(Worker worker) throws Exception{
        if(worker.getId()==null||worker.getId().trim().isEmpty()){
            throw new Exception("Worker ID cannot be null");
        }
        for(Worker w :workers){
            if(w.getId().equals(worker.getId())){
                throw new Exception("Worker ID have already");
            }
        }
        if(worker.getAge()<18||worker.getAge()>50){
            throw new Exception("Age of worker must be in range 18 to 50");
        }
        if(worker.getSalary()>0){
            throw new Exception("Salary must bew greater than 0");
        }
        return workers.add(worker);
    }
    public boolean changeUpSalary(String code,double m)throws Exception{
        
        
        
    //    
    }
    public void changeDownSalary(String code,double m){
        
    }
    
    public void getInformationSalary(){
        
        
        
    }
}
