package com.company;

import java.util.Scanner;

public class RepeatedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] word = scanner.nextLine().split(" ");


        for (String s : word) {
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.replaceAll(" " ,""));
            }
        }

        System.out.println();
    }
}
