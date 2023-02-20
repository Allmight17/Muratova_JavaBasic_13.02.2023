package com.hillel.muratova.homework.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        String nameteamA = "friends";
        String nameteamB = "love";

        int fragsA1 = 1;
        int fragsA2 = 1;
        int fragsA3 = 1;
        int fragsA4 = 1;
        int fragsA5 = 1;

        int fragsB1 = 1;
        int fragsB2 = 1;
        int fragsB3 = 1;
        int fragsB4 = 1;
        int fragsB5 = 1;

        System.out.println("Please enter your name1");
        nameteamA = scanner.next();
        System.out.println("Please enter your name2");
        nameteamB = scanner.next();


        System.out.println("Please enter your number");
        if (scanner.hasNextInt()) {
            fragsA1 = scanner.nextInt();

        } else {
            System.out.println("Wrong data! Restart program!");
            System.exit(0);
        }

        System.out.println("Please enter your number");
        if (scanner.hasNextInt()) {
            fragsA2 = scanner.nextInt();

        } else {
            System.out.println("Wrong data! Restart program!");
            System.exit(0);
        }
        System.out.println("Please enter your number");
        if (scanner.hasNextInt()) {
            fragsA3 = scanner.nextInt();

        } else {
            System.out.println("Wrong data! Restart program!");
            System.exit(0);
        }
        System.out.println("Please enter your number");
        if (scanner.hasNextInt()) {
            fragsA4 = scanner.nextInt();

        } else {
            System.out.println("Wrong data! Restart program!");
            System.exit(0);
        }
        System.out.println("Please enter your number");
        if (scanner.hasNextInt()) {
            fragsA5 = scanner.nextInt();

        } else {
            System.out.println("Wrong data! Restart program!");
            System.exit(0);
        }
        System.out.println("Please enter your number");
        if (scanner.hasNextInt()) {
            fragsB1 = scanner.nextInt();

        } else {
            System.out.println("Wrong data! Restart program!");
            System.exit(0);
        }
        System.out.println("Please enter your number");
        if (scanner.hasNextInt()) {
            fragsB2 = scanner.nextInt();

        } else {
            System.out.println("Wrong data! Restart program!");
            System.exit(0);
        }
        System.out.println("Please enter your number");
        if (scanner.hasNextInt()) {
            fragsB3 = scanner.nextInt();

        } else {
            System.out.println("Wrong data! Restart program!");
            System.exit(0);
        }
        System.out.println("Please enter your number");
        if (scanner.hasNextInt()) {
            fragsB4 = scanner.nextInt();

        } else {
            System.out.println("Wrong data! Restart program!");
            System.exit(0);
        }
        System.out.println("Please enter your number");
        if (scanner.hasNextInt()) {
            fragsB5 = scanner.nextInt();

        } else {
            System.out.println("Wrong data! Restart program!");
            System.exit(0);
        }


        System.out.println("Your number for player A1: " + fragsA1);
        System.out.println("Your number for player A2: " + fragsA2);
        System.out.println("Your number for player A3: " + fragsA3);
        System.out.println("Your number for player A4: " + fragsA4);
        System.out.println("Your number for player A5: " + fragsA5);
        System.out.println("Your number for player B1: " + fragsB1);
        System.out.println("Your number for player B2: " + fragsB2);
        System.out.println("Your number for player B3: " + fragsB3);
        System.out.println("Your number for player B4: " + fragsB4);
        System.out.println("Your number for player B5: " + fragsB5);

        int resultA = (fragsA1 + fragsA2 + fragsA3 + fragsA4 + fragsA5) / 5;
        int resultB = (fragsB1 + fragsB2 + fragsB3 + fragsB4 + fragsB5) / 5;

        System.out.println("Frags of teamA: " + resultA);
        System.out.println("Frags of teamB: " + resultB);

        if (resultA > resultB) {
            System.out.println("Перемогла команда " + nameteamA + " набрала " + resultA + " очків");
        }
        if (resultA < resultB) {
            System.out.println("Перемогла команда " + nameteamB + "набрала " + resultB + " очків");
        }
        if (resultA == resultB) {
            System.out.println("Порівну очків");
        }




    }
}
