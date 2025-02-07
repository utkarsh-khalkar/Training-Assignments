package assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Modes;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Utkarsh Khalkar
 * Title: Bus Mode Details
 * Time: 03:00
 * Date: 05-02-2025
 */
public class Bus {
    private String busNumber;
    private String source;
    private String destination;
    private String arrivalTime;
    private String departureTime;
    private int seatCapacity;
    private List<String> bookedSeats = new ArrayList<>();

    public Bus(String busNumber, String source, String destination, String arrivalTime, String departureTime, int seatCapacity) {
        this.busNumber = busNumber;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.seatCapacity = seatCapacity;
    }

    public String getBusNumber() {
        return busNumber;
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

    public void displayBusInfo() {
        System.out.println("Bus Number: " + busNumber);
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
