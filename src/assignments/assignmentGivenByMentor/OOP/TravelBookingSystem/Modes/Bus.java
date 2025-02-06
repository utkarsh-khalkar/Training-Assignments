package assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Modes;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Utkarsh Khalkar
 * Title: Bus Mode Functionality
 * Time: 03:17 PM
 * Date: 05-02-2025
 */

// creating bus class mode functionality
public class Bus {
    private String busNumber;
    private String source;
    private String destination;
    private String arrivalTime;
    private String departureTime;
    private int seatCapacity;
    private List<String> bookedSeats=new ArrayList<>();

    public Bus(String busNumber, String source, String destination, String arrivalTime, String departureTime) {
        this.busNumber = busNumber;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.seatCapacity=5;
    }

    // method to getBooked Seat
    public List<String> getBookedSeats() {
        return bookedSeats;
    }




    // getter for getting bus number
    public String getBusNumber() {
        return busNumber;
    }

    // setter for setting bus number
    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    // getter for getting source
    public String getSource() {
        return source;
    }

    // setter for setting source
    public void setSource(String source) {
        this.source = source;
    }
    // getter for getting destination
    public String getDestination() {
        return destination;
    }

    // setter for setting destination
    public void setDestination(String destination) {
        this.destination = destination;
    }

    // getter for getting arrival time
    public String getArrivalTime() {
        return arrivalTime;
    }

    // setter for setting arrival time
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    // getter for getting departure time
    public String getDepartureTime() {
        return departureTime;
    }

    // setter for setting departure time
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    // method to check availability of booking
    public boolean hasAvailability()
    {
        return bookedSeats.size()<=seatCapacity;
    }

    // method to book seat
    public boolean bookSeat(String seat)
    {
        if(bookedSeats.size()<seatCapacity)
        {
            bookedSeats.add(seat);
            return true;
        }
        return false;
    }
    // display bus info
    public void displayBusInfo()
    {
        System.out.println("BusNumber: " + busNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Booked Seats: " + bookedSeats);
    }
}
