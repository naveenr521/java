
import java.util.Random;
public class Random1
{

    public static void main(String args[]){
Random random = new Random();
        int number ;
        double number1;
        boolean isHeads;
        number=random.nextInt(4)+1;
        number1=random.nextDouble();
        isHeads=random.nextBoolean();

        if(isHeads) {
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
System.out.println(number);
System.out.println(number1);


    }
}
