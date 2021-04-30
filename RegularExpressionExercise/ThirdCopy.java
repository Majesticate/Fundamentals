package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<customer>[A-Z][a-z]+)%([^\\$\\|\\%\\.0-9]*)<(?<product>[A-Za-z]+)>([^\\$\\|\\%\\.0-9]*)\\|(?<quantity>[0-9]+)\\|([^\\$\\|\\%\\.0-9]*)(?<price>[0-9]+.*[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        double sum = 0.0;
        String input = scanner.nextLine();
        while (!"end of shift".equals(input)) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                sum += quantity * price;
                System.out.printf("%s: %s - %.2f%n", customer, product, quantity * price);
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", sum);
    }
}

