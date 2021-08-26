package com.michaelbuzzard.leetcode;

import java.util.HashSet;
import java.util.Set;

public class SmallestNumberNotInAnArray {

    //Find the smallest number between 1 and 100,000 that is not present within an array
    //return only numbers larger than 0


    public int getSmallestNumber(int[] numArr) {

        Set<Integer> numSet = new HashSet<>();
        int lowestNum = 1;

        for(int num : numArr) {
            numSet.add(num);
        }

        for(int i = 1; i <= 100000; i++) {
            if(numSet.add(i)) {
                lowestNum = i;
                break;
            }
        }

        return lowestNum;
    }
}
