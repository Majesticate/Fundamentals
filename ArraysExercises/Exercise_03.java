package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputs = Integer.parseInt(scanner.nextLine());

        int[] firstArray =new int[inputs];
        int[] secondArray =new int[inputs];


        for (int i = 0; i < inputs ; i++) {

            int[] arrays = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            if (i % 2 == 0){
                firstArray[i] = arrays[0];
                secondArray[i] = arrays[0 +1];
            }else {
                firstArray[i] = arrays[0 + 1];
                secondArray[i] = arrays[0];
            }

        }

        for (int i = 0; i < inputs; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < inputs; i++) {
            System.out.print(secondArray[i] + " ");
        }

    }
}
