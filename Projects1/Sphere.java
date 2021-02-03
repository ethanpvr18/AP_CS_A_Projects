import java.util.Scanner;

public class Sphere
{
   public static void main(){
       Scanner s = new Scanner(System.in);
       
       System.out.println("Enter the radius of a sphere");
       
       double radius = s.nextDouble();
       
       double volume = ((4.0/3.0)*Math.PI*Math.pow(radius, 3));
       
       double sa = (4.0*Math.PI*Math.pow(radius, 2));
       
       System.out.println("This is the volume of the sphere: " + volume);
       
       System.out.println("This is the surface area of the sphere: " + sa);
   }
}
