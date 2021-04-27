import java.util.Arrays;
import java.util.Scanner;

public class Arrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;


        int[] arrayList = new int[numbers.length-1];

        for (int i = 0; i < numbers.length - 1 ; i++) {
            int num = 0;


            sum += numbers[i] + numbers[i+1];

            num = numbers[i] + numbers[i+1];




        }
        System.out.println();
    }
}
