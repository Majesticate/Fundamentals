package com.company;

import java.util.Scanner;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String[] firstWords = firstInput.split(" ");
        String[] secondWords = secondInput.split(" ");


        for (String word2: secondWords) {
            for (String word1: firstWords){
                if (word2.equals(word1)){
                    System.out.print(word2 + " ");
                    break;
                }

            }

        }


    }
}
