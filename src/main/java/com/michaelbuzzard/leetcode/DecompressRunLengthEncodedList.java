package com.michaelbuzzard.leetcode;

import java.util.Arrays;

public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }

        int[] newArr = new int[arrSize];

        int index = 0;
        for(int i = 0; i < nums.length; i += 2) {
            Arrays.fill(newArr, index, index + nums[i], nums[i+1]);
            index += nums[i];
        }

        return newArr;
    }

}
