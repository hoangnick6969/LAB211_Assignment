/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Contact;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author PC
 */


public class ContactManager {
    private static List<Contact> contacts = new ArrayList<>();
    private static final String PHONE_PATTERN = 
        "^(\\d{10}|\\d{3}-\\d{3}-\\d{4}((\\s?(x|ext)\\d+)?)|\\d{3}\\.\\d{3}\\.\\d{4}|\\d{3}\\s\\d{3}\\s\\d{4})$";

    public boolean addContact(Contact contact) {
        if (contact == null || !isValidPhone(contact.getPhone())) {
            return false;
        }
        return contacts.add(contact);
    }

    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available");
            return;
        }
        System.out.println("----Display all Contact ----");
        System.out.println(String.format("%-5s %-20s %-15s %-15s %-10s %-15s %-15s",
            "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone"));
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public boolean deleteContact(int id) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == id) {
                contacts.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean isValidPhone(String phone) {
        if (phone == null) {
            return false;
        }
        return Pattern.matches(PHONE_PATTERN, phone);
    }
}