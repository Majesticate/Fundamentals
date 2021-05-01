package com.company;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder startTour = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] arrayInput = input.split(":");

            switch (arrayInput[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(arrayInput[1]);
                    String textToAdd = arrayInput[2];

                    startTour.insert(index, textToAdd);
                    System.out.println(startTour);

                    break;
                case "Remove Stop":
                    int startRemoveFrom = Integer.parseInt(arrayInput[1]);
                    int endRemoveFrom = Integer.parseInt(arrayInput[2]);
                    if (startRemoveFrom < startTour.length() && endRemoveFrom < startTour.length()) {
                        startTour.delete(startRemoveFrom, endRemoveFrom + 1);
                        System.out.println(startTour);
                    }
                    break;
                case "Switch":
                    String oldString = arrayInput[1];
                    String newString = arrayInput[2];

                    String newStr = startTour.toString().replace(oldString, newString);
                    startTour.replace(0, newStr.length() - 1, "");
                    startTour.append(newStr);
                    System.out.println(startTour);


                    break;
            }


            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", startTour);
    }
}