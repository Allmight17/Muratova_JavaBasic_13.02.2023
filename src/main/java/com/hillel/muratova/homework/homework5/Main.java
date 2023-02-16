package com.hillel.muratova.homework.homework5;

public class Main {
    public static void main(String[] args) {
        int soldiersLi = 13;
        int archersLi = 24;
        int horsemenLi = 5;

        int soldiersMin = 9;
        int archersMin = 35;
        int horsemenMin = 12;

        int amountOfPeopleLi = 860;
        int powerLi = amountOfPeopleLi * (soldiersLi + archersLi +horsemenLi);
        double powerMin = (int) (amountOfPeopleLi * 1.5 * (soldiersMin + archersMin + horsemenMin));
        System.out.println("Загальний показник атаки Лі = " + powerLi);
        System.out.println("Загальний показник атаки Мінь = " + powerMin);



    }
}
