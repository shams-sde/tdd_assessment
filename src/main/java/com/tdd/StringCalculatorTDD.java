package com.tdd;

import java.util.Scanner;

public class StringCalculatorTDD {

    int add(String numbers) {
        int sum = 0;
        if(numbers.isEmpty()) return sum;

        try (Scanner scanner = new Scanner(numbers)) {
            String delimiter = ",";
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("//")) {
                    delimiter = line.replace("//", "").trim();
                    continue;
                }
                for (String num : line.split(delimiter)) {
                    sum += Integer.parseInt(num.trim());
                }
            }
        }

        return sum;
    }
}
