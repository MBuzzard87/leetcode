package com.michaelbuzzard.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class SmallestNumberNotInAnArrayTest {

    SmallestNumberNotInAnArray smallArr = new SmallestNumberNotInAnArray();

    @Test
    public void testSmallNum1() {

        int[] numArr = {1,2,3,4,5,6,8,9,10};

        int actual = smallArr.getSmallestNumber(numArr);

        assertEquals(7,actual);

    }

    @Test
    public void testSmallNum2() {

        int[] numArr = {0,1,3,4,6,2};

        int actual = smallArr.getSmallestNumber(numArr);

        assertEquals(5,actual);

    }

    @Test
    public void testSmallNum3() {

        int[] numArr = {1,2,3,-1,4,5,-6,10,9,8,7,6,1};

        int actual = smallArr.getSmallestNumber(numArr);

        assertEquals(11,actual);

    }

    @Test
    public void testSmallNum4() {

        int[] numArr = {-1,-3};

        int actual = smallArr.getSmallestNumber(numArr);

        assertEquals(1,actual);

    }

}