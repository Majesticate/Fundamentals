package com.company;

import java.util.Scanner;

public class Exercise_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMax(input);
    }

    private static void printMax(String input) {
        if (input.equals("char")) {
            maxOfChars(input);
        } else if (input.equals("string")) {
            maxOfStrings(input);
        } else if (input.equals("int")) {
            maxOfInt(input);
        }
    }

    private static void maxOfInt(String input) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        getMaxOfIntegers(firstNum, secondNum);

    }

    private static void getMaxOfIntegers(int firstNum, int secondNum) {
        int myNum = (Math.max(firstNum, secondNum));
        System.out.println(myNum);
    }

    private static void maxOfStrings(String input) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        getMaxOfStrings(firstString, secondString);

    }

    private static void getMaxOfStrings(String firstString, String secondString) {
        int sumOfFirstString = 0;
        for (int i = 0; i < firstString.length(); i++) {
            int number = firstString.charAt(i);
            sumOfFirstString += number;
        }
        int sumOfSecondString = 0;
        for (int i = 0; i < secondString.length(); i++) {
            int number = secondString.charAt(i);
            sumOfSecondString += number;

        }
        whichIsBiggerFromStrings(sumOfFirstString, sumOfSecondString, firstString, secondString);
    }

    private static void whichIsBiggerFromStrings(int sumOfFirstString, int sumOfSecondString, String firstString, String secondString) {
        if (sumOfFirstString > sumOfSecondString) {
            System.out.println(firstString);
        } else {
            System.out.println(secondString);
        }
    }

    private static void maxOfChars(String input) {
        Scanner scanner = new Scanner(System.in);
        String firstChar = scanner.nextLine();
        String secondChar = scanner.nextLine();
        getMaxOfStrings(firstChar, secondChar);

    }
}
