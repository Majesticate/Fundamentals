package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeats = Integer.parseInt(scanner.nextLine());

        Map<String, Double> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();


        for (int i = 0; i < repeats; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!map.containsKey(name)) {
                map2.put(name, 1);
                map.put(name, grade);
            } else {
                map2.put(name, map2.get(name) + 1);
                map.put(name, (map.get(name) + grade) / map2.get(name));
            }
        }

        for (Map.Entry<String, Double> stringDoubleEntry : map.entrySet()) {
            if (stringDoubleEntry.getValue() >= 4.50) {
                continue;
            } else {
                map.remove(stringDoubleEntry.getKey());
            }
        }

        Map<String, Double> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
//.thenComparing(Map.Entry.comparingByKey())

        result.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v));
    }
}