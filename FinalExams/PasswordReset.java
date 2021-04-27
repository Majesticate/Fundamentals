package com.company;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());


        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] array = input.split(" ");
            String command = array[0];

            switch (command) {
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 1; i < password.length(); i++) {
                        if (i % 2 == 1) {
                            char currentChar = password.charAt(i);
                            newPassword.append(currentChar);
                        }
                    }
                    password = newPassword;
                    System.out.println(password);

                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(array[1]);
                    int lengthToDelete = Integer.parseInt(array[2]);

                    password.delete(startIndex , startIndex+ lengthToDelete);

                    System.out.println(password);
                    break;


                case "Substitute":
                    String replace = array[1];
                    String toReplace = array[2];

                    if (password.toString().contains(replace)){
                        String newPass = password.toString().replaceAll(replace , toReplace);
                        password.replace(0 ,password.length() , newPass);
                        System.out.println(password);
                    }else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s" , password);
    }
}
