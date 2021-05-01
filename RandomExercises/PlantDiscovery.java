package com.company;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String name = input[0];
            double rarity = Double.parseDouble(input[1]);

            List<Double> list = new LinkedList<>();
            list.add(0, rarity);
            list.add(1, 0.0);

            map.put(name, list);

        }

        String input = scanner.nextLine();
        while (!input.equals("Rate")) {
            String[] inputAsArray = input.split(" ");
            String command = inputAsArray[0];
            switch (command){
                case "Rate:":

                    break;

                case "Update:":

                    break;

                case "Reset":

                    break;



            }


            input = scanner.nextLine();
        }

    }
}
