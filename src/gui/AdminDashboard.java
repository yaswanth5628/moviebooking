package gui;
import javax.swing.*;
public class AdminDashboard extends JFrame {
    JButton addMovieButton;
    JButton viewMovieButton;
    JButton deleteMovieButton;
    JButton bookingButton;
    JButton logoutButton;
    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(600,450);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMovieButton=new JButton("Add Movie");
        addMovieButton.setBounds(180,50,220,40);
        add(addMovieButton);
        viewMovieButton=new JButton("View Movies");
        viewMovieButton.setBounds(180,110,220,40);
        add(viewMovieButton);
        deleteMovieButton=new JButton("Delete Movie");
        deleteMovieButton.setBounds(180,170,220,40);
        add(deleteMovieButton);
        bookingButton=new JButton("View Bookings");
        bookingButton.setBounds(180,230,220,40);
        add(bookingButton);
        logoutButton=new JButton("Logout");
        logoutButton.setBounds(180,290,220,40);
        add(logoutButton);
        addMovieButton.addActionListener(e -> new AddMovieFrame());
        viewMovieButton.addActionListener(e -> new ViewMoviesFrame());
        deleteMovieButton.addActionListener(e -> new DeleteMovieFrame());
        bookingButton.addActionListener(e -> new BookingHistoryFrame());
        logoutButton.addActionListener(e -> {
            new LoginFrame();
            dispose();
        });
        setVisible(true);
    }
}