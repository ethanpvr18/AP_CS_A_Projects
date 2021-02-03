import java.util.Scanner;

public class Average
{
   public static void main(){
       Scanner s = new Scanner(System.in);
       
       System.out.println("Input your first integer");
       
       int num1 = s.nextInt();
       
       System.out.println("Input your second integer");
       
       int num2 = s.nextInt();
       
       System.out.println("Input your third integer");
       
       int num3 = s.nextInt();
       
       int sum = num1 + num2 + num3;
       
       double avg = sum/3.0;
       
       System.out.println("This is the average of your three numbers: " + avg);
   }
}
