package JavaForm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class FormWithLabels extends JFrame implements ActionListener {

    JLabel nameLabel, mobLabel, emailLabel, dobLabel, cityLabel, stateLabel;
    JTextField nameField, mobField, emailField, dobField, cityField, stateField;
    JButton submitButton, clearButton;

    public FormWithLabels() {
        setTitle("Form Submission");
        setLayout(new GridLayout(8, 2, 10, 10)); // More rows for spacing
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameLabel = new JLabel("Name:");
        mobLabel = new JLabel("Mobile no.:");
        emailLabel = new JLabel("Email:");
        dobLabel = new JLabel("DOB:");
        cityLabel = new JLabel("City:");
        stateLabel = new JLabel("State:");

        nameField = new JTextField();
        mobField = new JTextField();
        emailField = new JTextField();
        dobField = new JTextField();
        cityField = new JTextField();
        stateField = new JTextField();

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(this);

        add(nameLabel);
        add(nameField);

        add(mobLabel);
        add(mobField);

        add(emailLabel);
        add(emailField);

        add(dobLabel);
        add(dobField);

        add(cityLabel);
        add(cityField);

        add(stateLabel);
        add(stateField);

        add(submitButton);
        add(clearButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String mob = mobField.getText();
            String email = emailField.getText();
            String dob = dobField.getText();
            String city = cityField.getText();
            String state = stateField.getText();

            if (name.isEmpty() || mob.isEmpty() || email.isEmpty() || dob.isEmpty() || city.isEmpty() || state.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields");
            } else {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12790064",
                            "sql12790064",
                            "ZA6KRzzzGM"
                    );

                    String query = "INSERT INTO form_data (name, mobile, email, dob, city, state) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = con.prepareStatement(query);

                    pst.setString(1, name);
                    pst.setString(2, mob);
                    pst.setString(3, email);
                    pst.setString(4, dob);
                    pst.setString(5, city);
                    pst.setString(6, state);

                    pst.executeUpdate();
                    con.close();

                    JOptionPane.showMessageDialog(this, "Data inserted successfully 💾");

                    // Clear fields
                    nameField.setText("");
                    mobField.setText("");
                    emailField.setText("");
                    dobField.setText("");
                    cityField.setText("");
                    stateField.setText("");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
                }
            }

        } else if (e.getSource() == clearButton) {
            nameField.setText("");
            mobField.setText("");
            emailField.setText("");
            dobField.setText("");
            cityField.setText("");
            stateField.setText("");
        }
    }

    public static void main(String[] args) {
        new FormWithLabels();
    }
}


