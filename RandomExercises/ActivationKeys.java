package com.company;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();


        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] arrayList = input.split(">>>");
            String command = arrayList[0];

            switch (command) {
                case "Contains":
                    String isContainsWord = arrayList[1];
                    if (text.contains(isContainsWord)){
                        System.out.printf("%s contains %s" , text , isContainsWord);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String isUpperOrLower = arrayList[1];
                    int startFromThere = Integer.parseInt(arrayList[2]);
                    int endThere = Integer.parseInt(arrayList[3]);
                    switch (isUpperOrLower){
                        case "Upper":
                            String upperCase = text.substring(startFromThere, endThere).toUpperCase();
                            text = text.replaceAll(text.substring(startFromThere ,endThere) , upperCase);
                            System.out.println(text);
                            break;
                        case "Lower":
                            String lowerCase = text.substring(startFromThere, endThere).toLowerCase();
                            text = text.replaceAll(text.substring(startFromThere ,endThere) , lowerCase);
                            System.out.println(text);
                            break;
                    }
                    break;
                case "Slice":
                    String replace1 = text;
                    String replace2 = text;
                    int startIndex = Integer.parseInt(arrayList[1]);
                    int finalIndex = Integer.parseInt(arrayList[2]);
                    StringBuilder stringBuilder = new StringBuilder();

                    replace1 = replace1.substring(0 , startIndex);
                    replace2 = replace2.substring(finalIndex , replace2.length());

                    stringBuilder.append(replace1).append(replace2);
                    text = stringBuilder.toString();
                    System.out.println(text);


            }


            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s" , text);
    }
}


// 53 / 100 tochki ...
