/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_Flight;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationManagement reservation = new ReservationManagement();

        while (true) {
            System.out.println("*** Reservation Management ***");
            System.out.println("1. Create new reservation");
            System.out.println("2. Update reservation");
            System.out.println("3. Delete reservation");
            System.out.println("4. Print Flight Information");
            System.out.println("5. Print all");
            System.out.println("6. Exit");
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1": reservation.createReservation(); break;
                case "2": reservation.updateReservation(); break;
                case "3": reservation.deleteReservation(); break;
                case "4": reservation.printFlightInfo(); break;
                case "5": reservation.printAllReservations(); break;
                case "6": 
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    scanner.close();
                    return;
                default: System.out.println("Invalid choice! Please select 1-6.");
            }
            System.out.println();
        }
    }
}