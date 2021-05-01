import java.util.Scanner;

public class LargestThreeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int repeats = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;


        for (int i = 1; i <= repeats ; i++){
            int x = Integer.parseInt(scanner.nextLine());

            if (x > maxNum){
                maxNum = x;
            }
        }
        System.out.println(maxNum);
    }
}
