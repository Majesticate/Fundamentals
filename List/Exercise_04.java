package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")){
            switch (input[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(input[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.parseInt(input[1]));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(input[1]));
                    break;
                case "Insert":
                    int num = Integer.parseInt(input[1]);
                    int num2 = Integer.parseInt(input[2]);
                    numbers.add(num2 , num);
                    break;
            }
            input = scanner.nextLine().split(" ");
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]" , ""));
    }
}
