package gui;

import model.Booking;
import model.Movie;
import service.BookingService;
import service.MovieService;

import javax.swing.*;

public class BookTicketFrame extends JFrame{

    JLabel movieIdLabel;
    JLabel customerLabel;
    JLabel ticketLabel;

    JTextField movieIdField;
    JTextField customerField;
    JTextField ticketField;

    JButton bookButton;

    public BookTicketFrame(){

        setTitle("Book Ticket");
        setSize(450,350);
        setLayout(null);
        setLocationRelativeTo(null);

        movieIdLabel=new JLabel("Movie ID");
        movieIdLabel.setBounds(40,40,100,25);
        add(movieIdLabel);

        movieIdField=new JTextField();
        movieIdField.setBounds(180,40,180,25);
        add(movieIdField);

        customerLabel=new JLabel("Customer Name");
        customerLabel.setBounds(40,90,120,25);
        add(customerLabel);

        customerField=new JTextField();
        customerField.setBounds(180,90,180,25);
        add(customerField);

        ticketLabel=new JLabel("Tickets");
        ticketLabel.setBounds(40,140,100,25);
        add(ticketLabel);

        ticketField=new JTextField();
        ticketField.setBounds(180,140,180,25);
        add(ticketField);

        bookButton=new JButton("Book");
        bookButton.setBounds(150,220,120,35);
        add(bookButton);

        bookButton.addActionListener(e->bookTicket());

        setVisible(true);

    }

    private void bookTicket(){

        try{

            int movieId=Integer.parseInt(movieIdField.getText());

            String customer=customerField.getText();

            int tickets=Integer.parseInt(ticketField.getText());

            Movie movie=MovieService.getMovieById(movieId);

            if(movie==null){

                JOptionPane.showMessageDialog(this,"Movie Not Found");

                return;

            }

            double total=tickets*movie.getTicketPrice();

            Booking booking=new Booking(
                    BookingService.getBookings().size()+1,
                    customer,
                    movie.getMovieName(),
                    tickets,
                    total
            );

            boolean status=BookingService.bookTicket(movie,booking);

            if(status){

                JOptionPane.showMessageDialog(this,"Ticket Booked Successfully");

            }

            else{

                JOptionPane.showMessageDialog(this,"Seats Not Available");

            }

        }

        catch(Exception e){

            JOptionPane.showMessageDialog(this,"Invalid Input");

        }

    }

}