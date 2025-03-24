package week6.worker;

import java.util.ArrayList;

public class Main {
    public static void main (String[]args){
       
        WorkerManagement workerManagement = new WorkerManagement();
        
        ArrayList<Salary> salaryHistory1 = new ArrayList<>();
        salaryHistory1.add(new Salary(10000, "Begin", java.time.LocalDate.now().toString()));
        Worker worker1 = new Worker("1", "Nguyen B", 20, salaryHistory1, "FPT");
        
        workerManagement.addWorker(worker1);
        
        ArrayList<Salary> salaryHistory2 = new ArrayList<>();
        salaryHistory2.add(new Salary(20000, "Begin", java.time.LocalDate.now().toString()));
        Worker worker2 = new Worker("2", "Nguyen C", 20, salaryHistory2, "SOFT");
        
        workerManagement.addWorker(worker2);
        
        
        workerManagement.getInformationSalary();
    }
}
