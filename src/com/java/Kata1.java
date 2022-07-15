package com.java;

public class Kata1 {

    private int sumOfNumbers;

    public Kata1() {
    }

    public int sumNumbersInTable(int[] myTable) {
        for (int i = 0; i < myTable.length; i++) {
            sumOfNumbers = sumOfNumbers + myTable[i];
        }
        return sumOfNumbers;
    }


}
