package com.tdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringCalculatorTDDTest {

    @Test
    public void shouldAdd() {
        StringCalculatorTDD stringCalculatorTDD = new StringCalculatorTDD();
        assertEquals(stringCalculatorTDD.add(""), 0);
    }
}
