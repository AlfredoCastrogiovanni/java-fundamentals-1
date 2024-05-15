package org.learning;

import java.util.Scanner;

public class TrainTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForKm = 0.21;

        System.out.print("Insert the km to travel: ");
        int ticketKm = Integer.parseInt(scanner.nextLine());

        System.out.print("Insert your age: ");
        int ticketAge = Integer.parseInt(scanner.nextLine());

        double ticketPrice = ticketKm * priceForKm;

        if (ticketAge < 18) {
            double discount = ticketPrice * (20.0 / 100.0);
            ticketPrice -= discount;
        } else if(ticketAge > 65) {
            double discount = ticketPrice * (40.0 / 100.0);
            ticketPrice -= discount;
        }

        System.out.println();
        System.out.println("Ticket price: " + ticketPrice + '$');

        scanner.close();
    }
}
