package com.java.sum_without_highest_and_lowest_number;


public class Kata1 {

    private int sumOfNumbers;

    public Kata1() {
    }

    public int sumNumbersInTable(int[] myTable) {

        for (int i = 1; i < myTable.length-1; i++) {
            sumOfNumbers = sumOfNumbers + myTable[i];
        }
        return sumOfNumbers;
    }

}
