package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() -1; i++) {
            if (numbers.get(i).equals(numbers.get(i+1))){
                int currentNum = numbers.get(i) + numbers.get(i+1);
                numbers.remove(i+1);
                numbers.set(i , currentNum);
                i = -1;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]" ,""));
    }
}
