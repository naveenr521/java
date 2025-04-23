import java.util.Scanner;

public class MathExample1 {


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a;
        double b;

        double c;


        System.out.println("Enter value of a : ");
        a=sc.nextDouble();
        System.out.println("Enter value of b : ");

        b=sc.nextDouble();


        c=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("side of hypotonous triangle is : " + c);
    }
}
