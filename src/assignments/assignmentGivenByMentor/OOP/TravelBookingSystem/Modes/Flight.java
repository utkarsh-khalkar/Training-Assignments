package assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Modes;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Utkarsh Khalkar
 * Title: Flight Mode Functionality
 * Time: 03:30 PM
 * Date: 05-02-2025
 */
public class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private String arrivalTime;
    private String departureTime;
    private int seatCapacity;
    private List<String> bookedSeats = new ArrayList<>();

    public Flight(String flightNumber, String source, String destination, String arrivalTime, String departureTime, int seatCapacity) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.seatCapacity = seatCapacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public List<String> getBookedSeats() {
        return bookedSeats;
    }

    public boolean hasAvailability() {
        return bookedSeats.size() < seatCapacity;
    }

    public boolean bookSeat(String seat) {
        if (bookedSeats.size() < seatCapacity) {
            bookedSeats.add(seat);
            return true;
        }
        return false;
    }

    public void displayFlightInfo() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Booked Seats: " + bookedSeats);
        displayAvailableSeats();
    }

    // Display available seats
    public void displayAvailableSeats() {
        List<String> allSeats = new ArrayList<>();
        for (int i = 1; i <= seatCapacity; i++) {
            allSeats.add(String.valueOf(i));
        }

        allSeats.removeAll(bookedSeats);

        System.out.println("Available Seats: " + allSeats);
    }
}
