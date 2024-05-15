package org.learning;

public class FavoriteFoods {
    public static void main(String[] args) {
        String[] foods = {"Pizza", "Pasta", "Gelato", "Risotto", "Tiramisù"};

        System.out.println("Ranking Lenght: " + foods.length);
        System.out.println("First Position: " + foods[0]);
        System.out.println("Last Position: " + foods[foods.length - 1]);
        System.out.println("Middle Position: " + foods[foods.length / 2]);
    }
}
