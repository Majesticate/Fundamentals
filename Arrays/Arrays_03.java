import java.util.Arrays;
import java.util.Scanner;

public class Arrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countSum = 0;

        for (int i = 0; i < firstArray.length ; i++){

            if (firstArray[i] % 2 == 0){
                countSum += firstArray[i];
            }
        }
        System.out.println(countSum);

    }
}
