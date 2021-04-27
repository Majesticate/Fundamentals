package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //27 19 42 2 13 45 48 20
        //14 24 3 19 15 17


        for (int i = 0; i < arrayInt.length -1; i++) {
            int currentNum = arrayInt[i];
            boolean isTop = false;


            for (int j = i; j < arrayInt.length+1 ; j++) {
                if (currentNum > arrayInt[j]){
                    isTop = true;

                }
            }
            if (isTop){
                System.out.println(currentNum);
            }

        }

    }
}
