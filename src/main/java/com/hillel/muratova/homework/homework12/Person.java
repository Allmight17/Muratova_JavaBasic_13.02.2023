package com.hillel.muratova.homework.homework12;

public class Person {
    public static void main(String[] args) {

        String result = personInfo("Lucy", "Muratova", "Kyiv", "+380999559788");

        System.out.println(result);

        System.out.println(personInfo("Tanya", "Novokhatnia", "Kyiv", "+380998836527"));

        System.out.println(personInfo("Tima", "Kirilenko", "Poltava", "+380504403936"));

    }

    static String personInfo(String name, String surname, String city, String phone) {

        String information = "Зателефонувати громадянину: " + name + " " + surname + " " + "із міста " + city + " " +  "можна за номером " + phone;

        return information;
    }

}
