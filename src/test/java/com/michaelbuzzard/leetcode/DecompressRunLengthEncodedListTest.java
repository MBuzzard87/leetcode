package com.michaelbuzzard.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecompressRunLengthEncodedListTest {

    DecompressRunLengthEncodedList decompress = new DecompressRunLengthEncodedList();

    @Test
    public void decompressRLElist1() {
        int[] arr = {1,2,3,4};
        int[] actual = decompress.decompressRLElist(arr);
        int[] expected = {2,4,4,4};

        assertArrayEquals(expected,actual);

    }

    @Test
    public void decompressRLElist2() {
        int[] arr = {3,2,4,4,1,9};
        int[] actual = decompress.decompressRLElist(arr);
        int[] expected = {2,2,2,4,4,4,4,9};

        assertArrayEquals(expected,actual);

    }

    @Test
    public void decompressRLElist3() {
        int[] arr = {4,2,1,4};
        int[] actual = decompress.decompressRLElist(arr);
        int[] expected = {2,2,2,2,4};

        assertArrayEquals(expected,actual);

    }
}