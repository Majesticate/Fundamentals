package com.company;

import java.util.*;

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeats = Integer.parseInt(scanner.nextLine());

        List<String> myList = new ArrayList<>();

        for (int i = 0; i < repeats; i++) {
            String input = scanner.nextLine();

            myList.add(input);
        }

        Collections.sort(myList);

        for (int i = 0; i < myList.size(); i++) {
            System.out.printf("%d.%s%n" ,i+1, myList.get(i));
        }
    }
}
