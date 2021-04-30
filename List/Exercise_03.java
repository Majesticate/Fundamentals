package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int biggerNum =Math.min(numbers1.size() , numbers2.size());

        for (int i = 0; i < biggerNum; i++) {
            System.out.print(numbers1.get(i) + " " + numbers2.get(i) + " ");
        }

        ifNumber1IsBigger(numbers1, numbers2);
        ifNumber2IsBigger(numbers1, numbers2);
    }

    private static void ifNumber2IsBigger(List<Integer> numbers1, List<Integer> numbers2) {
        for (int i = numbers1.size(); i < numbers2.size() ; i++) {
            System.out.print(numbers2.get(i) + " ");
        }
    }

    private static void ifNumber1IsBigger(List<Integer> numbers1, List<Integer> numbers2) {
        for (int i = numbers2.size(); i < numbers1.size(); i++) {
            System.out.print(numbers1.get(i)+ " ");
        }

    }
}
