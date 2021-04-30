package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //3 3 6 1

        //6 3 6 1

        //6 6 1?

        for (int i = 0; i < numbers.size()-1 ; i++) {
            int currentNum = numbers.get(i);
            int myNumber = numbers.get(numbers.size() - 1);
            if (currentNum == (numbers.get(i + 1))){
                myNumber = numbers.get(i) + numbers.get(i + 1);
                numbers.set(i , myNumber);
                numbers.remove(i +1);
                i = -1;
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]" ,""));
    }
}
