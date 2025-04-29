import java.util.Scanner;

public class BankingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("****************");
            System.out.println("Banking System");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    if (amount > 0) {
                        balance += amount;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Amount withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                }
                case 4 -> {
                    isRunning = false;
                    System.out.println("Thank you for using the Banking System.");
                }
                default -> System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }


    static void showBalance(double balance) {
        System.out.printf("Current Balance: $%.2f%n", balance);
    }
}
