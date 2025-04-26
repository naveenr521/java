import java.util.Scanner;

public class EnhancedSwith {

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of week : ");
        String day = sc.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday" -> System.out.println("It is a Weekday ");
            case "Saturday", "Sunday" -> System.out.println("It is a Weekend");

            default -> System.out.println(day + "is not a week day ");
        }
    }
}
