package assignments.assignmentGivenByMentor.OOP.TravelBookingSystem;


import assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Functionalities.Functionality;

import java.util.Scanner;

/**
 * Author: Utkarsh Khalkar
 * Title: Travel Booking System
 * Time: 03:14 PM
 * Date: 05:02:2025
 */

// creating Travel Booking Application
public class TravelBookingSystem {

    public static void main(String[] args) {
        Functionality functionality = new Functionality();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Perennial Travel Agency");
        System.out.println("Available Travel Modes at out Agency");
        System.out.println("1.Bus");
        System.out.println("2.Flight");
        System.out.println("3.Train");
        System.out.println("Select One Travel Mode...");
        int mode = scanner.nextInt();
        switch (mode) {
            case 1:
                System.out.println("You have selected Bus Mode ");
                System.out.println("---------------------------");
                System.out.println("Available Buses are as Below");
                functionality.displayBuses();
                System.out.println("-----------------------------");
                System.out.println("Enter the Bus Number for Bus Booking");
                String busNumber = scanner.next();
                System.out.println("Enter the Seat Number for Seat Booking");
                String seatNumber = scanner.next();
                functionality.bookBusTicket(busNumber,seatNumber);
                System.out.println("Total Booked Seats are:");
                functionality.displayBookedSeats();
                break;
            default:
                System.out.println("You Entered Wrong Option");
                break;
        }


    }



}
