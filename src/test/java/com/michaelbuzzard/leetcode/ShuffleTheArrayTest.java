package com.michaelbuzzard.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShuffleTheArrayTest {

    ShuffleTheArray shuffle = new ShuffleTheArray();

    @Test
    public void testShuffle1A() {
        int[] nums = {2,5,1,3,4,7};
        int[] actual = shuffle.shuffle1(nums,3);
        int[] expected = {2,3,5,4,1,7};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShuffle1B() {
        int[] nums = {1,2,3,4,4,3,2,1};
        int[] actual = shuffle.shuffle1(nums,4);
        int[] expected = {1,4,2,3,3,2,4,1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShuffle1C() {
        int[] nums = {1,1,2,2};
        int[] actual = shuffle.shuffle1(nums,2);
        int[] expected = {1,2,1,2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShuffle2A() {
        int[] nums = {2,5,1,3,4,7};
        int[] actual = shuffle.shuffle2(nums,3);
        int[] expected = {2,3,5,4,1,7};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShuffle2B() {
        int[] nums = {1,2,3,4,4,3,2,1};
        int[] actual = shuffle.shuffle2(nums,4);
        int[] expected = {1,4,2,3,3,2,4,1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShuffle2C() {
        int[] nums = {1,1,2,2};
        int[] actual = shuffle.shuffle2(nums,2);
        int[] expected = {1,2,1,2};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShuffle3A() {
        int[] nums = {2,5,1,3,4,7};
        int[] actual = shuffle.shuffle3(nums,3);
        int[] expected = {2,3,5,4,1,7};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShuffle3B() {
        int[] nums = {1,2,3,4,4,3,2,1};
        int[] actual = shuffle.shuffle3(nums,4);
        int[] expected = {1,4,2,3,3,2,4,1};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testShuffle3C() {
        int[] nums = {1,1,2,2};
        int[] actual = shuffle.shuffle3(nums,2);
        int[] expected = {1,2,1,2};

        assertArrayEquals(expected, actual);
    }

}