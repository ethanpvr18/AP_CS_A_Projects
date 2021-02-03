
import java.util.Scanner;

public class RPS {
    public static String computerChoice;

    public static String userChoice;

    public static Scanner s = new Scanner(System.in);

    public static int userScore = 0;

    public static int computerScore = 0;

    public static int ties = 0;

    public static void main() {
        boolean run = true;
        while (run) {
            System.out.println("Choose (1)Rock (2)Paper (3)Scissors (0)Exit.");

            int a = s.nextInt();

            double r = Math.random()*3;

            if(r > 0 && r <= 1){
                computerChoice = "Rock";
            } else if (r > 1 && r <= 2) {
                computerChoice = "Paper";
            } else if (r > 2 && r <= 3) {
                computerChoice = "Scissors";
            } 

            if(a == 1){
                userChoice = "Rock";
            } else if (a == 2) {
                userChoice = "Paper";
            } else if (a == 3) {
                userChoice = "Scissors";
            } else if (a == 0){
                run = false;
            } else {
                System.out.println("Please only enter 1, 2, or 3");
                continue;
            }

            if(userChoice.equals("Rock") && computerChoice.equals("Rock")){
                System.out.println("You chose Rock and the computer also chose Rock");
                System.out.println("You tied!");
                ties++;
            } else if(userChoice.equals("Rock") && computerChoice.equals("Paper")){
                System.out.println("You chose Rock and the computer chose Paper");  
                System.out.println("The computer won!");
                computerScore++;
            } else if(userChoice.equals("Rock") && computerChoice.equals("Scissors")){
                System.out.println("You chose Rock and the computer chose Scissors");
                System.out.println("You won!");
                userScore++;
            } else if(userChoice.equals("Paper") && computerChoice.equals("Paper")){
                System.out.println("You chose Paper and the computer also chose Paper");
                System.out.println("You tied!");
                ties++;
            } else if(userChoice.equals("Paper") && computerChoice.equals("Scissors")){
                System.out.println("You chose Paper and the computer chose Scissors");
                System.out.println("The computer won!");
                computerScore++;
            } else if(userChoice.equals("Scissors") && computerChoice.equals("Scissors")){
                System.out.println("You chose Scissors and the computer also chose Scissors");
                System.out.println("You tied!");
                ties++;
            } else if(userChoice.equals("Paper") && computerChoice.equals("Rock")){
                System.out.println("You chose Paper and the computer chose Rock");
                System.out.println("You won!");
                userScore++;
            } else if(userChoice.equals("Scissors") && computerChoice.equals("Rock")){
                System.out.println("You chose Scissors and the computer chose Rock");
                System.out.println("The computer won!");
                computerScore++;
            } else if(userChoice.equals("Scissors") && computerChoice.equals("Paper")){
                System.out.println("You chose Scissors and the computer chose Paper");
                System.out.println("You won!");
                userScore++;
            }
        }
        
        //here
        System.out.println("The final score is: \n" + "Gains: " + userScore + "\n" + "Losses: " + computerScore + "\n" + "Ties: " + ties);
        System.out.println("Bye!");
    }
}