package com.company;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        printTheProcess(input, firstNum, secondNum);
    }

    private static void printTheProcess(String input, int firstNum, int secondNum) {

        if (input.equals("add")) {
            addMethod(firstNum, secondNum);
        } else if (input.equals("divide")) {
            divideMethod(firstNum, secondNum);
        } else if (input.equals("subtract")) {
            subtractMethod(firstNum, secondNum);
        } else if (input.equals("multiply")) {
            multiplyMethod(firstNum, secondNum);
        }

    }

    private static void multiplyMethod(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    private static void subtractMethod(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    private static void divideMethod(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }

    private static void addMethod(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }
}
