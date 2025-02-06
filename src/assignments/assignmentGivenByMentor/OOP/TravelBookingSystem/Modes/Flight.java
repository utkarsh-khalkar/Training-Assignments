package assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Modes;
/**
 * Author: Utkarsh Khalkar
 * Title: Bus Mode Functionality
 * Time: 03:17 PM
 * Date: 05-02-2025
 */

// creating train class mode functionality
public class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private String arrivalTime;
    private String departureTime;

    // constructor for initialization
    public Flight(String flightNumber, String source, String destination, String arrivalTime, String departureTime) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    // display Flight info
    public void displayBusInfo()
    {
        System.out.println("BusNumber: " + flightNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Departure Time: " + departureTime);
    }
}
