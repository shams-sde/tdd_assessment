package com.tdd;

public class AssessmentTDD {
    public boolean checkIfLeapYear(int year) {
        if (year % 400 == 0) return true;
        return false;
    }
}