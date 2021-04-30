package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        for (int i = 0; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            int lastNumber = numbers.get(numbers.size() - 1);
            int sum = currentNumber + lastNumber;
            numbers.set(i, sum);
            numbers.remove(numbers.size() - 1);
        }
        System.out.println(numbers);
    }
}