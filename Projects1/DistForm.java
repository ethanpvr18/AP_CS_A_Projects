import java.util.Scanner;

public class DistForm
{
   public static void main(){
       Scanner s = new Scanner(System.in);
       
       System.out.println("Input your first x-coordinate");
       
       double x1 = s.nextDouble();
       
       System.out.println("Input your first y-coordinate");
       
       double y1 = s.nextDouble();
       
       System.out.println("Input your second x-coordinate");
       
       double x2 = s.nextDouble();
       
       System.out.println("Input your second y-coordinate");
       
       double y2 = s.nextDouble();
       
       double dist = Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
       
       System.out.println("This is the distance between the coordinates " + "(" + x1 + "," + y1 +")" + "&" + "(" + x2 + "," + y2 +")" + ": " + dist);
   }
}
