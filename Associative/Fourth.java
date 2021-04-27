package com.company;

import java.util.*;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =scanner.nextLine();

        Map<String, Double> namePrice = new LinkedHashMap<>();
        Map<String, Integer> nameQuantity = new LinkedHashMap<>();


        while (!input.equals("buy")){
            String[] info = input.split(" ");

            String name = info[0];
            double price = Double.parseDouble(info[1]);
            int quantity = Integer.parseInt(info[2]);

            namePrice.put(name , price);

            if (!nameQuantity.containsKey(name)){
                nameQuantity.put(name , quantity);
            }else {
                nameQuantity.put(name , nameQuantity.get(name) + quantity);
            }

            input = scanner.nextLine();
        }


        for (Map.Entry<String , Double> entry: namePrice.entrySet()) {
            String name = entry.getKey();
            double finalPrice = entry.getValue() * nameQuantity.get(name);
            System.out.printf("%s -> %.2f%n" , name , finalPrice);
        }
    }
}
