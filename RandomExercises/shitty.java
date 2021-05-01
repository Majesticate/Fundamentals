import java.util.Scanner;

public class shitty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        num /=2;
        num /=2;
        System.out.println(2);
        System.out.println(2);
        while (num >= 0){
            if(num >= 25){
                num /=5;
                System.out.println(5);
            }else if(num >= 20){
                num /=4;
                System.out.println(4);
            }else if (num >= 12){
                num /=3;
                System.out.println(3);
            }else if (num >= 5){
                num /=5;
                System.out.println(5);
            }else if (num >= 4){
                num /=4;
                System.out.println(4);
            }else if (num >= 3){
                num /=3;
                System.out.println(3);
            }else if (num >= 2){
                num /=2;
                System.out.println(2);
            }
            if (num == 1){
                break;
            }
        }
    }
}
