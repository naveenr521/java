import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int number = 0;
        do {
            System.out.println("Enter a number between 10 and 100 :");
            number = sc.nextInt();

            if (number < 10 || number > 100) {
                System.out.println("Invalid number! Please try Again !  ");
                number = sc.nextInt();
            }
        }
        while (number < 10 || number > 100);

        System.out.println("Your entered valid number: " + number);

        sc.close();

    }
}
