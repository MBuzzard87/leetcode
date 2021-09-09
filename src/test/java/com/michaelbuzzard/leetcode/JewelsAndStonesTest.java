package com.michaelbuzzard.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class JewelsAndStonesTest {

    JewelsAndStones jewelsAndStones = new JewelsAndStones();

    @Test
    public void numJewelsInStones1() {

        int actual = jewelsAndStones.numJewelsInStones("aA","aAAbbbb");

        assertEquals(3,actual);

    }

    @Test
    public void numJewelsInStones2() {

        int actual = jewelsAndStones.numJewelsInStones("z","ZZ");

        assertEquals(0,actual);

    }

    @Test
    public void numJewelsInStones3() {

        int actual = jewelsAndStones.numJewelsInStones("aAbc","aAAbbbbC");

        assertEquals(7,actual);

    }
}