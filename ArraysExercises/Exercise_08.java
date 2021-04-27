package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arrayInt.length; i++) {
            int currentNum = arrayInt[i];
            for (int j = i; j < arrayInt.length; j++) {
                int currentNum2 = arrayInt[j];
                if (currentNum + currentNum2 == magicNum){
                    System.out.printf("%d %d%n" , currentNum , currentNum2);
                }

            }
        }
    }
}
