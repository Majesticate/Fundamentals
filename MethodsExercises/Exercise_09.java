package com.company;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(isPalindromeInteger(input));

            input = scanner.nextLine();
        }

    }

    private static boolean isPalindromeInteger(String input) {
        return (input.charAt(0) == input.charAt(input.length() - 1));
    }
}
