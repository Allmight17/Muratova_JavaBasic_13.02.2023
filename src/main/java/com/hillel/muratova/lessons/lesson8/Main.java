package com.hillel.muratova.lessons.lesson8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int [] array = {5, 2, 6, 2, 1, 8, 9};
//        int counter = 0;
//        System.out.println("Before: ");
//        System.out.println(Arrays.toString(array));
////
//
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                counter++;
//                if (array [j] > array [j +1]) {
//                    int temp = array[j];
//                    array [j] = array [j +1];
//                    array [j +1] = temp;
//
//                }
//
//            }
//
//        }
//        Arrays.sort(array);
//        System.out.println("After");
//        System.out.println(Arrays.toString(array));
        int [][] array = new int[2][3];

        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
        int number = 1;
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j] = number;
                number++;
            }

        }
        System.out.println(Arrays.deepToString(array));


    }
}
