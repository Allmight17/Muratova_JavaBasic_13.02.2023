package com.hillel.muratova.homework.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Є дві команди регбі з 25 гравців різного віку у кожній.
//
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//
//        Виведіть у двох рядках вік гравців кожної команди.
//
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.

       int[] players1 = new int[25];
       int[] players2 = new int[25];
       int averageAge1 = 1;
       int averageAge2 = 1;
       int sum1 = 0;
       int sum2 = 0;


        for (int i = 0; i < players1.length; i++) {
            players1[i] = (int) ((Math.random() * (40 - 18 + 1)) + 18);

            sum1 += players1[i];
        }

        averageAge1 = sum1 / players1.length;

        for (int i = 0; i < players2.length; i++) {
            players2[i] = (int) ((Math.random() * (40 - 18 + 1)) + 18);

            sum2 += players2[i];

        }

        averageAge2 = sum2 / players2.length;


        System.out.println("Вік гравців команди № 1: " + Arrays.toString(players1));
        System.out.println();
        System.out.println("Вік гравців команди № 2: " + Arrays.toString(players2));
        System.out.println();

        System.out.println("Середній вік гравців команди № 1: " + averageAge1);
        System.out.println();
        System.out.println("Середній вік гравців команди № 2: " + averageAge2);















    }
}
