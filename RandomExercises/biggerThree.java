import java.util.Scanner;

public class biggerThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxNumber = Integer.MIN_VALUE;

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num3 = Double.parseDouble(scanner.nextLine());


        if (maxNumber <= num1) {
            maxNumber = num1;
        }
        if (maxNumber <= num2) {
            maxNumber = num2;
        }
        if (maxNumber <= num3) {
            maxNumber = num3;
        }


        if (Math.floor(maxNumber) == maxNumber ) {
            System.out.printf("%.0f", maxNumber);
        }else {
            System.out.println(maxNumber);
        }
    }
}
