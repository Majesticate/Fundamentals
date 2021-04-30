package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = ">>\\b(?<Item>[A-Za-z]+)<<\\b(?<Price>[\\d]+.*[\\d])*!(?<Quantity>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> list = new ArrayList<>();

        double sum = 0;

        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String item = matcher.group("Item");
                double price = Double.parseDouble(matcher.group("Price"));
                int quantity = Integer.parseInt(matcher.group("Quantity"));

                list.add(item);

                sum += price * quantity;

            }



            input = scanner.nextLine();
        }


        System.out.println("Bought furniture:");
        list.forEach(e -> System.out.println(e));
        System.out.printf("Total money spend: %.2f" , sum);

    }
}
