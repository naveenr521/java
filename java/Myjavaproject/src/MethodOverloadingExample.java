import java.util.Scanner;

public class MethodOverloadingExample {

   public int add(int a,int b){
       int sum =a+b;
       return sum;
   }
   public int add(int a,int b,int c){
       int sum=a+b+c;
       return sum;
   }
   public double add(double a,double b){
       double sum=a+b;
       return sum;
   }
    public static void main(String args[]){
        MethodOverloadingExample moe = new MethodOverloadingExample();

        System.out.println(moe.add(1,5));
        System.out.println(moe.add(33,22,99));
        System.out.println(moe.add(88.6,94.6));



    }
}
