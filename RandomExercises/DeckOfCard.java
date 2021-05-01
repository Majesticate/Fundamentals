import java.util.Scanner;

public class DeckOfCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        if (number > 2) {
            for (int i = 2; i <= number; i++) {
                System.out.printf("%d of spades, %d of clubs, %d of hearts, %d of diamonds%n", i, i, i, i);
            }
        }else {
            System.out.printf("1 of spades, 1 of clubs, 1 of hearts, 1 of diamonds%n");
        }
    }
}