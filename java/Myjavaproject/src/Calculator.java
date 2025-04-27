import java.util.Scanner;

public class Calculator {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.println("Enter the num1 : ");
        num1 = sc.nextDouble();

        System.out.println("Enter the operator (+,-,*,/,^)");
        operator = sc.next().charAt(0);

        System.out.println("Enter the num2 : ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("cannot divisible by zero ");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator !");
                validOperation = false;
            }

        }
        if (validOperation) {
            System.out.println(result);
        }
        sc.close();
    }
}
