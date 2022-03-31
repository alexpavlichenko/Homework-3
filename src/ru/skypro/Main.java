package ru.skypro;

import java.sql.SQLOutput;

public class Main {
    // Задание 1

    public static void main(String[] args) {
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Download IOS App");
        }
        if (clientOs == 1) {
            System.out.println("Download Android App");
        }
        // Задание 2
        {
            int clientDeviceYear = 2013;
            if (clientDeviceYear < 2015 && clientOs == 0) {
                System.out.println("Download IOS lite app version");
            } else if (clientDeviceYear < 2015 && clientOs == 1) {
                System.out.println("Download Android lite app version");
            }
        }
        //Задание 3
        {
            int year = 400;
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " isn't a leap year");
            }
        }
        //Задание 4
        {
            int deliveryDistance = 95;
            if (deliveryDistance < 20) {
                System.out.println("Delivery will take 1 day");
            } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Delivery will take 2 days");
        } else {
            System.out.println("Delivery will take 3 days");
        }

        }
    }
}


