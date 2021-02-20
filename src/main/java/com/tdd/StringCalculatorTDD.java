package com.tdd;

import java.util.Scanner;

public class StringCalculatorTDD {

    int add(String numbers) {
        int sum = 0;
        if(numbers.isEmpty()) return sum;

        try (Scanner scanner = new Scanner(numbers)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (String num : line.split(",")) {
                    sum += Integer.parseInt(num.trim());
                }
            }
        }

        return sum;
    }
}
