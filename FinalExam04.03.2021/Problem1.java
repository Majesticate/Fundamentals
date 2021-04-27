    package com.company;

    import java.util.Scanner;

    public class Problem1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            StringBuilder word = new StringBuilder(scanner.nextLine());

            String input = scanner.nextLine();

            while (!input.equals("End")) {
                String[] inputAsArray = input.split(" ");
                String command = inputAsArray[0];

                switch (command) {
                    case "Translate":
                        String replace = inputAsArray[1];
                        String replaceWith = inputAsArray[2];

                        String s = word.toString().replaceAll(replace, replaceWith);
                        word.delete(0, word.length());
                        word.append(s);
                        System.out.println(word);

                        break;

                    case "Includes":
                        String text = inputAsArray[1];
                        if (word.toString().contains(text)) {
                            System.out.println("True");
                        } else {
                            System.out.println("False");
                        }

                        break;

                    case "Start":
                        String text1 = inputAsArray[1];
                        String subString = word.substring(0 , text1.length() -1);
                        if (text1.compareTo(subString) == 1){
                            System.out.println("True");
                        }else {
                            System.out.println("False");
                        }

                        break;

                    case "Lowercase":
                        String word1 = word.toString().toLowerCase();
                        word.delete(0, word.length());
                        word.append(word1);
                        System.out.println(word);

                        break;

                    case "FindIndex":
                        String myChar = inputAsArray[1];

                        int sad = word.toString().lastIndexOf(myChar);
                        System.out.println(sad);


                        break;

                    case "Remove":
                        int firstNum = Integer.parseInt(inputAsArray[1]);
                        int secondNum = Integer.parseInt(inputAsArray[2]);

                        word.replace(firstNum , secondNum , "");

                        System.out.println(word);


                        break;


                }


                input = scanner.nextLine();
            }
        }
    }
