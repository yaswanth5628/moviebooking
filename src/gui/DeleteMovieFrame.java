package gui;

import service.MovieService;

import javax.swing.*;

public class DeleteMovieFrame extends JFrame{

    JLabel idLabel;

    JTextField idField;

    JButton deleteButton;

    public DeleteMovieFrame(){

        setTitle("Delete Movie");
        setSize(350,220);
        setLayout(null);
        setLocationRelativeTo(null);

        idLabel=new JLabel("Movie ID");
        idLabel.setBounds(40,40,100,25);
        add(idLabel);

        idField=new JTextField();
        idField.setBounds(140,40,120,25);
        add(idField);

        deleteButton=new JButton("Delete");
        deleteButton.setBounds(100,110,120,35);
        add(deleteButton);

        deleteButton.addActionListener(e->deleteMovie());

        setVisible(true);

    }

    private void deleteMovie(){

        try{

            int id=Integer.parseInt(idField.getText());

            if(MovieService.getMovieById(id)==null){

                JOptionPane.showMessageDialog(this,"Movie Not Found");

                return;

            }

            MovieService.deleteMovie(id);

            JOptionPane.showMessageDialog(this,"Movie Deleted Successfully");

            idField.setText("");

        }

        catch(Exception e){

            JOptionPane.showMessageDialog(this,"Invalid Input");

        }

    }

}