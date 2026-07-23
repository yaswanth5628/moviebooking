package model;
public class Movie {
    private int movieId;
    private String movieName;
    private String language;
    private int availableSeats;
    private double ticketPrice;
    public Movie() {
    }
    public Movie(int movieId, String movieName, String language, int availableSeats, double ticketPrice) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.language = language;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
    }
    public int getMovieId() {return movieId;}
    public void setMovieId(int movieId) {this.movieId = movieId;}
    public String getMovieName() {return movieName;}
    public void setMovieName(String movieName) {this.movieName = movieName;}
    public String getLanguage() {return language;}
    public void setLanguage(String language) {this.language = language;}
    public int getAvailableSeats() {return availableSeats;}
    public void setAvailableSeats(int availableSeats) {this.availableSeats = availableSeats;}
    public double getTicketPrice() {return ticketPrice;}
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;}
}