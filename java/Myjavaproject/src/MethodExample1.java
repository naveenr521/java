import java.util.Scanner;

public class MethodExample1 {

    public static int checkEvenOrOdd(int number) {

        if (number % 2 == 0) {
            System.out.println("Entered number is Even  ");
        } else {
            System.out.println("Entered number is ODD ");
        }
        return number;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number :");
        int number = sc.nextInt();

         checkEvenOrOdd(number);
       // System.out.println(result);
        sc.close();
    }
}
