import java.util.Scanner;

public class MilesToKilos
{
    public static void main(){
        Scanner s = new Scanner(System.in);

        System.out.println("Input your a decimal in miles to be converted to kilometers");

        double num1 = s.nextDouble();
        
        double kilos = num1*1.60934;

        System.out.println("This is how many kilometers you enter from the miles you entered: " + kilos + " km");
    }
}
