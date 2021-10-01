package com.michaelbuzzard.leetcode;

public class NumWithEvenNumOfDigits {
    public int findNumbers(int[] nums) {
        int numDigits = 0;
        String numStr = "";
        for (int numInt : nums) {
            numStr = String.valueOf(numInt);
            if(numStr.length() % 2 == 0) {
                numDigits++;
            }
        }
        return numDigits;
    }
}
