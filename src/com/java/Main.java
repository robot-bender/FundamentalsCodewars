package com.java;

public class Main {

    public static void main(String[] args) {
        Kata1 kata1 = new Kata1();
        int[] number = new int[5];
        for (int i = 0; i < number.length; i++) {
            number[i] = i;
        }
        int numerek = kata1.sum(number);
        System.out.println(numerek);
        System.out.println(number.length);
    }
}
