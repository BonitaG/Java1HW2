package com.company;

public class Main {

    public static void main(String[] args) {
        String nameAzamat = "Азамат";
        String nameHasan = "Хасан";
        String nameBek = "Бек";
        int age = 25;
        int ageHasan = 15;
        int ageBek = 47;

        int temperature = 10;
        int temperatureHasan = 15;
        int temperatureBek = 8;

        if (age > 20 && age < 45 && temperature < 30 && temperature > -20) {
            System.out.println(nameAzamat + "у " + "можно гулять!!!");
        }
        if (ageHasan > 0 && ageHasan < 20 && temperatureHasan < 28 && temperatureHasan > 0) {
            System.out.println(nameHasan + "у " + "можно гулять!!!");

        }
        if (ageBek>45 && temperatureBek < 25 && temperatureBek > -10) {
            System.out.println(nameBek + "e " + "можно гулять!!!");

        }
    }
}
    

