package com.company;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int repeats = Integer.parseInt(scanner.nextLine());

        printRepeatedInput(input, repeats);
    }

    private static void printRepeatedInput(String input, int repeats) {
        for (int i = 0; i < repeats; i++) {
            System.out.print(input);

        }
    }
}
