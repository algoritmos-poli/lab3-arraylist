
import model.Seat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeatBooking {
    // List to store bookings
    private List<Seat> bookedSeatsList;
    // Constructor
    public SeatBooking() {
        // Initialize the list of booked seats
        // TODO 1 : this.bookedSeatsList = ?
        this.bookedSeatsList = new ArrayList<Seat>();
    }
    // Method to add a new seat booking
    public void addNewBooking(String seatNumber) {
        // TODO 2: check if the seat is already booked and not canceled
        for(int i = 0;i<this.bookedSeatsList.size();i++) {
            if (this.bookedSeatsList.get(i).getSeatNumber() == seatNumber) {
                if(this.bookedSeatsList.get(i).isBooked() && !this.bookedSeatsList.get(i).isCanceled()){
                    return;
                }
            }
        }
        // TODO 3 create a new Seat object for the booking,
        // mark the seat as booked,
        // set the current date as the booking date
        Seat newSeat = new Seat(seatNumber);
        newSeat.setBooked(true);
        newSeat.setBookingDate(new Date());
        // TODO 4: add the new seat to the bookedSeatsList
        this.bookedSeatsList.add(newSeat);
        // TODO 5: confirm the booking to the user
        System.out.println(newSeat);
     }

    // Method to cancel a booking
    public void cancelBooking(String seatNumber) {
        // TODO 6: iterate through the list of booked seats
        Seat seatSelect = null;
        for(Seat seat: this.bookedSeatsList) {
            if (seat.getSeatNumber() == seatNumber) {
                seatSelect = seat;
                break;
        }
        // TODO 7: check if the seat number matches and is not already canceled
        // mark the seat as canceled
        // mark the seat as not booked
        // confirm the cancellation to the user
        if(!seatSelect.isCanceled()) {
            seatSelect.setCanceled(true);
            seatSelect.setBooked(false);
            System.out.println(seatSelect);
        }

        }
        // TODO 8: inform the user if no booking was found for the seat number
        if(seatSelect == null) {
            System.out.println("Seat not found");
        }
    }
    // Method to update a booking seat number
    public void updateBooking(String oldSeatNumber, String newSeatNumber) {
        // TODO 9: iterate through the list of booked seats
        int i = 0;
        boolean seatFound = false;
        for(Seat seat: bookedSeatsList) {
            // TODO 10: check if the seat number matches the old seat number and is not canceled
            if ((seat.getSeatNumber() == oldSeatNumber) && (!seat.isCanceled())) {
                seatFound = true;
                // TODO 11: update the seat number to the new seat number
                Seat newSeat = new Seat(newSeatNumber);
                newSeat.setBooked(true);
                this.bookedSeatsList.set(i, newSeat);
                // confirm the update to the user
                System.out.println(newSeat);
                break;
            }
            i++;
        }
        // TODO 12: inform the user if no booking was found for the old seat number
        if(seatFound == false) {
            System.out.println("Seat not found");
        }
    }
    // Method to display all bookings
    public void displayBookings() {
        // TODO 13: check if the bookedSeatsList is empty, inform the user that no bookings have been made yet
        // TODO 14: iterate through the list of booked seats, Check if the seat is booked and not canceled
        // TODO 15: display the seat number and booking date
        if(this.bookedSeatsList.isEmpty()) {
            System.out.println("No bookings have been made yet");
        }
        else {
            for(Seat seat: this.bookedSeatsList) {
                if(seat.isBooked() && !seat.isCanceled()) {
                    System.out.println(seat.getSeatNumber() + ": " + seat.getBookingDate());
                }
            }

        }

    }
}
