package com.company;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String[] input = scanner.nextLine().split("\\\\");

        String lastInput = input[input.length -1];

        String[] myStrings = lastInput.split("\\.");

        System.out.printf("File name: %s%n" , myStrings[0]);
        System.out.printf("File extension: %s" , myStrings[1]);


    }
}
