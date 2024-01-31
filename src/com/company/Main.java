package com.company;

public class Main {
    // integer, x>0,  x<=3999

    public static void main(String[] args) {
	// write your code here
        int testValue = 6;
        RomanNumerals romanNumerals = new RomanNumerals(testValue);
        System.out.println(romanNumerals.getRoman());
    }
}
