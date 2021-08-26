package com.michaelbuzzard.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {


    LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

    @Test
    public void testLastWordLength1() {
        String str = "hello world";

        int actual = lengthOfLastWord.lengthOfLastWord(str);

        assertEquals(5,actual);

    }

    @Test
    public void testLastWordLength2() {
        String str = "hello world          ";

        int actual = lengthOfLastWord.lengthOfLastWord(str);

        assertEquals(5,actual);

    }

    @Test
    public void testLastWordLength3() {
        String str = "hello world me name is Michael    ";

        int actual = lengthOfLastWord.lengthOfLastWord(str);

        assertEquals(7,actual);

    }

    @Test
    public void testLastWordLength4() {
        String str = " hi helloWorld      ";

        int actual = lengthOfLastWord.lengthOfLastWord(str);

        assertEquals(10,actual);

    }


}