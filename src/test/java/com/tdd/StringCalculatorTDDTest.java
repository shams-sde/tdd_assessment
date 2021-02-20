package com.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTDDTest {

    @Test
    public void shouldAdd() {
        StringCalculatorTDD stringCalculatorTDD = new StringCalculatorTDD();
        assertEquals(stringCalculatorTDD.add(""), 0);
        assertEquals(stringCalculatorTDD.add("1"), 1);
        assertEquals(stringCalculatorTDD.add("1, 5"), 6);
        assertEquals(stringCalculatorTDD.add("1\n2,3"), 6);
    }
}
