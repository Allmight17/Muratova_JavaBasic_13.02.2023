package com.hillel.muratova.homework.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Before: ");

        int[] array1 = new int[7];
        int[] array2 = new int[7];

        for (int i = 0; i < array1.length ; i++) {
            array1[i] = (int) (Math.random() * 10);

        }

        for (int i = 0; i < array2.length ; i++) {
            array2[i] = (int) (Math.random() * 10);

        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.println("After: ");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length - 1 - i; j++) {
                if (array1[j] > array1[j + 1]) {
                    int number = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = number;
                }

            }

        }

        System.out.println(Arrays.toString(array1));

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length - 1 - i; j++) {
                if (array2[j] > array2[j + 1]) {
                    int number = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = number;
                }

            }

        }
        System.out.println(Arrays.toString(array2));

        int counter = 0;
        for (int i = 0; i < 7; i++) {
            if(array1[i] == array2[i]) {
                counter++;
            }
            
        }

        System.out.println("Coincidences: " + counter);




    }
}
