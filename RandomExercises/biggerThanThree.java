import java.util.Scanner;

public class biggerThanThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num3 = Double.parseDouble(scanner.nextLine());


        if (num1 >= num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 >= num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 >= num1 && num3 > num2) {
            System.out.println(num3);
        }
        if (num1 == num2 && num1 == num3) {
            System.out.println(num1);
        }
    }
}
