package com.michaelbuzzard.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumWithEvenNumOfDigitsTest {

    NumWithEvenNumOfDigits num = new NumWithEvenNumOfDigits();

    @Test
    public void testFindNumbers1() {
        int[] arr1 = {12,345,2,6,7896};
        int actual = num.findNumbers(arr1);

        assertEquals(2,actual);
    }

    @Test
    public void testFindNumbers2() {
        int[] arr1 = {1,345,2,6,896};
        int actual = num.findNumbers(arr1);

        assertEquals(0,actual);
    }

    @Test
    public void testFindNumbers3() {
        int[] arr1 = {12,3456,32,26,7896};
        int actual = num.findNumbers(arr1);

        assertEquals(5,actual);
    }
}