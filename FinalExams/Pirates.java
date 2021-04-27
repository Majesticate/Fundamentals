package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String inputCities = scanner.nextLine();

        Map<String, Integer> cityCitizen = new LinkedHashMap<>();
        Map<String, Integer> cityGold = new LinkedHashMap<>();

        while (!inputCities.equals("Sail")) {
            String[] array = inputCities.split("\\|\\|");
            String nameOfCity = array[0];
            int citizen = Integer.parseInt(array[1]);
            int gold = Integer.parseInt(array[2]);

            if (!cityCitizen.containsKey(nameOfCity)) {
                cityCitizen.put(nameOfCity, citizen);
            } else {
                cityCitizen.put(nameOfCity, cityCitizen.get(nameOfCity) + citizen);
            }

            if (!cityGold.containsKey(nameOfCity)) {
                cityGold.put(nameOfCity, gold);
            } else {
                cityGold.put(nameOfCity, cityGold.get(nameOfCity) + gold);
            }
            inputCities = scanner.nextLine();
        }

        String inputCommands = scanner.nextLine();

        int countCities = 0;


        while (!inputCommands.equals("End")) {

            countCities++;

            String[] array = inputCommands.split("=>");
            String command = array[0];
            String city = array[1];

            switch (command) {
                case "Plunder":
                    int killedPeople = Integer.parseInt(array[2]);
                    int takenGold = Integer.parseInt(array[3]);

                    if (cityGold.containsKey(city)) {
                        if (cityGold.get(city) - takenGold >= 0) {
                            cityGold.put(city, cityGold.get(city) - takenGold);
                            System.out.printf("Tortuga plundered! %d gold stolen," ,takenGold);
                        } else {
                            cityGold.remove(city);
                            System.out.printf("%s has been wiped off the map!", city);
                            countCities--;
                        }
                    }


                    if (cityCitizen.containsKey(city)) {
                        if (cityCitizen.get(city) - killedPeople >= 0) {
                            cityCitizen.put(city, cityCitizen.get(city) - killedPeople);
                            System.out.printf(" %d citizens killed.%n" , killedPeople);
                        } else {
                            cityCitizen.remove(city);
                            System.out.printf("%s has been wiped off the map!%n", city);
                            countCities--;
                        }
                        if (cityCitizen.get(city) == 0 || cityGold.get(city) == 0){
                            System.out.printf("%s has been wiped off the map!%n", city);
                            countCities--;
                            cityCitizen.remove(city);
                            cityGold.remove(city);
                        }
                    }


                    break;
                case "Prosper":
                    int addGold = Integer.parseInt(array[2]);

                    if (addGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    }

                    if (cityGold.containsKey(city)) {
                        cityGold.put(city, cityGold.get(city) + addGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.", addGold , city , cityGold.get(city) );
                    }
                    break;
            }


            inputCommands = scanner.nextLine();
        }



        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n" , countCities);

        Map<String, Integer> collect = cityGold.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));



    }
}
