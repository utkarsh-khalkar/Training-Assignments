package assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Functionalities;

import assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Modes.Bus;
import assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Modes.Flight;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Utkarsh Khalkar
 * Title: Functionality Provider class
 * Time: 04:01 PM
 * Date: 05-02-2025
 */
public class Functionality {
    private  List<Bus> buses=new ArrayList<Bus>();
    private List<Flight> flights=new ArrayList<Flight>();
    boolean bookingStatus=false;

    // constructor for initializing data
    public Functionality() {
        buses.add(new Bus("101","Pune"," Nashik"," 2025-02-05","2025-02-04"));
        buses.add(new Bus("102","Pune ","Mumbai"," 2025-02-07","2025-02-06"));

        flights.add(new Flight("B101","Mumbai","Chennai","2025-02-03","2025-02-04"));
        flights.add(new Flight("C0020","Pune","Banglore","2025-02-04","2025-02-05"));
    }

    // book bus ticket
    public void bookBusTicket(String busNumber, String seat) {
        for (Bus bus : buses) {
            if (bus.getBusNumber().equalsIgnoreCase(busNumber)) {
                if (bus.hasAvailability()) {
                    if (bus.bookSeat(seat)) {
                        System.out.println("Ticket Booked Successfully for Bus Number " + busNumber + " and Seat " + seat);
                        bookingStatus = true;
                    } else {
                        System.out.println("Seat " + seat + " is already booked.");
                    }
                } else {
                    System.out.println("No seats available on Bus " + busNumber);
                }
                return;
            }
        }
        System.out.println("Bus with Number " + busNumber + " not found");
    }

    // display all available buses
    public void displayBuses() {
        for(Bus bus : buses)
        {
            bus.displayBusInfo();
            System.out.println("-------------------------------");
        }
    }

    // checking booking status
    public void checkBusTicketBookingStatus() {
        if(bookingStatus)
        {
            System.out.println("Ticket Booked Successfully for Bus Number "+buses.get(0).getBusNumber());
        }else{
            System.out.println("Booking Not Complete");
        }
    }
    // method to display all booked seats for all buses
    public void displayBookedSeats() {
        for (Bus bus : buses) {
            System.out.println("Bus Number " + bus.getBusNumber() + " has the following booked seats:");
            for (String seat : bus.getBookedSeats()) {
                System.out.println("Booked Seat: " + seat);
            }

        }
    }

    // display all available flights
    public void displayFlights() {
        for(Flight flight : flights)
        {
            flight.displayBusInfo();
        }
    }


}
