package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger numbers = new BigInteger(scanner.nextLine());
        BigInteger number = new BigInteger(scanner.nextLine());


        BigInteger bigProduct = numbers.multiply(number);


        System.out.printf("%d " , bigProduct);


    }
}
