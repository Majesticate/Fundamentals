package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split(" ");


        while (!input[0].equals("end")) {
            switch (input[0]) {
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Contains":
                    int thisNum = Integer.parseInt(input[1]);
                    boolean isNotFound = true;
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i).equals(thisNum)) {
                            System.out.println("Yes");
                            isNotFound = false;
                            break;
                        }
                    }
                    if (isNotFound) {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (input[1]) {
                        case "even":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 == 0) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 == 1) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                case "Filter":
                    switch (input[1]) {
                        case "<":
                            for (int i = 0; i < numbers.size(); i++) {
                                int num = Integer.parseInt(input[2]);
                                if (numbers.get(i) < num) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < numbers.size(); i++) {
                                int num = Integer.parseInt(input[2]);
                                if (numbers.get(i) <= num) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < numbers.size(); i++) {
                                int num = Integer.parseInt(input[2]);
                                if (numbers.get(i) > num) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < numbers.size(); i++) {
                                int num = Integer.parseInt(input[2]);
                                if (numbers.get(i) >= num) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
             /*   case "Get":
                    int sumOfAllNumbers = 0;

                    for (int i = 0; i < numbers.size() ; i++) {
                        sumOfAllNumbers += numbers.get(i);
                    }
                    System.out.println(sumOfAllNumbers);
                    System.out.println();
                    break;

              */
            }
            input = scanner.nextLine().split(" ");

        }
    }
}
