import java.util.Scanner;

public class WeightConversion {

    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);

        double weight;
        double newweight;
        int choice;

        System.out.println(" Weight Conversion program ");
        System.out.println("1. convert lbs to kgs ");
        System.out.println("2.convert kgs to lbs ");

        System.out.println("Choose an option ");
        choice=sc.nextInt();

        if(choice==1){
            System.out.print(" Enter the weight in  lbs ");
            weight=sc.nextDouble();
            newweight=weight * 0.453592;
            System.out.print(" the new weight in kgs is " + newweight);
        }

      else  if(choice==2){
            System.out.print(" Enter the weight in  kgs ");
            weight=sc.nextDouble();
            newweight=weight * 2.20462;
            System.out.println(" the new weight in lbs is " + newweight);
        }

      else{
          System.out.print("That was not a valid choice ");
        }
      sc.close();



    }
}
