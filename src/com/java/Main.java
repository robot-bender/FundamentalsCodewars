package com.java;

public class Main {

    public static void main(String[] args) {
        Kata1 kata1 = new Kata1();
        int[] tableOfNumbers = new int[]{1, 23, 24, 25, 26};
        int sumOfNumbers = kata1.sumNumbersInTable(tableOfNumbers);
        System.out.println(sumOfNumbers);
    }
}
