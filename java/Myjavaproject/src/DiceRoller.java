import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the # of dice to roll: ");
        int numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            int total = 0;

            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(6) + 1;
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
           System.out.println("Total: " + total);
        } else {
            System.out.println("# of dice must be greater than 0");
        }

        scanner.close();
    }

    static void printDie(int roll) {
        String[] diceFaces = {
                """
             -------
            |       |
            |   ●   |
            |       |
             -------
            """,
                """
             -------
            | ●     |
            |       |
            |     ● |
             -------
            """,
                """
             -------
            | ●     |
            |   ●   |
            |     ● |
             -------
            """,
                """
             -------
            | ●   ● |
            |       |
            | ●   ● |
             -------
            """,
                """
             -------
            | ●   ● |
            |   ●   |
            | ●   ● |
             -------
            """,
                """
             -------
            | ●   ● |
            | ●   ● |
            | ●   ● |
             -------
            """
        };

        if (roll >= 1 && roll <= 6) {
            System.out.print(diceFaces[roll - 1]);
        } else {
            System.out.println("Invalid roll");
        }
    }
}
