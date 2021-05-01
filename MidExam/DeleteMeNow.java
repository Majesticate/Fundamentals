package com.company;

import java.util.*;

public class DeleteMeNow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());

        String[] array = String.valueOf(input).split("");

        List<String> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {

            list.add(array[i]);
        }
        Collections.reverse(list);

        System.out.println(list.toString().replaceAll("[\\[\\],]" ,"").replace(" " , ""));


        
    }
}
