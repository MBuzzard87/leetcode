package com.michaelbuzzard.leetcode;

public class ShuffleTheArray {

    public int[] shuffle1(int[] nums, int n) {
        int[] intArr = new int[n * 2];
        int firstHalf = 0;
        int secondHalf = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                intArr[i] = nums[secondHalf];
                secondHalf++;
            } else {
                intArr[i] = nums[firstHalf];
                firstHalf++;
            }
        }
        return intArr;
    }

    public int[] shuffle2(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < 2 * n; ++i) {
            ans[i] = nums[i / 2 + i % 2 * n];
        }
        return ans;
    }

    public int[] shuffle3(int[] nums, int n) {
        int[] ans = new int[ 2 * n];
        for (int i = 0; i < n; ++i) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}
