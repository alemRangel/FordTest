package com.company;

import java.util.HashMap;
import java.util.Map;

public class RomanNumerals {
   // I, V, X, L, C, D, and M
    private Map<Integer, String> map = new HashMap<>();
    private Integer numToTranslate;

    public RomanNumerals(int input) {
        this.numToTranslate = input;
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
    }

    public String getRoman() {
        String partialRoman = "";
        if(map.containsKey(numToTranslate)){
            partialRoman = map.get(numToTranslate);
        } else {
            if(numToTranslate >= 2 && numToTranslate <4){
                partialRoman = "I";
                for(int i=0; i<numToTranslate-1; ++i){
                    partialRoman = partialRoman + "I";
                }
            } else {
                if(numToTranslate == 4){
                    partialRoman = "IV";
                }
            }
        }

        return partialRoman;
    }
}
