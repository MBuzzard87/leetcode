package com.michaelbuzzard.leetcode;

public class ReverseArray {

    //Leetcode problem requires you to alter nums array

    public int[] rotate(int[] nums, int k) {
        int[] tempArr = new int[nums.length];
        System.arraycopy(nums,0,tempArr,0,nums.length);
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            nums[(i + k) % length] = tempArr[i];
        }

        return nums;
    }

}
