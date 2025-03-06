/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6.worker;

/**
 *
 * @author PC
 */
public class Salary {
    private double salary;
    private String status;
    private String date;

    public Salary(double salary, String status, String date) {
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Salary{" + "salary=" + salary + ", status=" + status + ", date=" + date + '}';
    }
    
}
