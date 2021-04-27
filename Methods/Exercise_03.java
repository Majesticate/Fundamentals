package com.company;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        for (int i = number; i >= 1 ; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

