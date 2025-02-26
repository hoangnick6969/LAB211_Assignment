/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5_Flight;

import java.time.LocalDate;

/**
 *
 * @author PC
 */
public class Reservation {
    private String bookingID;
    private String customerName;
    private String roomNumber;
    private String bookingDate;
    private String phoneNumber;
    private FlightInformation flightInformation;

    public Reservation(String bookingID, String customerName, String roomNumber, String bookingDate, String phoneNumber, FlightInformation flightInformation) {
        this.bookingID = bookingID;
        this.customerName = customerName;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
        this.phoneNumber = phoneNumber;
        this.flightInformation = flightInformation;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    public void setFlightInformation(FlightInformation flightInformation) {
        this.flightInformation = flightInformation;
    }

    @Override
    public String toString() {
        return "Reservation{" + "bookingID=" + bookingID + ", customerName=" + customerName + ", roomNumber=" + roomNumber + ", bookingDate=" + bookingDate + ", phoneNumber=" + phoneNumber + ", flightInformation=" + flightInformation + '}';
    }

}