package gui;

import model.Movie;
import service.MovieService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ViewMoviesFrame extends JFrame{

    JTable table;
    JScrollPane scrollPane;

    public ViewMoviesFrame(){

        setTitle("View Movies");
        setSize(700,400);
        setLocationRelativeTo(null);

        String[] columns={"Movie ID","Movie Name","Language","Seats","Price"};

        DefaultTableModel model=new DefaultTableModel(columns,0);

        ArrayList<Movie> movies=MovieService.getMovies();

        for(Movie movie:movies){

            Object[] row={
                    movie.getMovieId(),
                    movie.getMovieName(),
                    movie.getLanguage(),
                    movie.getAvailableSeats(),
                    movie.getTicketPrice()
            };

            model.addRow(row);

        }

        table=new JTable(model);

        scrollPane=new JScrollPane(table);

        add(scrollPane);

        setVisible(true);

    }

}