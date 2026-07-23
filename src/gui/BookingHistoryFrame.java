package gui;

import model.Booking;
import service.BookingService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class BookingHistoryFrame extends JFrame{

    JTable table;

    JScrollPane scrollPane;

    public BookingHistoryFrame(){

        setTitle("Booking History");
        setSize(700,400);
        setLocationRelativeTo(null);

        String[] columns={
                "Booking ID",
                "Customer",
                "Movie",
                "Tickets",
                "Amount"
        };

        DefaultTableModel model=new DefaultTableModel(columns,0);

        ArrayList<Booking> bookings=BookingService.getBookings();

        for(Booking booking:bookings){

            Object[] row={
                    booking.getBookingId(),
                    booking.getCustomerName(),
                    booking.getMovieName(),
                    booking.getTickets(),
                    booking.getTotalAmount()
            };

            model.addRow(row);

        }

        table=new JTable(model);

        scrollPane=new JScrollPane(table);

        add(scrollPane);

        setVisible(true);

    }

}