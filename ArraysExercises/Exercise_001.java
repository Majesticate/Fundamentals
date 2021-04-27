package com.company;

import java.util.Scanner;

public class Exercise_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeats = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < repeats; i++) {
            int sum = 0;
            String input = scanner.nextLine();
            for (int j = 0; j < input.length() ; j++) {
                switch (input.charAt(j)) {
                    case 'a':
                        sum += input.charAt(j) * input.length();
                        break;
                    case 'u':
                        sum += input.charAt(j) * input.length();
                        break;
                    case 'o':
                        sum += input.charAt(j) * input.length();
                        break;
                    case 'i':
                        sum += input.charAt(j) * input.length();
                        break;
                    case 'e':
                        sum += input.charAt(j) * input.length();
                        break;
                    case 'y':
                        sum += input.charAt(j) * input.length();
                        break;
                    default:
                        sum+= input.charAt(j) / input.length();
                }
            }
            System.out.println(sum);

        }
    }
}
