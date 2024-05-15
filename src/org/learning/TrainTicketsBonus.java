package org.learning;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrainTicketsBonus {

    public static void gui() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Ticket Generator");
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        // Label Km
        JLabel labelKm = new JLabel("Km to travel: ");
        labelKm.setBounds(10, 20, 80, 25);
        panel.add(labelKm);

        // Km textfield
        JTextField fieldKm = new JTextField();
        fieldKm.setBounds(90, 22, 80, 20);
        panel.add(fieldKm);

        // Label Age
        JLabel labelAge = new JLabel("Your age: ");
        labelAge.setBounds(10, 50, 80, 25);
        panel.add(labelAge);

        // Age textfield
        JTextField fieldAge = new JTextField();
        fieldAge.setBounds(90, 52, 80, 20);
        panel.add(fieldAge);

        // Output Label
        JLabel outputLabel = new JLabel();
        outputLabel.setBounds(200, 18, 300, 25);
        panel.add(outputLabel);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(10, 85, 80, 20);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int km = Integer.parseInt(fieldKm.getText());
                int age = Integer.parseInt(fieldAge.getText());

                outputLabel.setText("the ticket price is " + ticketCalculator(km, age));
            }
        });
        panel.add(submitButton);
    }

    public static double ticketCalculator(int ticketKm, int ticketAge) {
        double priceForKm = 0.21;

        double ticketPrice = ticketKm * priceForKm;

        if (ticketAge < 18) {
            double discount = ticketPrice * (20.0 / 100.0);
            ticketPrice -= discount;
        } else if(ticketAge > 65) {
            double discount = ticketPrice * (40.0 / 100.0);
            ticketPrice -= discount;
        }

        return ticketPrice;
    }

    public static void main(String[] args) {
        gui();
    }
}
