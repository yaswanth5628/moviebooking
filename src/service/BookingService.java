package service;
import model.Booking;
import model.Movie;
import java.util.ArrayList;
public class BookingService {
    private static ArrayList<Booking> bookingList = new ArrayList<>();
    public static void addBooking(Booking booking){
        bookingList.add(booking);
    }
    public static ArrayList<Booking> getBookings(){
        return bookingList;

    }
    public static void cancelBooking(int bookingId){
        Booking booking = null;
        for(Booking b : bookingList){
            if (b.getBookingId()==bookingId){
                booking = b;
                break;
            }
        }
        if(booking!=null){
            bookingList.remove(booking);
        }
    }
    public static boolean bookTicket(Movie movie, Booking booking){
        if (movie.getAvailableSeats()>=booking.getTickets()){
            movie.setAvailableSeats(movie.getAvailableSeats()- booking.getTickets());
            bookingList.add(booking);
            return true;
        }
        return false;
    }

}