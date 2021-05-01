package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern patternText = Pattern.compile("([:*])\\1[A-Z][a-z][a-z]+\\1\\1");
        Matcher matcherText = patternText.matcher(input);


        Pattern patternNum = Pattern.compile("[\\d]");
        Matcher matcherNum = patternNum.matcher(input);

        long finalNum = 1;
        int countFoundedWords = 0;

        while (matcherNum.find()){
            finalNum *= Integer.parseInt(matcherNum.group());
        }

        List<String> words = new LinkedList<>();


        while (matcherText.find()){
            countFoundedWords++;
            String wordStartPosition = matcherText.group();
            String word = matcherText.group();
            if (word.contains(":")){
                word = word.replaceAll(":" , "");
            }else if (word.contains("*")){
                word = word.replaceAll("\\*" , "");
            }
            int tresHoldOfWord = 0;
            for (int i = 0; i < word.length(); i++) {
                int intChar = word.charAt(i);
                tresHoldOfWord += intChar;
            }

            if (tresHoldOfWord >= finalNum){
                words.add(wordStartPosition);
            }


        }
        System.out.printf("Cool threshold: %d%n" , finalNum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n" , countFoundedWords);
        if (!words.isEmpty()){
            words.forEach(System.out::println);
        }

    }
}
