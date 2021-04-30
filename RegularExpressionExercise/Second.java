package com.company;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", ");

        String input = scanner.nextLine();

        Pattern patternName = Pattern.compile("[A-Za-z]");
        Pattern patternNumbers = Pattern.compile("[0-9]");


        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> list = new ArrayList<>();

        for (String name : names) {
            map.put(name, 0);
            list.add(name);
        }


        while (!input.equals("end of race")) {
            Matcher matcherName = patternName.matcher(input);
            StringBuilder nameBuilder = new StringBuilder();
            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }

            Matcher matcherNumbers = patternNumbers.matcher(input);
            int numberBuilder = 0;
            while (matcherNumbers.find()) {
                numberBuilder += Integer.parseInt(matcherNumbers.group());
            }

            if (list.contains(nameBuilder.toString())) {
                map.put(nameBuilder.toString(), map.get(nameBuilder.toString()) + numberBuilder);
            }

            input = scanner.nextLine();
        }

        Map<String, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        List<String> listche = new LinkedList<>(result.keySet());

        System.out.printf("1st place: %s%n" , listche.get(0));
        System.out.printf("2nd place: %s%n" , listche.get(1));
        System.out.printf("3rd place: %s" , listche.get(2));


    }
}
