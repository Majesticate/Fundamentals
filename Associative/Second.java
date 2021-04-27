package com.company;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<String , Integer> map = new LinkedHashMap<>();

        while (!text.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!map.containsKey(text)){
                map.put(text , quantity);
            }else {
                map.put(text , map.get(text) + quantity);
            }

            text = scanner.nextLine();
        }

        map.forEach((s , i) -> System.out.println(s + " -> " + i));
    }
}
