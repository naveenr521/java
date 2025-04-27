import java.util.Scanner;

public class LogicalOperator {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int age;


        System.out.println("Enter the age : ");
        age = sc.nextInt();
        System.out.println(" Are you a citizen of the country ? (True/False )");
        boolean iscitizen = sc.nextBoolean();

        if (age >= 18 && iscitizen) {
            System.out.println("Your are elizible to vote ");
        }
        else {
            System.out.println("Your not elizible");
        }
        if (age < 18 || !iscitizen) {
            System.out.println("Reason : your either underagr or not a citizen ");
        }
        sc.close();

    }
}
