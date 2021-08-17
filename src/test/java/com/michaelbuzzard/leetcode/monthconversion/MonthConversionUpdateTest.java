package com.michaelbuzzard.leetcode.monthconversion;

import com.michaelbuzzard.leetcode.MonthConversion;
import org.junit.Assert;
import org.junit.Test;

public class MonthConversionUpdateTest {
    @Test
    public void testIsValidMonth_whenNotExist(){
        //Given
        MonthConversion conversion = new MonthConversion();
        Integer month = 5;
        conversion.add(5, "April");
        String expectedMonth = "May";

        //When
        conversion.update(month, expectedMonth);

        //Then
        String actualMonth = conversion.getName(month);
        Assert.assertEquals(expectedMonth, actualMonth);
    }
}
