package com.tdd;

import java.util.Scanner;

public class StringCalculatorTDD {

    int add(String numbers) throws Exception{
        int sum = 0;
        if(numbers.isEmpty()) return sum;

        try (Scanner scanner = new Scanner(numbers)) {
            String delimiter = ",";
            StringBuilder negatives = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains("//")) {
                    delimiter = line.replace("//", "").trim();
                    continue;
                }
                for (String data : line.split(delimiter)) {
                    int num = Integer.parseInt(data.trim());
                    if (num < 0) {
                        negatives.append(data + ", ");
                        continue;
                    } else if (negatives.length() == 0) {
                        sum += num;
                    }
                }
            }
            if (negatives.length() > 0) throw new Exception("negatives not allowed : "+negatives);
        }

        return sum;
    }
}
