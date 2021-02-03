import java.util.*;
import java.text.*;

public class CountChange {
    public static void main(){
       Scanner s = new Scanner(System.in);
       NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
      
       System.out.println("Input your number of quarters");
       
       int quarters = s.nextInt();
       
       System.out.println("Input your number of dimes");
       
       int dimes = s.nextInt();
       
       System.out.println("Input your number of nickels");
       
       int nickels = s.nextInt();
       
       System.out.println("Input your number of pennies");
       
       int pennies = s.nextInt();
       
       double totalValue = quarters*0.25+dimes*0.10+nickels*0.05+pennies*0.01;
       
       System.out.println(defaultFormat.format(totalValue));
    }
}