package com.michaelbuzzard.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DefangingAnIPAddressTest {

    DefangingAnIPAddress defang = new DefangingAnIPAddress();

    @Test
    public void defangIPaddr1() {

        String actual = defang.defangIPaddr("1.1.1.1");

        assertEquals("1[.]1[.]1[.]1", actual);
    }

    @Test
    public void defangIPaddr2() {
        String actual = defang.defangIPaddr("255.100.50.0");

        assertEquals("255[.]100[.]50[.]0", actual);

    }

}