package com.michaelbuzzard.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseArrayTest {

    private int[] shiftArr = {1,2,3,4,5,6,7};
    ReverseArray reverseArray = new ReverseArray();

    @Test
    public void rotate1() {

        int[] expected = {5,6,7,1,2,3,4};

        assertArrayEquals(expected, reverseArray.rotate(shiftArr,3));
    }

    @Test
    public void rotate2() {

        int[] expected = {1,2,3,4,5,6,7};

        assertArrayEquals(expected, reverseArray.rotate(shiftArr,7));
    }

    @Test
    public void rotate3() {

        int[] expected = {2,3,4,5,6,7,1};

        assertArrayEquals(expected, reverseArray.rotate(shiftArr,6));
    }

    @Test
    public void rotate4() {

        int[] expected = {2,3,4,5,6,7,1};

        assertArrayEquals(expected, reverseArray.rotate(shiftArr,13));
    }
}