package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<element>[>=\\/])(?<destination>[A-Za-z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);

        int sumOfAllDestination = 0;

        List<String> matches = new LinkedList<>();

        while (matcher.find()){
            sumOfAllDestination += matcher.group("destination").length();
            matches.add(matcher.group("destination"));
        }

        System.out.print("Destinations:");
        String names = String.join(", " , matches);
        if (!names.equals("")) {
            System.out.print(" ");
            System.out.print(names);
        }
        System.out.println();
        System.out.printf("Travel Points: %d" , sumOfAllDestination);
    }
}
