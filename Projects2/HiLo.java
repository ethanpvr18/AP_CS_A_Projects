import java.util.*;

public class HiLo {
    public static void main() {
        Random random = new Random();
        Scanner s = new Scanner(System.in);

        int r1 = random.nextInt(100);

        System.out.println("I've picked a number between 1 and 100.  Please guess my number.  Enter 0 to begin or -1 to quit anytime!");
        int guess = s.nextInt();

        int numOfGuesses = 0;

        while(guess != -1){
            System.out.println("Start!");            
            guess = s.nextInt();
            if(guess == r1){
                numOfGuesses++;
                System.out.println("You guessed correctly in " + numOfGuesses + " Guesses!  Enter 0 to play again or -1 to quit!");                
                r1 = random.nextInt(100);
            } else if(guess > r1) {
                System.out.println("You guessed Too High!");
                System.out.println("Guess Again?");
                numOfGuesses++;
            } else if(guess < r1) {
                System.out.println("You guessed Too Low!");
                System.out.println("Guess Again?");  
                numOfGuesses++;
            }
        }
    }
}