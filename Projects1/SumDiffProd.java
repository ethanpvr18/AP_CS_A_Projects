import java.util.Scanner;

public class SumDiffProd
{
    public static void main(){
       Scanner s = new Scanner(System.in);
       
       System.out.println("Input your first decimal");
       
       double num1 = s.nextDouble();
       
       System.out.println("Input your second decimal");
       
       double num2 = s.nextDouble();
       
       double sum = num1 + num2;
       
       double diff = Math.abs(num1 - num2);
       
       double prod = num1 * num2;
       
       System.out.println("This is the sum of your two decimals: " + sum);
       System.out.println("\nThis is the difference of your two decimals: " + diff);
       System.out.println("\nThis is the product of your two decimals: " + prod);
    }
}
