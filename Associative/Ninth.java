package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ninth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Map<String, String> lightWay = new HashMap<>();
        Map<String , String> darkWay = new HashMap<>();


        while (!input.equals("Lumpawaroo")){


            if (input.contains(" -> ")){

                String[] thisString = input.split(" -> ");


                if (thisString[1].equals("Light") || thisString[1].equals("Lighter")){

                    if (darkWay.containsKey(thisString[1]) || lightWay.containsKey(thisString[0])){
                        lightWay.put(thisString[1], thisString[0]);
                    }else {
                        lightWay.put(thisString[1], thisString[0]);
                        System.out.printf("%s joins the Lighter side!" , thisString[0]);
                    }

                }else if (thisString[0].equals("Dark") || thisString[0].equals("Darker")){

                    if (darkWay.containsKey(thisString[0])){
                        darkWay.put(thisString[0] , thisString[1]);
                    }else {
                        darkWay.put(thisString[0] , thisString[1]);
                        System.out.printf("%s joins the Darker side!" , thisString[0]);
                    }


                }


            } else if (input.contains(" | ")){

                String[] thisString = input.split(" \\| ");

                if (thisString[0].equals("Light") || thisString[0].equals("Lighter")){
                    lightWay.put(thisString[0], thisString[1]);

                }else if (thisString[0].equals("Dark") || thisString[0].equals("Darker")){
                    darkWay.put(thisString[0] , thisString[1]);


                }


            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> stringStringEntry : darkWay.entrySet()) {
            System.out.println(stringStringEntry);
        }
        for (Map.Entry<String, String> stringStringEntry : lightWay.entrySet()) {
            System.out.println(stringStringEntry);
        }

    }
}
