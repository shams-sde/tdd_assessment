package com.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssessmentTDDTest {

    @Test
    public void shouldCheckIfLeapYear() {
        AssessmentTDD assessmentTDD = new AssessmentTDD();
        assertTrue(assessmentTDD.checkIfLeapYear(2000));

    }
}
