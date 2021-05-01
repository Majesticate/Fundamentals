package com.company;

import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (i == input.length() -2){
                if (input.charAt(i+1) == currentChar){
                    System.out.print(currentChar);
                    break;
                } else {
                    char nextChar = input.charAt(i +1);
                    System.out.print(currentChar);
                    System.out.print(nextChar);
                    break;
                }
            }

            if (input.charAt(i+1) == currentChar){

            } else {
                System.out.print(currentChar);
            }

        }
    }
}
