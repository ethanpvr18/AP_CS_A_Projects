import java.util.Scanner;
import java.lang.String;

public class AdvPalindrome
{
    public static void main(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a word to test if it is a Palindrome.");
        
        String word = s.nextLine();
        
        String wordToTest = word.replaceAll("[^a-zA-Z]", "").toLowerCase();;

        String flippedWord = "";
        
        for(int i = wordToTest.length();i > 0; i--){
            flippedWord = flippedWord + wordToTest.substring(i-1,i); 
        }
        
        System.out.print(flippedWord);
        
        if(flippedWord.equals(wordToTest)){
            System.out.print(", is a Palindrome.");            
        } else {
            System.out.print(", is not a Palindrome.");
        }
    }
}
