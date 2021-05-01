package com.company;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder word = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] arrayInput = input.split(":\\|:");
            String command = arrayInput[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(arrayInput[1]);
                    word.insert(index , " ");
                    System.out.println(word);

                    break;
                case "Reverse":
                    StringBuilder wordToReverse = new StringBuilder(arrayInput[1]);
                    String oldWord = arrayInput[1];
                    if (word.toString().contains(wordToReverse.toString())){
                        wordToReverse = wordToReverse.reverse();
                        String replacedWord = word.toString().replaceAll(oldWord , wordToReverse.toString());
                        word.delete(0 , word.length());
                        word.append(replacedWord);
                        System.out.println(word);
                    }else {
                        System.out.println("error");
                        break;
                    }

                    break;
                case "ChangeAll":
                    String iHaveToReplaceThis = arrayInput[1];
                    String replaceToThis = arrayInput[2];

                    String newWord = word.toString().replaceAll(iHaveToReplaceThis , replaceToThis);
                    word.delete(0 , word.length());
                    word.append(newWord);
                    System.out.println(word);
                    break;

            }


            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s" , word);


    }
}
