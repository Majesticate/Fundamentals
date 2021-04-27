package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> output = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == ' ') {
                continue;
            }

            if (!output.containsKey(currentChar)) {
                output.put(currentChar, 1);
            } else {
                output.put(currentChar, output.get(currentChar) + 1);
            }
        }

        output.forEach((c, i) -> System.out.println(c + " -> " + i));
        System.out.println();

    }
}
