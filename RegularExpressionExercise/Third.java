package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String notMyRegex = "%(?<customer>[A-Z][a-z]+)%([^\\$\\|\\%\\.0-9]*)<(?<product>[A-Za-z]+)>([^\\$\\|\\%\\.0-9]*)\\|(?<quantity>[0-9]+)\\|([^\\$\\|\\%\\.0-9]*)(?<price>[0-9]+.*[0-9]*)\\$";

        String regex = "%(?<name>[A-Z][a-z]+)%<(?<product>[A-Z][a-z]+)>\\|(?<quantity>[\\d]+)\\|(?<price>[\\d]+.*[\\d]+)[$]";
        Pattern pattern = Pattern.compile(notMyRegex);

        String input = scanner.nextLine();
        double totalIncome = 0;
        while (!input.equals("end of shift")){
            double currentIncome = 0;
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String name = matcher.group("customer");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                currentIncome += quantity * price;
                totalIncome += quantity * price;

                System.out.printf("%s: %s - %.2f%n" , name ,product , currentIncome);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f" , totalIncome);

    }
}
