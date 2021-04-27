package com.company;

import java.util.Scanner;

public class Exercise_003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printTriangle(number);

    }

    private static void printTriangle(int number) {

        topHalfOfTriangle(number);
        bottomHalfOfTriangle(number);
    }

    private static void topHalfOfTriangle(int number) {
        for (int i = 1; i < number; i++) {
            lengthOfThem(i);
            System.out.println();
        }

    }

    private static void bottomHalfOfTriangle(int number) {
        for (int i = number; i >= 1 ; i--) {
            lengthOfThem(i);
            System.out.println();
        }
    }

    private static void lengthOfThem(int length) {
        for (int i = 1; i <= length ; i++) {
            System.out.print(i + " ");
        }
    }


}
