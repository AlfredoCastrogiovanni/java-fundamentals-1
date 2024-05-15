package org.learning;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        boolean access = false;

        String[] guestList = {
            "Jennifer Lopez",
            "Zendaya",
            "Chris Hemsworth",
            "Bad Bunny",
            "Cara Delevingne",
            "Kendall Jenner",
            "Uma Thurman",
            "Damiano David",
            "Luca Guadagnino"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String guestName = scanner.nextLine();

        for (int i = 0; i < guestList.length; i++) {
            if (guestList[i].equals(guestName)) {
                access = true;
            }
        }

        if (access) {
            System.out.println("Access Allowed");
        } else {
            System.out.println("Access Denied");
        }
    }
}
