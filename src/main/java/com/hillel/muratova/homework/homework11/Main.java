package com.hillel.muratova.homework.homework11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number for matrix height: ");

        int m = scanner.nextInt();
        if (m < 0) {

            System.out.println("Number must be positive!");
        }

        System.out.println("Please enter number for matrix length: ");
        int n = scanner.nextInt();

        if (n < 0) {

            System.out.println("Number must be positive!");
        }


        int[][] array1 = new int[m][n];
        int[][] array2 = new int[n][m];

        for (int i = 0; i < array1.length ; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 11);

                System.out.print(array1[i][j] + " ");


            }
            System.out.println();

        }


        System.out.println();

        for (int i = 0; i < array2.length ; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];

                System.out.print(array2[i][j] + " ");


            }
            System.out.println();

        }
        scanner.close();












    }
}
