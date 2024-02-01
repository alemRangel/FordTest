package com.company;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
   // I, V, X, L, C, D, and M
    private Map<Integer, String> unidades = new HashMap<>();
    private Map<Integer, String> decenas = new HashMap<>();
    private Map<Integer, String> centenas = new HashMap<>();
    private Map<Integer, String> miles = new HashMap<>();

    private Integer numToTranslate;

    public RomanNumerals(int input) {
        this.numToTranslate = input;
        unidades.put(1, "I");
        unidades.put(2, "II");
        unidades.put(3, "III");
        unidades.put(4, "IV");
        unidades.put(5, "V");
        unidades.put(6, "VI");
        unidades.put(7, "VII");
        unidades.put(8, "VIII");
        unidades.put(9, "IX");
        decenas.put(10, "X");
        decenas.put(20, "XX");
        decenas.put(30, "XXX");
        decenas.put(40, "XL");
        decenas.put(50, "L");
        decenas.put(60, "LX");
        decenas.put(70, "LXX");
        decenas.put(80, "LXXX");
        decenas.put(90, "XC");
        centenas.put(100, "C");
        centenas.put(200, "CC");
        centenas.put(300, "CCC");
        centenas.put(400, "CD");
        centenas.put(500, "D");
        centenas.put(600, "DC");
        centenas.put(700, "DCC");
        centenas.put(800, "DCCC");
        centenas.put(900, "CM");
        miles.put(1000, "M");
        miles.put(2000, "MM");
        miles.put(3000, "MMM");
    }

    public String getRoman() {
        StringBuilder romanNumber = new StringBuilder();
        String numAsString = numToTranslate.toString();
       for(int i=0; i<numAsString.length(); ++i){
            romanNumber.append(getValue(String.valueOf(numAsString.charAt(i)), numAsString.length() - i));
       }
       return romanNumber.toString();
    }

    public String getValue(String strNum, int ponderacion) {
        int num = Integer.parseInt(strNum);
        switch (ponderacion){
            case 4:
                return miles.get(num * 1000);
            case 3:
                return centenas.get(num * 100);
            case 2:
                return decenas.get(num * 10);
            case 1:
                return unidades.get(num);
            default:
                return "";
        }
    }
}
