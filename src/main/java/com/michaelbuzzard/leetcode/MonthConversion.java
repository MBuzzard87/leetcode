package com.michaelbuzzard.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MonthConversion {

    Map<Integer, String> intMonth = new HashMap<>();
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public void add(Integer monthNumber, String monthName) {
        intMonth.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {

        if (isValidNumber(monthNumber)) {
            return intMonth.get(monthNumber);
        }
        return null;


    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {
        Integer month = null;
        for(Integer monthNum : intMonth.keySet()) {
            if (intMonth.get(monthNum) == monthName) {
                month = monthNum;
            }

        }
        return month;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        return intMonth.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return intMonth.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return intMonth.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        intMonth.put(monthNumber,monthName);

    }

}
