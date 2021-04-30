package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        printNumsWithoutNegative(numbers);
    }

    private static void printNumsWithoutNegative(List<Integer> numbers) {
        int firstNumbersCount = numbers.size();
        int counter = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0){
                numbers.remove(i);
                i = -1;
                counter++;
            }
        }
        if (counter == firstNumbersCount){
            System.out.println("empty");
        }else {
            Collections.reverse(numbers);
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
