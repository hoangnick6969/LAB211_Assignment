/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6_Contact;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author PC
 */
public class ContactManagement{
    private static Scanner scanner = new Scanner(System.in);
    private static ContactManager manager = new ContactManager();
    private static int nextId = 1;

    public static void main(String[] args){
        while (true) {
            System.out.println("========= Contact program =========");
            System.out.println("1. Add a Contact");
            System.out.println("2. Display all Contact");
            System.out.println("3. Delete a Contact");
            System.out.println("4. Exit");
            System.out.print("Please choice one option: ");
            
            String choice = scanner.nextLine().trim();
            switch (choice){
                case "1": addContact(); break;
                case "2": manager.displayAll(); break;
                case "3": deleteContact(); break;
                case "4": 
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default: System.out.println("Invalid choice! Please select 1-4.");
            }
            System.out.println();
        }
    }

    private static void addContact(){
        System.out.println("-------- Add a Contact --------");
        Contact ct1=new Contact();
        
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Group: ");
        String group = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

//        System.out.print("Enter Phone: ");
        String phone ;

//        while (!manager.isValidPhone(phone)){
//            phone = scanner.nextLine().trim();
//            System.out.println("Please input Phone flow");
//            System.out.println("• 1234567890");
//            System.out.println("• 123-456-7890");
//            System.out.println("• 123-456-7890 x1234");
//            System.out.println("• 123-456-7890 ext1234");
//            System.out.println("• 123.456.7890");
//            System.out.println("• 123 456 7890");
//            System.out.print("Enter Phone: ");
//            ct1.setPhone(phone);
//            
//        }
        do {

            System.out.println("Please input Phone flow");
            System.out.println("• 1234567890");
            System.out.println("• 123-456-7890");
            System.out.println("• 123-456-7890 x1234");
            System.out.println("• 123-456-7890 ext1234");
            System.out.println("• 123.456.7890");
            System.out.println("• 123 456 7890");
            System.out.print("Enter Phone: ");
           phone = scanner.nextLine().trim();
            ct1.setPhone(phone); 
        } while (!manager.isValidPhone(phone));

        Contact contact = new Contact(nextId++, fullName, group, address, phone);
        if (manager.addContact(contact)){
            System.out.println("Successful");
        } else {
            System.out.println("Failed to add contact");
        }
    }

    private static void deleteContact(){
        System.out.println("------- Delete a Contact -------");
        System.out.print("Enter ID: ");
        String input = scanner.nextLine().trim();

        try{
            int id = Integer.parseInt(input);
            if (manager.deleteContact(id)){
                System.out.println("Successful");
            } else {
                System.out.println("No found contact");
            }
        } catch (NumberFormatException e) {
            System.out.println("ID is digit");
        }
    }
}