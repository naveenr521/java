import java.util.Scanner;

public class Userinput {

    public static void main(String args[]){
        int s1 ;
        int s2;
        int Area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side1 of a square : ");
        s1=sc.nextInt();
        System.out.println("Enter the side2 of a square :");
        s2=sc.nextInt();

        Area=s1*s2;

        System.out.println("Area of a square is : " +Area);





    }
}
