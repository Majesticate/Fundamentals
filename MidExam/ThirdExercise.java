package com.company;

import java.util.*;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] cards = scanner.nextLine().split(":");

        List<String> allCards = new ArrayList<>();

        for (String card : cards) {
            allCards.add(card);
        }
        List<String> myNewCards = new ArrayList<>();


        String[] input = scanner.nextLine().split("\\s+");


        while (!input[0].equals("Ready")){
            switch (input[0]) {
                case "Add":
                    if (allCards.contains(input[1])){
                        myNewCards.add(input[1]);
                        allCards.remove(input[1]);
                        allCards.add(input[1]);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Insert":
                    if (allCards.contains(input[1])) {
                        int myIndex = 0;
                        for (int i = 0; i < myNewCards.size(); i++) {
                            if (myNewCards.get(i).equals(input[1])) {
                                myIndex = i;
                                break;
                            }
                        }
                        int number = Integer.parseInt(input[2]);
                        if (number >= 0 && number <= myNewCards.size()) {
                            myNewCards.add(number, input[1]);
                        } else {
                            System.out.println("Error!");
                        }
                    }else {
                        System.out.println("Error!");
                    }
                    break;
                case "Remove":
                    if (myNewCards.contains(input[1])){
                        myNewCards.remove(input[1]);
                    }else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Swap":
                    int firstStringPosition = 0;
                    int secondStringPosition = 0;
                    String firstString = input[1];
                    String secondString = input[2];
                    for (int i = 0; i < myNewCards.size(); i++) {
                        if (myNewCards.get(i).equals(firstString)){
                            firstStringPosition = i;
                        }
                        if (myNewCards.get(i).equals(secondString)){
                            secondStringPosition = i;
                        }
                    }
                    myNewCards.set(firstStringPosition , secondString);
                    myNewCards.set(secondStringPosition , firstString);
                    break;
                case "Shuffle":
                    Collections.reverse(myNewCards);
                    break;

            }
            input = scanner.nextLine().split("\\s+");
        }
        System.out.println(myNewCards.toString().replaceAll("[\\[\\],]" , ""));
    }
}
