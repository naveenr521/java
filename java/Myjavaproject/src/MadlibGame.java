import java.util.Scanner;

public class MadlibGame {

    public static void main(String[] args) {

        String pronoun1;
        String adjective1;
        String pronoun2;
        String adjective2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first pronoun: ");
        pronoun1 = sc.next();

        System.out.print("Enter the first adjective: ");
        adjective1 = sc.next();

        System.out.print("Enter the second pronoun: ");
        pronoun2 = sc.next();

        System.out.print("Enter the second adjective: ");
        adjective2 = sc.next();

        System.out.println("\n" + pronoun1 + " found a " + adjective1 + " box buried under a tree.");
        System.out.println("It " + adjective2 + "ly whispered secrets only " + pronoun2 + " could hear.");
    }
}
