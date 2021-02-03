import java.util.Scanner;

public class DigitAnalysis{
    public static void main(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer between 1 million and 1 billion.");

        int number = s.nextInt();

        int evens = 0;
        int odds = 0;

        if(number >= 1000000 && number <= 1000000000) {
            while (number > 0)  
            {
                int num1 = number % 10;
                if (num1 % 2 == 0) {
                    evens++;
                } else {
                    odds++;
                }
                number = number / 10;
            }
            System.out.println("Number of Even Numbers: "+evens);
            System.out.println("Number of Odd Numbers "+odds);
        } else {
            main();
        }
    }
}