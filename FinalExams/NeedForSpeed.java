package com.company;

import java.util.*;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> modelDistance = new TreeMap<>();
        Map<String, Integer> modelFuel = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String model = input[0];
            int distance = Integer.parseInt(input[1]);
            int fuel = Integer.parseInt(input[2]);

            modelDistance.put(model, distance);
            modelFuel.put(model, fuel);
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] array = input.split(" : ");
            String command = array[0];
            String model = array[1];

            switch (command) {

                case "Drive":
                    int distance = Integer.parseInt(array[2]);
                    int fuel = Integer.parseInt(array[3]);

                    if (modelFuel.containsKey(model)) {
                        if (modelFuel.get(model) > fuel) {
                            modelDistance.put(model, modelDistance.get(model) + distance);
                            modelFuel.put(model, modelFuel.get(model) - fuel);
                            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", model, distance, fuel);
                            if (modelDistance.get(model) > 100000) {
                                System.out.printf("Time to sell the %s!%n", model);
                                modelDistance.remove(model);
                                modelFuel.remove(model);
                            }
                        } else {
                            System.out.printf("Not enough fuel to make that ride%n");
                        }
                    }

                    break;
                case "Refuel":
                    int refuel = Integer.parseInt(array[2]);

                    if (modelFuel.containsKey(model)) {
                        int fuelAndRefuel = modelFuel.get(model) + refuel;
                        int oldFuel = modelFuel.get(model);
                        if (fuelAndRefuel <= 75) {
                            modelFuel.put(model , fuelAndRefuel);
                            System.out.printf("%s refueled with %d liters%n", model, refuel);
                        } else {
                            int sum = Math.abs(75 - oldFuel);
                            System.out.printf("%s refueled with %d liters%n", model, sum);
                            modelFuel.put(model , 75);
                        }
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(array[2]);

                    if (modelDistance.containsKey(model)) {
                        if (modelDistance.get(model) - kilometers >= 10000) {
                            modelDistance.put(model, modelDistance.get(model) - kilometers);
                            System.out.printf("%s mileage decreased by %d kilometers%n", model, kilometers);
                        } else {
                            modelDistance.put(model, 10000);
                        }
                    }
                    break;
            }


            input = scanner.nextLine();
        }

        modelDistance.entrySet().stream()
                .sorted(((o1, o2) -> o2.getValue().compareTo(o1.getValue())))
                .forEach(model -> {
                    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n" , model.getKey() , model.getValue() , modelFuel.get(model.getKey()));
                });


        /*
        for (Map.Entry<String, Integer> stringIntegerEntry : modelFuel.entrySet()) {
            System.out.printf("%s -> %d fuel%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : modelDistance.entrySet()) {
            System.out.printf("%s -> %d distance%n", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }

         */

    }
}

