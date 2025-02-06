package assignments.assignmentGivenByMentor.OOP.TravelBookingSystem.Functionalities;

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

