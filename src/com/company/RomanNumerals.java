package com.company;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
   // I, V, X, L, C, D, and M
    private static Map<String, Integer> map = new HashMap<>();
    private Integer numToTranslate;

    public RomanNumerals(int input) {
        this.numToTranslate = input;
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    }

    public String traslateArabicNumberToRoman(){
        return '';
    }

    private  getPonderation() {

    }
}
