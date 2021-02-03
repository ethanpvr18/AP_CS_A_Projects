import java.util.Scanner;

public class HmsToSeconds
{
    public static void main(){
        Scanner s = new Scanner(System.in);

        System.out.println("Input a Time (Hms)");

        System.out.println("Input a Hour first (Hms)");

        int inputTime_Hour = s.nextInt();

        System.out.println("Input a Minute next (Hms)");

        int inputTime_Minute = s.nextInt();

        System.out.println("Input a Second lastly (Hms)");

        int inputTime_Second = s.nextInt();

        int totalSeconds = inputTime_Hour*60*60 + inputTime_Minute*60 + inputTime_Second;

        System.out.println("This is how many seconds you entered: " + totalSeconds + " Seconds");

    }
}
