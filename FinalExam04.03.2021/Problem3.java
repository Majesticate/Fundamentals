package com.company;

import java.util.*;


public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> map = new LinkedHashMap<>();


        while (!input.equals("Statistics")) {
            String[] inputAsArray = input.split("->");
            String command = inputAsArray[0];
            String userName = inputAsArray[1];

            switch (command) {
                case "Add":
                    if (!map.containsKey(userName)) {
                        map.put(userName, new ArrayList<>());
                    } else {
                        System.out.printf("%s is already registered%n", userName);
                    }

                    break;

                case "Send":
                    if (map.containsKey(userName)) {
                        String text = inputAsArray[2];
                        map.get(userName).add(text);
                    }

                    break;

                case "Delete":
                    if (map.containsKey(userName)) {
                        map.remove(userName);

                    } else {
                        System.out.printf("%s not found!%n", userName);
                    }

                    break;
            }
            input = scanner.nextLine();
        }


        System.out.printf("Users count: %d%n", map.size());

        if (!map.isEmpty()) {
            map
                    .entrySet()
                    .stream()
                    .sorted((a, b) -> b.getValue().size() - a.getValue().size())
                    .forEach(pair -> {
                        System.out.println(pair.getKey());
                        pair.getValue().forEach(el -> System.out.printf(" - %s%n", el));
                    });
        }
    }
}
