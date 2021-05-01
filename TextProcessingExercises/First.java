package com.company;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        boolean isInvalid = false;


        for (String word : input) {
            if (word.length() > 3 && word.length() < 16){
                for (int i = 0; i < word.length(); i++) {
                    int currentChar = word.charAt(i);
                    char current = word.charAt(i);

                    if (Character.isDigit(current) || Character.isAlphabetic(current) || currentChar == 95 || currentChar ==45){

                    }else {
                        isInvalid = true;
                        break;
                    }

                }
                if (!isInvalid){
                    System.out.println(word);
                }
                isInvalid = false;
            }
        }
    }
}
