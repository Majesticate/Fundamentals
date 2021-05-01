package com.company;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        input = input.replaceAll(" ", "");

        for (int i = 0; i < input.length(); i++) {
            int currentCha = input.charAt(i);

            int myNumberForChar = currentCha + 3;

            char newChar = (char)myNumberForChar;

            System.out.print(newChar);
        }
    }
}
