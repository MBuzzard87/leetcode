package com.michaelbuzzard.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    TwoSum ts = new TwoSum();

    @Test
    public void twoSum1() {
        int[] nums = {2,7,11,15};
        int[] actual = ts.twoSum(nums,9);
        int[] expected = {0,1};

        assertArrayEquals(expected,actual);
    }

    @Test
    public void twoSum2() {
        int[] nums = {1,7,11,15};
        int[] actual = ts.twoSum(nums,16);
        int[] expected = {0,3};
    }

    @Test
    public void twoSum3() {
        int[] nums = {2,7,11,15,0,3};
        int[] actual = ts.twoSum(nums,10);
        int[] expected = {1,5};
    }
}