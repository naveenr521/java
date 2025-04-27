import java.util.Scanner;

public class WhileLoop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number = 0;
        System.out.println("Enter a number :");
        number = sc.nextInt();

        while (number < 18 || number > 100) {
            System.out.println("Invalid number! Please enter a number between 18 and 100:");
            number = sc.nextInt();
        }

        System.out.println("Your entered valid number: " + number);

        sc.close();
    }
}
