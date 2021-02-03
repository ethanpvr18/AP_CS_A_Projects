import java.util.Scanner;

public class LeapYear
{
    public static int year;

    public static void main(){ 
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter a year to determine if it is a leap year(or enter 0 to terminate):");

        year = s.nextInt();

        while(year != 0){            
            if(year > 1582){
                if((year % 4) == 0) { 
                    if(((year % 100) != 0) || ((year % 400) == 0)){
                        System.out.println("This is a leap year!");
                        main();
                    } else {
                        System.out.println("This is NOT a leap year!");
                        main();
                    }
                } else {
                    System.out.println("This is NOT a leap year!");
                    main();
                }   
            } else {
                System.out.println("Not an acceptable answer!");
                main();
            }
        }
    }
}
