package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeats = Integer.parseInt(scanner.nextLine());

        Map<String , String> map = new LinkedHashMap<>();

        for (int i = 0; i < repeats; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[1];

            if (input[0].equals("register")){
                String carNumber = input[2];

                if (!map.containsKey(name)){
                    map.put(name , carNumber);
                    System.out.printf("%s registered %s successfully%n" , name , carNumber);
                }else {
                    System.out.printf("ERROR: already registered with plate number %s%n" , carNumber);
                }

            }
            if (input[0].equals("unregister")){
                if (!map.containsKey(name)){
                    System.out.printf("ERROR: user %s not found%n" , name);
                }else {
                    map.remove(name);
                    System.out.printf("%s unregistered successfully%n" , name);
                }

            }
        }
        map.forEach((k , v) -> System.out.printf("%s => %s%n" , k , v));

    }
}
