package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("-");

        Map<String, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();


        Map<String, Integer> counter = new HashMap<>();


        while (!input[0].equals("exam finished")) {
            String name = input[0];

            if (!input[1].equals("banned")) {
                String language = input[1];
                int points = Integer.parseInt(input[2]);

                if (!counter.containsKey(language)) {
                    counter.put(language, 1);
                } else {
                    counter.put(language, counter.get(language) + 1);
                }


                map1.put(name, language);

                if (map2.containsKey(name)) {
                    if (map2.get(name) < points) {
                        map2.put(name, points);
                    }
                } else {
                    map2.put(name, points);
                }


            } else {
                if (map1.containsKey(name)) {
                    map1.remove(name);
                    map2.remove(name);
                }

            }
            input = scanner.nextLine().split("-");
        }

        Map<String, Integer> result = map2.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));



        System.out.println("Results:");
        result.forEach((key, value) -> System.out.println(key + " | " + value));
        System.out.println("Submissions:");
        counter.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
