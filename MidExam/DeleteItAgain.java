package com.company;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DeleteItAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] arrayDouble = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double , Integer> map = new TreeMap<>();

        for (double number : arrayDouble) {

            if (!map.containsKey(number)){
                map.put(number , 1);
            }else {
                map.put(number , map.get(number) +1);
            }

        }

        for (Map.Entry<Double, Integer> doubleIntegerEntry : map.entrySet()) {
            System.out.printf("%.0f -> %d%n" , doubleIntegerEntry.getKey() , doubleIntegerEntry.getValue());
        }

    }
}
