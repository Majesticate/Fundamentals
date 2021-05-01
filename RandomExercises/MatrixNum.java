import java.util.Scanner;

public class MatrixNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int count = num;

        for (int i = 1; i <= num ; i++){
            for (int j =i ; j<= count;j++){
                System.out.printf("%d " , j);
            }
            count++;
            System.out.printf("%n");
        }
    }
}
