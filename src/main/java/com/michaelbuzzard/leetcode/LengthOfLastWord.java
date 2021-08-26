package com.michaelbuzzard.leetcode;

public class LengthOfLastWord {


    public int lengthOfLastWord(String s) {
        int strLength = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                strLength++;
            } else if (strLength > 0) {
                return strLength;
            }
        }
        return strLength;
    }

}
