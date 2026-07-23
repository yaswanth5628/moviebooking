package model;
public class Booking {
    private int bookingId;
    private String customerName;
    private String movieName;
    private int tickets;
    private double totalAmount;
    public Booking() {
    }
    public Booking(int bookingId, String customerName, String movieName, int tickets, double totalAmount) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.tickets = tickets;
        this.totalAmount = totalAmount;
    }
    public int getBookingId() {return bookingId;}
    public void setBookingId(int bookingId) {this.bookingId = bookingId;}
    public String getCustomerName() {return customerName;}
    public void setCustomerName(String customerName) {this.customerName = customerName;}
    public String getMovieName() {return movieName;}
    public void setMovieName(String movieName) {this.movieName = movieName;}
    public int getTickets() {return tickets;}
    public void setTickets(int tickets) {this.tickets = tickets;}
    public double getTotalAmount() {return totalAmount;}
    public void setTotalAmount(double totalAmount) {this.totalAmount = totalAmount;}
}