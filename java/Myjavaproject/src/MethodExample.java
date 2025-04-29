import java.util.Scanner;

public class MethodExample {


    public static int addNumbers(int a, int b) {

        int sum = a + b;

        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the the 1st number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the 2nd number : ");
        int num2 = sc.nextInt();
        int result = addNumbers(num1, num2);

        System.out.println("The sum is : " + result);
        sc.close();
        ;
    }
}
