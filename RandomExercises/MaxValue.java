import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeats = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= repeats ; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (num > maxNum){
                maxNum = num;
            }
        }
        System.out.println(maxNum);
    }
}
