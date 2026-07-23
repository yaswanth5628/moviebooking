package gui;
import javax.swing.*;
import java.awt.*;
public class LoginFrame extends JFrame {
    JButton adminButton;
    JButton customerButton;
    JButton exitButton;
    JLabel title;
    public LoginFrame() {
        setTitle("Movie Ticket Booking System");
        setSize(600,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        title=new JLabel("Movie Ticket Booking System");
        title.setFont(new Font("Arial",Font.BOLD,24));
        title.setBounds(110,40,400,40);
        add(title);
        adminButton=new JButton("Admin");
        adminButton.setBounds(200,120,180,40);
        add(adminButton);
        customerButton=new JButton("Customer");
        customerButton.setBounds(200,180,180,40);
        add(customerButton);
        exitButton=new JButton("Exit");
        exitButton.setBounds(200,240,180,40);
        add(exitButton);
        adminButton.addActionListener(e->{
            new AdminDashboard();
            dispose();
        });
        customerButton.addActionListener(e->{
            new CustomerDashboard();
            dispose();
        });
        exitButton.addActionListener(e->System.exit(0));
        setVisible(true);

    }
}