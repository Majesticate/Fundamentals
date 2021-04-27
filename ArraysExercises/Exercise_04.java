package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int perNumber = Integer.parseInt(scanner.nextLine());

        //51 47 32 61 21
        //2

        for (int i = 0; i < perNumber ; i++) {

            int currentNumber =arrayInt[0];

            for (int j = 0; j < arrayInt.length - 1; j++) {
                arrayInt[j] = arrayInt[j +1];


            }
            arrayInt[arrayInt.length - 1] = currentNumber;



        }

        for (int i = 0; i < arrayInt.length ; i++) {
            System.out.print(arrayInt[i] + " ");

        }
    }
}
