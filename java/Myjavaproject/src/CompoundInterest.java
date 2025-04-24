import java.util.Scanner;

public class CompoundInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principle amount: ");
        principle = sc.nextDouble();

        System.out.print("Enter the rate of interest: ");
        rate = sc.nextDouble() / 100;

        System.out.print("Enter the times compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.print("Enter the number of years: ");
        years = sc.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is: $ %.2f\n", years, amount);

        sc.close();
    }
}
