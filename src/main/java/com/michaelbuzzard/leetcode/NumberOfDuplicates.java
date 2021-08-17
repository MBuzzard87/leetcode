package com.michaelbuzzard.leetcode;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDuplicates {


    public int numOfDuplicates(int[] dupArr) {

        Set<Integer> dupSet = new HashSet<>();

        for(int dup : dupArr) {
            dupSet.add(dup);
        }

        return dupArr.length - dupSet.size();
    }
}
