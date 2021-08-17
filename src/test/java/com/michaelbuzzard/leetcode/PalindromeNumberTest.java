package com.michaelbuzzard.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {

    PalindromeNumber pdNum = new PalindromeNumber();



    @Test
    public void testIsPalindrome1() {

        boolean actual = pdNum.isPalindrome(123);


        assertEquals(false, actual);
    }

    @Test
    public void testIsPalindrome2() {

        boolean actual = pdNum.isPalindrome(123321);


        assertEquals(true, actual);
    }

    @Test
    public void testIsPalindrome3() {

        boolean actual = pdNum.isPalindrome(-121);


        assertEquals(false, actual);
    }
    @Test
    public void testIsPalindrome4() {

        boolean actual = pdNum.isPalindrome(122191221);


        assertEquals(true, actual);
    }
}