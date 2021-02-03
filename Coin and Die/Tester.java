import java.util.*;

public class Tester{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter the number of sides you would like your first die to have.");

        int numOfSidesOf1 = s.nextInt();

        System.out.println("Please enter the number of sides you would like your second die to have.");

        int numOfSidesOf2 = s.nextInt();
        for(int i = 0;i<10;i++){
            Die d1 = new Die(numOfSidesOf1);
            Die d2 = new Die(numOfSidesOf2);
            System.out.println("");
            System.out.println(d1 + " and " + d2);

            if(d1.getValue() == d2.getValue()){
                System.out.println("You rolled doubles! You win $" + d1.getValue());
            } else {
                System.out.println("Sorry:) You don't win anything.");                
            }
        }
    }
}
