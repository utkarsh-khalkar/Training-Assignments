package assignments.hackerEarth.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Seat {
    private int seatNumber;
    private boolean isBooked;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookSeat() {
        isBooked = true;
    }

    public void cancelSeat() {
        isBooked = false;
    }

    @Override
    public String toString() {
        return "Seat " + seatNumber + (isBooked ? " (Booked)" : " (Available)");
    }
}

class TravelMode {
    private String number;
    private String source;
    private String destination;
    private String arrivalTime;
    private String departureTime;
    private List<Seat> seats;

    public TravelMode(String number, String source, String destination, String arrivalTime, String departureTime) {
        this.number = number;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.seats = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            seats.add(new Seat(i));
        }
    }

    public String getNumber() {
        return number;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public boolean bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > 5) {
            System.out.println("Invalid seat number.");
            return false;
        }
        Seat seat = seats.get(seatNumber - 1);
        if (seat.isBooked()) {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return false;
        } else {
            seat.bookSeat();
            System.out.println("Seat " + seatNumber + " booked successfully.");
            return true;
        }
    }

    public void cancelSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > 5) {
            System.out.println("Invalid seat number.");
            return;
        }
        Seat seat = seats.get(seatNumber - 1);
        if (!seat.isBooked()) {
            System.out.println("Seat " + seatNumber + " is not booked.");
        } else {
            seat.cancelSeat();
            System.out.println("Seat " + seatNumber + " canceled successfully.");
        }
    }

    public void displaySeats() {
        System.out.println("Seats for " + number + " (" + source + " to " + destination + "):");
        for (Seat seat : seats) {
            System.out.println(seat);
        }
    }
}

class BookingSystem {
    private List<TravelMode> travelModes = new ArrayList<>();

    public BookingSystem() {
        // Initialize with some travel modes
        travelModes.add(new TravelMode("B001", "Port Blair", "Chennai", "10:00 AM", "8:00 AM"));
        travelModes.add(new TravelMode("T001", "Port Blair", "Kolkata", "2:00 PM", "12:00 PM"));
        travelModes.add(new TravelMode("F001", "Port Blair", "Delhi", "6:00 PM", "4:00 PM"));
    }

    public void displayTravelModes() {
        System.out.println("Available Travel Modes:");
        for (int i = 0; i < travelModes.size(); i++) {
            TravelMode travel = travelModes.get(i);
            System.out.println((i + 1) + ". " + travel.getNumber() + " (" + travel.getSource() + " to " + travel.getDestination() + ")");
        }
    }

    public void bookTravel(int choice) {
        if (choice < 1 || choice > travelModes.size()) {
            System.out.println("Invalid choice.");
            return;
        }
        TravelMode selectedTravel = travelModes.get(choice - 1);
        selectedTravel.displaySeats();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the seat number to book: ");
        int seatNumber = scanner.nextInt();
        selectedTravel.bookSeat(seatNumber);
    }

    public void checkStatus() {
        for (TravelMode travel : travelModes) {
            travel.displaySeats();
        }
    }

    public void cancelBooking(int choice) {
        if (choice < 1 || choice > travelModes.size()) {
            System.out.println("Invalid choice.");
            return;
        }
        TravelMode selectedTravel = travelModes.get(choice - 1);
        selectedTravel.displaySeats();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the seat number to cancel: ");
        int seatNumber = scanner.nextInt();
        selectedTravel.cancelSeat(seatNumber);
    }
}

public class TravelBookingSystemNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem();

        while (true) {
            System.out.println("\nTravel Booking System");
            System.out.println("1. Book Travel");
            System.out.println("2. Check Status");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookingSystem.displayTravelModes();
                    System.out.print("Enter the number of the travel mode to book: ");
                    int travelChoice = scanner.nextInt();
                    bookingSystem.bookTravel(travelChoice);
                    break;
                case 2:
                    bookingSystem.checkStatus();
                    break;
                case 3:
                    bookingSystem.displayTravelModes();
                    System.out.print("Enter the number of the travel mode to cancel booking: ");
                    int cancelChoice = scanner.nextInt();
                    bookingSystem.cancelBooking(cancelChoice);
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
