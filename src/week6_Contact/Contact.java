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

    public int getId() { return id; }
    public String getPhone() { return phone; }

    @Override
    public String toString() {
        return String.format("%-5d %-20s %-15s %-15s %-10s %-15s %-15s",
            id, fullName, firstName, lastName, group, address, phone);
    }
}