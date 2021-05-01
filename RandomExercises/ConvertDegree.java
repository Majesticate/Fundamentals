import java.util.Scanner;

public class ConvertDegree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String line = scanner.nextLine();

        String[] elements = line.split(" ");

        int[] numbers = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);

            double num = numbers[i] * 1.8 + 32;

            System.out.printf("%.0f%n", Math.abs(num));

        }
    }
}
