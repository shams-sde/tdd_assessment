package com.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssessmentTDDTest {

    @Test
    public void shouldCheckIfLeapYear() {
        AssessmentTDD assessmentTDD = new AssessmentTDD();
        assertTrue(assessmentTDD.checkIfLeapYear(2000));
        assertFalse(assessmentTDD.checkIfLeapYear(2001));
        assertTrue(assessmentTDD.checkIfLeapYear(2004));
        assertFalse(assessmentTDD.checkIfLeapYear(1700));
        assertFalse(assessmentTDD.checkIfLeapYear(1800));
        assertFalse(assessmentTDD.checkIfLeapYear(1900));

    }
}
