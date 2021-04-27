package com.company;

import java.util.Scanner;

public class Exercise_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());


        printMultiply(input);
    }

    private static void printMultiply( int input) {
        sumOfEven(input);
        sumOfOdd(input);
        System.out.println(sumOfEven(input) * sumOfOdd(input));
    }

    private static int sumOfOdd(int input) {
        int sumEven = 0;
        while (input > 0){
            int number = input % 10;
            if (number % 2 == 0){
                sumEven += number;
            }
            input = input / 10;
        }
            return sumEven;
    }

    private static int sumOfEven(int input) {
        int sumOdd = 0;
        while (input > 0) {
            int number = input % 10;
            if (number % 2 == 1) {
                sumOdd += number;
            }
            input = input / 10;
        }
        return sumOdd;
    }
}
