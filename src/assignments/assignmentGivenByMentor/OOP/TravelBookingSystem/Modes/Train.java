package assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Modes;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Utkarsh Khalkar
 * Title: Train Mode Functionality
 * Time: 05:00 AM
 * Date: 06-02-2025
 */
public class Train {
    private final String trainNumber;
    private final String source;
    private final String destination;
    private final String arrivalTime;
    private final String departureTime;
    private final int seatCapacity;
    private final List<String> bookedSeats = new ArrayList<>();

    public Train(String trainNumber, String source, String destination, String arrivalTime, String departureTime, int seatCapacity) {
        this.trainNumber = trainNumber;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.seatCapacity = seatCapacity;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

//    public List<String> getBookedSeats() {
//        return bookedSeats;
//    }
//
//    public boolean hasAvailability() {
//        return bookedSeats.size() < seatCapacity;
//    }

    public boolean bookSeat(String seat) {
        if (bookedSeats.size() < seatCapacity) {
            bookedSeats.add(seat);
            return true;
        }
        return false;
    }

    public void displayTrainInfo() {
        System.out.println("Train Number: " + trainNumber);
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
