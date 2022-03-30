package ru.skypro;

import java.sql.SQLOutput;

public class Main {
    // Задание 1

    public static void main(String[] args) {
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Download IOS App");
        }
        if (clientOs == 1) {
            System.out.println("Download Android App");
        }
        // Задание 2
        {
            int clientDeviceYear = 2016;
            if (clientDeviceYear < 2015 && clientOs == 0) {
                System.out.println("Download IOS lite version");
            } else if (clientDeviceYear < 2015 && clientOs == 1 ) {
                System.out.println("Download Android lite version");
            }
        }
    }
}


    // Задание 2