import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<Day>[\\d]{2})([\\.\\/\\-])(?<Month>[A-Z][a-z]{2})\\2(?<Year>([0-9]{4}))\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            String day = matcher.group("Day");
            String month = matcher.group("Month");
            String year = matcher.group("Year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n" , day , month ,year);
        }




    }
}
