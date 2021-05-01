package com.company;

import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biscuitPerDay = Integer.parseInt(scanner.nextLine());
        int workersInFactory = Integer.parseInt(scanner.nextLine());
        int amountBiscuitFor30Days = Integer.parseInt(scanner.nextLine());

        int month = 30;

        int biscuitForNow = 0;

        for (int i = 1; i <= month; i++) {
            if (i % 3 == 0){
                biscuitForNow += (biscuitPerDay * workersInFactory) * 0.75;
            }else {
                biscuitForNow += biscuitPerDay * workersInFactory;
            }

        }

        System.out.printf("You have produced %d biscuits for the past month.%n" , biscuitForNow);
        if (biscuitForNow > amountBiscuitFor30Days) {
            double percentage =((1.0 * biscuitForNow / amountBiscuitFor30Days) * 100) -100;
            System.out.printf("You produce %.2f percent more biscuits." , percentage);
        } else {
            double percentage =((1.0 * biscuitForNow / amountBiscuitFor30Days) * 100) - 100;
            System.out.printf("You produce %.2f percent less biscuits." , Math.abs(percentage));
        }


    }
}
