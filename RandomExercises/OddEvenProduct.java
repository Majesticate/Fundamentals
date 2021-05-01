import java.util.Scanner;

public class OddEvenProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeats = Integer.parseInt(scanner.nextLine());

        int evenSum = 1;
        int oddSum = 1;

        for (int i = 1 ; i <= repeats ; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0){
                evenSum *= num;
            }else {
                oddSum *=num;
            }
        }
        if (oddSum == evenSum){
            System.out.println("yes " + oddSum);
        } else {
            System.out.printf("no %d %d" , oddSum , evenSum);
        }
    }
}
