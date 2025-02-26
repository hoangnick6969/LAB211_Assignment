/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_Flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ReservationManagement {
    private static List<Reservation> reservations = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mma");


    public void createReservation() {
        System.out.println("*** Create new reservation ***");
        
        String id = validateID();
        if (id == null) return;

        String name = validateName();
        if (name == null) return;

        String phone = validatePhone();
        if (phone == null) return;

        String roomNumbers = validateRoomNumber();
        if (roomNumbers == null) return;

        String bookingDate = validateBookingDate();
        if (bookingDate == null) return;

        System.out.print("Need airport pick up? (Y/N): ");
        String needPickup = scanner.nextLine().trim();
        while (!needPickup.equalsIgnoreCase("Y") && !needPickup.equalsIgnoreCase("N")) {
            System.out.println("Data input is invalid");
            System.out.print("Need airport pick up? (Y/N): ");
            needPickup = scanner.nextLine().trim();
        }

        FlightInformation flightInfo = new FlightInformation();
        if (needPickup.equalsIgnoreCase("Y")) {
            System.out.print("Flight: ");
            String flight = scanner.nextLine().trim();
            System.out.print("Seat: ");
            String seat = scanner.nextLine().trim();
            
            String timePickup = validateTimePickup(bookingDate);
            if (timePickup == null) return;

            flightInfo = new FlightInformation(flight, seat, timePickup);
        }

        reservations.add(new Reservation(id, name, phone, roomNumbers, bookingDate, flightInfo));
        System.out.println("Information saved successfully.");
    }

    private static boolean checkExist(String id) {
        for (Reservation r : reservations) {
            if (r.getBookingID().equals(id)) {
                return true; 
            }
        }
        return false; 
    }

    private static String validateID() {
        System.out.print("ID: ");
        String id = scanner.nextLine().trim();
        
        while (id == null || !id.matches("\\d{6}") || checkExist(id)) {
            System.out.println("Data input is invalid");
            System.out.print("ID: ");
            id = scanner.nextLine().trim();
        }
        return id;
    }

    public String validateName() {
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        while (name == null || !name.matches("[a-zA-Z ]+")) {
            System.out.println("Data input is invalid");
            System.out.print("Name: ");
            name = scanner.nextLine().trim();
        }
        return name;
    }

  public String validatePhone() {
        System.out.print("Phone: ");
        String phone = scanner.nextLine().trim();
        while (phone == null || !phone.matches("\\d{12}")) {
            System.out.println("Data input is invalid");
            System.out.print("Phone: ");
            phone = scanner.nextLine().trim();
        }
        return phone;
    }

    private static String validateRoomNumber() {
        System.out.print("RoomNumbers: ");
        String room = scanner.nextLine().trim();
        while (room == null || !room.matches("\\d{1,4}")) {
            System.out.println("Data input is invalid");
            System.out.print("RoomNumbers: ");
            room = scanner.nextLine().trim();
        }
        return room;
    }

    private static String validateBookingDate() {
        System.out.print("BookingDate: ");
        String date = scanner.nextLine().trim();
        try {
            Date bookingDate = dateFormat.parse(date);
            if (bookingDate.before(new Date())) {
                System.out.println("Data input is invalid");
                return null;
            }
            return date;
        } catch (ParseException e) {
            System.out.println("Data input is invalid");
            return null;
        }
    }

    private static String validateTimePickup(String bookingDate) {
        System.out.print("TimePickUp: ");
        String time = scanner.nextLine().trim();
        try {
            Date pickupTime = dateFormat.parse(time);
            Date booking = dateFormat.parse(bookingDate);
            Date now = new Date();
            if (pickupTime.before(now) || pickupTime.after(booking)) {
                System.out.println("Data input is invalid");
                return null;
            }
            return time;
        } catch (ParseException e) {
            System.out.println("Data input is invalid");
            return null;
        }
    }

   public void updateReservation() {
        System.out.println("*** Update reservation ***");
        Reservation reservation = findReservation();
        if (reservation == null) return;

        System.out.println("ID - Name - Phone - RoomNumbers - BookingDate - Flight - Seat - TimePickUp");
        System.out.println(reservation);
        System.out.println("If you do not want to change the information, just press enter to skip.");

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        if (!name.isEmpty()) {
            if (name.matches("[a-zA-Z ]+")) {
                reservation.setCustomerName(name);
            } else {
                System.out.println("Invalid name");
                return;
            }
        }

        System.out.print("Phone: ");
        String phone = scanner.nextLine().trim();
        if (!phone.isEmpty()) {
            if (phone.matches("\\d{12}")) {
                reservation.setPhoneNumber(phone);
            } else {
                System.out.println("Invalid phone");
                return;
            }
        }

        System.out.print("RoomNumbers: ");
        String room = scanner.nextLine().trim();
        if (!room.isEmpty()) {
            if (room.matches("\\d{1,4}")) {
                reservation.setRoomNumber(room);
            } else {
                System.out.println("Invalid room number");
                return;
            }
        }

        System.out.print("BookingDate: ");
        String date = scanner.nextLine().trim();
        if (!date.isEmpty()) {
            try {
                if (dateFormat.parse(date).before(new Date())) {
                    System.out.println("Invalid date");
                    return;
                }
                reservation.setBookingDate(date);
            } catch (ParseException e) {
                System.out.println("Invalid date format");
                return;
            }
        }

        System.out.println("ID - Name - Phone - RoomNumbers - BookingDate - Flight - Seat - TimePickUp");
        System.out.println(reservation);
        System.out.println("Information saved successfully.");
    }

    public static Reservation findReservation() {
        while (true) {
            System.out.print("ID: ");
            String id = scanner.nextLine().trim();
            Optional<Reservation> reservation = reservations.stream()
                .filter(r -> r.getBookingID().equals(id))
                .findFirst();
            
            if (reservation.isPresent()) return reservation.get();
            
            System.out.println("No information found");
            System.out.print("You want to find again? (Y/N): ");
            if (scanner.nextLine().trim().equalsIgnoreCase("N")) return null;
        }
    }

    public static void deleteReservation() {
        System.out.println("*** Delete reservation ***");
        Reservation reservation = findReservation();
        if (reservation == null) return;

        System.out.println("ID - Name - Phone - RoomNumbers - BookingDate - Flight - Seat - TimePickUp");
        System.out.println(reservation);
        System.out.print("Are you sure you want to delete this information? (Y/N): ");
        
        if (scanner.nextLine().trim().equalsIgnoreCase("Y")) {
            reservations.remove(reservation);
            System.out.println("Information deleted successfully.");
        }
    }

    public static void printFlightInfo() {
        System.out.println("*** Flight Information ***");
        System.out.println("ID - Name - Phone - Flight - Seat - TimePickUp");
        reservations.stream()
            .filter(r -> !r.getFlightInformation().getFlightNumber().isEmpty())
            .sorted(Comparator.comparing(r -> r.getFlightInformation().getTimePickUp()))
            .forEach(r -> System.out.printf("%s - %s - %s - %s - %s - %s%n",
                r.getBookingID(), r.getCustomerName(), r.getPhoneNumber(),
                r.getFlightInformation().getFlightNumber(),
                r.getFlightInformation().getSeatNumber(),
                r.getFlightInformation().getTimePickUp()));
    }

    public static void printAllReservations() {
        System.out.println("*** Reservation Information ***");
        if (reservations.isEmpty()) {
            System.out.println("No information to view");
            return;
        }
        System.out.println("ID - Name - Phone - RoomNumbers - BookingDate - Flight - Seat - TimePickUp");
        reservations.forEach(System.out::println);
    }
}