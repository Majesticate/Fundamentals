package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < arrayInt.length; i++) {

            for (int j = i; j < arrayInt.length; j++) {
                if (arrayInt[i] + arrayInt[j] == magicNum){
                    System.out.printf(arrayInt[i] + " " + arrayInt[j]+ "%n");
                }


            }

        }
    }
}
