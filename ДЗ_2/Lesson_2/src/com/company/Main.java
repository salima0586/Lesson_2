package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(setInfo(10, -14));
        System.out.println(setInfo(25, 7));
        System.out.println(setInfo(7, 0));
        System.out.println(setInfo(65, 29));
        System.out.println(setInfo(44, 39));
    }

    public static String setInfo(int age, int temp) {
        String pol = "Можно идти гулять";
        String otr = "Оставайтесь дома";
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return pol + " 1";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return pol + " 2";
        } else if (age > 45 && temp < -10 && temp > 25) {
            return pol + " 3";
        } else {
            return otr + " 4";
        }
    }




}
