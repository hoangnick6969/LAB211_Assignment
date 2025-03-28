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
public class Worker {
    private String id;
    private String name;
    private int age;
    private List<Salary> salaryhistory;
    private String workLocation;

public Worker(String id, String name, int age, ArrayList<Salary> salaryHistory1, String workLocation) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.workLocation = workLocation;
    this.salaryhistory = new ArrayList<>(); // Initialize salary history
    if (salaryHistory1 != null) {
        this.salaryhistory.addAll(salaryHistory1); // Add existing salary history if passed
    }
}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Salary> getSalaryhistory() {
        return salaryhistory;
    }

    public void setSalaryhistory(List<Salary> salaryhistory) {
        this.salaryhistory = salaryhistory;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", name=" + name + ", age=" + age + ", salaryhistory=" + salaryhistory + ", workLocation=" + workLocation + '}';
    }

   

    public void addSalary(Salary s){
        salaryhistory.add(s);
    }
    
}
