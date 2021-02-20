package com.tdd;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class StringCalculatorTDDTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldAdd() throws Exception{
        StringCalculatorTDD stringCalculatorTDD = new StringCalculatorTDD();
        assertEquals(stringCalculatorTDD.add(""), 0);
        assertEquals(stringCalculatorTDD.add("1"), 1);
        assertEquals(stringCalculatorTDD.add("1, 5"), 6);
        assertEquals(stringCalculatorTDD.add("1\n2,3"), 6);
        assertEquals(stringCalculatorTDD.add("1\n,"), 1);
        assertEquals(stringCalculatorTDD.add("//;\n1;2"), 3);
        Assertions.assertThrows(Exception.class, () -> {
            stringCalculatorTDD.add("-1, -5");
        });

        assertEquals(stringCalculatorTDD.add("//-\n1000-2"), 1002);
        assertEquals(stringCalculatorTDD.add("//-\n1001-2"), 2);
        assertEquals(stringCalculatorTDD.add("//[***]\n1***2***3"), 6);
        assertEquals(stringCalculatorTDD.add("//[*][%]\n1*2%3"), 6);
    }
}
