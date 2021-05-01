package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", "  +"\\s+");


        List<String> people = new ArrayList<>();

        int blackListCount = 0;
        int lostListCount = 0;

        for (String name : names) {
            people.add(name);
        }

        String[] input = scanner.nextLine().split("\\s+");

        while (!input[0].equals("Report")) {

            switch (input[0]) {
                case "Blacklist":
                    int index = 0;
                    for (int i = 0; i < people.size(); i++) {
                        if (people.get(i).equals(input[1])){
                            index = i;
                            break;
                        }
                    }
                    if (people.contains(input[1])){
                        blackListCount ++;
                        System.out.printf("%s was blacklisted.%n" , input[1]);
                        people.set(index , "Blacklisted");
                    } else {
                        System.out.printf("%s was not found.%n" , input[1]);
                    }
                    break;
                case "Error":
                    int peopleAtIndex = Integer.parseInt(input[1]);
                    if (people.get(peopleAtIndex).equals("Blacklisted") || people.get(peopleAtIndex).equals("Lost")){
                        break;
                    } else {
                        System.out.printf("%s was lost due to an error.%n" , people.get(peopleAtIndex));
                        people.set(peopleAtIndex , "Lost");
                        lostListCount++;
                    }

                    break;
                case "Change":
                    int number = Integer.parseInt(input[1]);
                    if (number >= 0 && number <= people.size()){
                        String currentName = people.get(number);
                        people.set(number, input[2]);
                        System.out.printf("%s changed his username to %s.%n" ,currentName ,people.get(number));
                    }
                    break;
            }
            input = scanner.nextLine().split("\\s+");
        }

        System.out.printf("Blacklisted names: %d%n" , blackListCount);
        System.out.printf("Lost names: %d%n" , lostListCount);

        System.out.println(people.toString().replaceAll("[\\[\\],]" , ""));

    }
}
