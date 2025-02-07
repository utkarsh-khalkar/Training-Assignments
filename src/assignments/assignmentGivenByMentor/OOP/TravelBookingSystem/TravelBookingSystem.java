package assignments.assignmentGivenByMentor.OOP.TravelBookingSystem;

import assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Functionalities.Functionality;

import java.util.Scanner;

public class TravelBookingSystem {

    public static void main(String[] args) {
        Functionality functionality = new Functionality();
        Scanner scanner = new Scanner(System.in);

        int mode;
        do {
            System.out.println("Welcome to Perennial Travel Agency");
            System.out.println("Available Travel Modes at our Agency");
            System.out.println("1. Bus");
            System.out.println("2. Flight");
            System.out.println("3. Train");
            System.out.println("4. View All Seats (Booked & Available)");
            System.out.println("5. Exit");
            System.out.println("Select One Travel Mode...");

            mode = scanner.nextInt();

            switch (mode) {
                case 1:
                    // Bus booking functionality
                    System.out.println("You have selected Bus Mode ");
                    System.out.println("---------------------------");
                    System.out.println("Available Buses are as Below");
                    functionality.displayAllSeats();
                    System.out.println("Enter the Bus Number for Bus Booking:");
                    String busNumber = scanner.next();
                    System.out.println("Enter the Seat Number for Seat Booking:");
                    String busSeatNumber = scanner.next();
                    functionality.bookBusTicket(busNumber, busSeatNumber);
                    break;

                case 2:
                    // Flight booking functionality
                    System.out.println("You have selected Flight Mode ");
                    System.out.println("------------------------------");
                    System.out.println("Available Flights are as Below");
                    functionality.displayAllSeats();
                    System.out.println("Enter the Flight Number for Booking:");
                    String flightNumber = scanner.next();
                    System.out.println("Enter the Seat Number for Seat Booking:");
                    String flightSeatNumber = scanner.next();
                    functionality.bookFlightTicket(flightNumber, flightSeatNumber);
                    break;

                case 3:
                    // Train booking functionality
                    System.out.println("You have selected Train Mode ");
                    System.out.println("-----------------------------");
                    System.out.println("Available Trains are as Below");
                    functionality.displayAllSeats();
                    System.out.println("Enter the Train Number for Train Booking:");
                    String trainNumber = scanner.next();
                    System.out.println("Enter the Seat Number for Seat Booking:");
                    String trainSeatNumber = scanner.next();
                    functionality.bookTrainTicket(trainNumber, trainSeatNumber);
                    break;

                case 4:
                    // View all seats (booked & available) for all modes
                    functionality.displayAllSeats();
                    break;

                case 5:
                    // Exit the system
                    System.out.println("Thank you for using Perennial Travel Agency. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (mode != 5); // Repeat the menu until the user selects the exit option
    }
}
