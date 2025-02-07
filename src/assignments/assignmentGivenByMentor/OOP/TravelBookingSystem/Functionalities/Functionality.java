package assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Functionalities;

import assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Modes.Bus;
import assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Modes.Flight;
import assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Modes.Train;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Utkarsh Khalkar
 * Title: This Code provide functionality to System
 * Time: 06:00 AM
 * Date: 06-02-2025
 */
public class Functionality {
    private final List<Bus> buses = new ArrayList<>();
    private final List<Flight> flights = new ArrayList<>();
    private final List<Train> trains = new ArrayList<>();

    public Functionality() {
        buses.add(new Bus("101", "Pune", "Nashik", "2025-02-05", "2025-02-04", 5));
        buses.add(new Bus("102", "Pune", "Mumbai", "2025-02-07", "2025-02-06", 5));

        flights.add(new Flight("B101", "Mumbai", "Chennai", "2025-02-03", "2025-02-04", 5));
        flights.add(new Flight("C0020", "Pune", "Banglore", "2025-02-04", "2025-02-05", 5));

        trains.add(new Train("T001", "Delhi", "Mumbai", "2025-02-03", "2025-02-04", 5));
    }

    // Book a Bus ticket
    public void bookBusTicket(String busNumber, String seat) {
        for (Bus bus : buses) {
            if (bus.getBusNumber().equalsIgnoreCase(busNumber)) {
                if (bus.bookSeat(seat)) {
                    System.out.println("Ticket Booked Successfully for Bus Number " + busNumber + " and Seat " + seat);
                    return;
                } else {
                    System.out.println("Seat " + seat + " is already booked or unavailable.");
                    return;
                }
            }
        }
        System.out.println("Bus with Number " + busNumber + " not found.");
    }

    // Book a Flight ticket
    public void bookFlightTicket(String flightNumber, String seat) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                if (flight.bookSeat(seat)) {
                    System.out.println("Ticket Booked Successfully for Flight Number " + flightNumber + " and Seat " + seat);
                    return;
                } else {
                    System.out.println("Seat " + seat + " is already booked or unavailable.");
                    return;
                }
            }
        }
        System.out.println("Flight with Number " + flightNumber + " not found.");
    }

    // Book a Train ticket
    public void bookTrainTicket(String trainNumber, String seat) {
        for (Train train : trains) {
            if (train.getTrainNumber().equalsIgnoreCase(trainNumber)) {
                if (train.bookSeat(seat)) {
                    System.out.println("Ticket Booked Successfully for Train Number " + trainNumber + " and Seat " + seat);
                    return;
                } else {
                    System.out.println("Seat " + seat + " is already booked or unavailable.");
                    return;
                }
            }
        }
        System.out.println("Train with Number " + trainNumber + " not found.");
    }

    // Display all booked and available seats for buses, flights, and trains
    public void displayAllSeats() {
        System.out.println("----- Available and Booked Seats -----");
        for (Bus bus : buses) {
            bus.displayBusInfo();
            System.out.println("-------------------------");
        }
        for (Flight flight : flights) {
            flight.displayFlightInfo();
            System.out.println("-------------------------");
        }
        for (Train train : trains) {
            train.displayTrainInfo();
            System.out.println("-------------------------");
        }
    }
}
