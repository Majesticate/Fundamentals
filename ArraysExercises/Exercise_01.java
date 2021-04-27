package com.company;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int repeats = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int[] numbers = new int[repeats];

        for (int i = 0; i < repeats ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            numbers[i] = currentNumber;
            sum += currentNumber;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(sum);

    }
}
