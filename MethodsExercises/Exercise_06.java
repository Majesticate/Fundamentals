package com.company;

import java.util.Scanner;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String input) {
        if (input.length() % 2 == 1){
            System.out.println(input.charAt(input.length() / 2));
        }else {
            System.out.println(input.charAt(input.length() / 2 - 1));
            System.out.println(input.charAt(input.length() / 2));
        }
    }
}
