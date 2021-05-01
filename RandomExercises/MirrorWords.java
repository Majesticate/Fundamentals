package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        String pat = "(?<symbol>[@#])(?<word>[A-Za-z]{3,})\\1";
        Pattern firstPattern = Pattern.compile(pat);
        Matcher firstMatcher = firstPattern.matcher(input);

        Pattern secondPattern = Pattern.compile("");


    }
}
