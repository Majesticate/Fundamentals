package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Pattern pattern = Pattern.compile("^([%$])(?<name>[A-Z][a-z]{2,})\\1: \\[(?<firstNumber>\\d+)]\\|\\[(?<secondNumber>\\d+)]\\|\\[(?<thirdNumber>\\d+)]\\|$");

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String name = matcher.group("name");
                int number = Integer.parseInt(matcher.group("firstNumber"));
                int number2 = Integer.parseInt(matcher.group("secondNumber"));
                int number3 = Integer.parseInt(matcher.group("thirdNumber"));

                char firstChar = (char) number;
                char secondChar = (char) number2;
                char third = (char) number3;

                System.out.print(name + ": ");
                System.out.print(String.valueOf(firstChar) + secondChar + third);
                System.out.println();



            }else {
                System.out.println("Valid message not found!");
            }


        }

    }
}
