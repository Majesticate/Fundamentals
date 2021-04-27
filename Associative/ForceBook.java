package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Map<String,String> lightMap = new HashMap<>();
        Map<String,String> darkMap = new HashMap<>();

        //Lighter | Royal
        //Darker | DCay
        //Ivan Ivanov -> Lighter
        //DCay -> Lighter
        //Lumpawaroo


        while (!input.equals("Lumpawaroo")){

            if (input.contains(" | ")){
                String[] string = input.split(" \\| ");

                //string[1] == imeto
                //string[0] == side


                if (string[0].equals("Light") || string[0].equals("Lighter")) {

                    if (!lightMap.containsKey(string[1])) {
                        lightMap.put(string[1], string[0]);
                    } else {
                        lightMap.put(string[1], string[0]);
                    }
                }else if (string[0].equals("Dark") || string[0].equals("Darker")){

                    if (!darkMap.containsKey(string[1])) {
                        darkMap.put(string[1], string[0]);
                    } else {
                        darkMap.put(string[1], string[0]);
                    }
                }




            }else if (input.contains(" -> ")){
                String[] string = input.split(" -> ");

                //input[0] == imeto
                //input[1] == side

                if (string[1].equals("Light") || string[1].equals("Lighter")) {

                    if (lightMap.containsKey(string[0]) || darkMap.containsKey(string[0])){
                        lightMap.put(string[0],string[1]);
                        if (darkMap.containsKey(string[0])){
                            darkMap.remove(string[0]);
                        }

                    }else {
                        lightMap.put(string[0], string[1] );

                    }
                    System.out.printf("%s joins the Lighter side!%n" , string[0]);

                }else if (string[0].equals("Dark") || string[0].equals("Darker")){

                    if (darkMap.containsKey(string[0]) || lightMap.containsKey(string[0])){
                        darkMap.put(string[0], string[1] );
                        if (lightMap.containsKey(string[0])){
                            lightMap.remove(string[0]);
                        }
                    }else {
                        darkMap.put(string[0], string[1] );
                    }


                }

            }


            input = scanner.nextLine();
        }



    }
}
