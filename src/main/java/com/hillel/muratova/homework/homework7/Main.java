package com.hillel.muratova.homework.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int amountOfAttempts = 3;
        int numberByComputer = 3;
        int guess = -1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess what number from 0 to 10 I'm thinking of!");

        while (amountOfAttempts >= 0) {
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

            } else {
                System.out.println("Wrong data! Try again!");
            }
            if (guess == numberByComputer) {
                System.out.println("Congratulations! You are the winner!");
            } else if (guess > numberByComputer) {
                System.out.println("I'm thinking of lower number");

            } else {
                System.out.println("I'm thinking of higher number");
            }



            System.out.println("Attempts: " + amountOfAttempts);
            if (amountOfAttempts == 0) {
                System.out.println("Zero attempts!");
            }
            amountOfAttempts--;

        }
    }
}
