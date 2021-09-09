package com.michaelbuzzard.leetcode;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {


    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> charSet = new HashSet<>();
        int numJewels = 0;

        for (int i = 0; i < jewels.length(); i++) {
            charSet.add(jewels.charAt(i));
        }

        for (int j = 0; j < stones.length(); j++) {
            if(charSet.contains(stones.charAt(j))) {
                numJewels++;
            }
        }

        return numJewels;
    }
}
