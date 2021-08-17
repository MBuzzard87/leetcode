package com.michaelbuzzard.leetcode;

import com.michaelbuzzard.leetcode.NumberOfDuplicates;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfDuplicatesTest {

    NumberOfDuplicates numDup = new NumberOfDuplicates();

    @Test
    public void testNumDup1() {

        int[] dupArr = {1,2,3,4,5,3,2,1,4,5,7,4};

        int actual = numDup.numOfDuplicates(dupArr);

        assertEquals(6,actual);

    }

    @Test
    public void testNumDup2() {

        int[] dupArr = {1,2,3,4,5,6,7,8,9,10};

        int actual = numDup.numOfDuplicates(dupArr);

        assertEquals(0,actual);

    }

    @Test
    public void testNumDup3() {

        int[] dupArr = {1,1,1,1,1,1};

        int actual = numDup.numOfDuplicates(dupArr);

        assertEquals(5,actual);

    }
}