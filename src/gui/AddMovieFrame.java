package gui;
import model.Movie;
import service.MovieService;
import javax.swing.*;
public class AddMovieFrame extends JFrame {
    JLabel idLabel;
    JLabel nameLabel;
    JLabel languageLabel;
    JLabel seatsLabel;
    JLabel priceLabel;
    JTextField idField;
    JTextField nameField;
    JTextField languageField;
    JTextField seatsField;
    JTextField priceField;
    JButton saveButton;
    JButton clearButton;
    public AddMovieFrame() {
        setTitle("Add Movie");
        setSize(450,450);
        setLayout(null);
        setLocationRelativeTo(null);
        idLabel=new JLabel("Movie ID");
        idLabel.setBounds(40,30,120,25);
        add(idLabel);
        idField=new JTextField();
        idField.setBounds(180,30,180,25);
        add(idField);
        nameLabel=new JLabel("Movie Name");
        nameLabel.setBounds(40,80,120,25);
        add(nameLabel);
        nameField=new JTextField();
        nameField.setBounds(180,80,180,25);
        add(nameField);
        languageLabel=new JLabel("Language");
        languageLabel.setBounds(40,130,120,25);
        add(languageLabel);
        languageField=new JTextField();
        languageField.setBounds(180,130,180,25);
        add(languageField);
        seatsLabel=new JLabel("Available Seats");
        seatsLabel.setBounds(40,180,120,25);
        add(seatsLabel);
        seatsField=new JTextField();
        seatsField.setBounds(180,180,180,25);
        add(seatsField);
        priceLabel=new JLabel("Ticket Price");
        priceLabel.setBounds(40,230,120,25);
        add(priceLabel);
        priceField=new JTextField();
        priceField.setBounds(180,230,180,25);
        add(priceField);
        saveButton=new JButton("Save");
        saveButton.setBounds(70,320,120,35);
        add(saveButton);
        clearButton=new JButton("Clear");
        clearButton.setBounds(220,320,120,35);
        add(clearButton);
        saveButton.addActionListener(e->saveMovie());
        clearButton.addActionListener(e->clearFields());
        setVisible(true);
    }
    private void saveMovie() {
        try{
            int id=Integer.parseInt(idField.getText());
            String name=nameField.getText();
            String language=languageField.getText();
            int seats=Integer.parseInt(seatsField.getText());
            double price=Double.parseDouble(priceField.getText());
            Movie movie=new Movie(id,name,language,seats,price);
            MovieService.addMovie(movie);
            JOptionPane.showMessageDialog(this,"Movie Added Successfully");
            clearFields();

        }
        catch(Exception ex){

            JOptionPane.showMessageDialog(this,"Invalid Input");
        }
    }
    private void clearFields(){

        idField.setText("");
        nameField.setText("");
        languageField.setText("");
        seatsField.setText("");
        priceField.setText("");

    }

}