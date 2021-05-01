package com.company;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double result = 0;


        for (String word : input) {
            double sumOfCurrentWord = 0;

            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() -1);

            String numberInString = word.substring(1 , word.length()-1);
            int number = Integer.parseInt(numberInString);

            if (Character.isUpperCase(firstLetter)){
                int currentCharPosition = firstLetter - 64;
                sumOfCurrentWord = 1.0 * number / currentCharPosition;


            }else {
                int currentCharPosition = firstLetter - 96;
                sumOfCurrentWord = 1.0 * number * currentCharPosition;

            }

            if (Character.isUpperCase(lastLetter)){
                int currentCharPosition = lastLetter - 64;
                sumOfCurrentWord -= currentCharPosition;

            }else{
                int currentCharPosition = lastLetter - 96;
                sumOfCurrentWord += currentCharPosition;
            }
            result += sumOfCurrentWord;

        }
        System.out.printf("%.2f" ,result);
    }
}
