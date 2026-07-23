package gui;
import javax.swing.*;
public class CustomerDashboard extends JFrame {
    JButton viewMovieButton;
    JButton bookTicketButton;
    JButton bookingHistoryButton;
    JButton logoutButton;
    public CustomerDashboard(){
        setTitle("Customer Dashboard");
        setSize(600,450);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewMovieButton=new JButton("View Movies");
        viewMovieButton.setBounds(180,70,220,40);
        add(viewMovieButton);
        bookTicketButton=new JButton("Book Ticket");
        bookTicketButton.setBounds(180,140,220,40);
        add(bookTicketButton);
        bookingHistoryButton=new JButton("Booking History");
        bookingHistoryButton.setBounds(180,210,220,40);
        add(bookingHistoryButton);
        logoutButton=new JButton("Logout");
        logoutButton.setBounds(180,280,220,40);
        add(logoutButton);
        viewMovieButton.addActionListener(e->new ViewMoviesFrame());
        bookTicketButton.addActionListener(e->new BookTicketFrame());
        bookingHistoryButton.addActionListener(e->new BookingHistoryFrame());
        logoutButton.addActionListener(e->{
            new LoginFrame();
            dispose();
        });
        setVisible(true);
    }
}