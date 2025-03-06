/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Contact;

/**
 *
 * @author PC
 */


public class Contact {
    private int id;
    private String fullName;
    private String firstName;
    private String lastName;
    private String group;
    private String address;
    private String phone;

    public Contact(int id, String fullName, String group, String address, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone != null ? phone : "";  
        extractNames();
    }
    public Contact(){
        
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    

    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    public int getId(){ 
        return id; 
    }
    public String getPhone() {
        return phone; 
    }
private void extractNames() {
        if (fullName != null && !fullName.trim().isEmpty()) {
            String[] names = fullName.trim().split("\\s+", 2);
            this.firstName = names[0];
            this.lastName = names.length > 1 ? names[1] : "";
        } else {
            this.firstName = "";
            this.lastName = "";
        }
    }
    @Override
    public String toString() {
        return String.format("%-5d %-20s %-15s %-15s %-10s %-15s %-15s",
            id, fullName, firstName, lastName, group, address, phone);
    }
}