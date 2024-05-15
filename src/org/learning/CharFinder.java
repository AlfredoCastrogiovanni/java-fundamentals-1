package org.learning;

import java.util.Scanner;

public class CharFinder {
    public static void main(String[] args) {

        int currentPosition = -1;
        int currentLength = 0;
        int startPosition = 0;
        int maxLength = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert your string: ");
        String str = scanner.nextLine();

        System.out.print("Insert your char: ");
        char charToFind = scanner.nextLine().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (charToFind == str.charAt(i)) {
                if (currentPosition == -1) {
                    currentPosition = i;
                }
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    startPosition = currentPosition;
                }
                currentLength = 0;
                currentPosition = -1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            startPosition = currentPosition;
        }

        System.out.println("Max length: " + maxLength);
        System.out.println("Index: " + startPosition);

        scanner.close();
    }
}
