package com.tdd;

public class StringCalculatorTDD {

    int add(String numbers) {
        int sum = 0;
        if(numbers.isEmpty()) return sum;

        for (String num : numbers.split(",")) {
            sum += Integer.parseInt(num.trim());
        }

        return sum;
    }
}
