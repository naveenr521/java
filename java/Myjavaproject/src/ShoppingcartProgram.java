import java.util.Scanner;

public class ShoppingcartProgram {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = 0;
        double total;

        System.out.println("What item would you like to buy ?");
        item= sc.next();

        System.out.println("What is the price for each ?:");
        price=sc.nextDouble();

        System.out.println("How many would you like ? : ");
        quantity=sc.nextInt();
total = price * quantity;
        System.out.println("You have bought " + quantity + " " + item + "s");
        System.out.println("Your total is " + currency + total);
    }
}
