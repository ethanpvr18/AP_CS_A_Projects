import java.util.Scanner;

public class StringToChar
{
    public static void main(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a word.");

        String word = s.nextLine();

        for(int x = 0; x < word.length(); x++) {
            System.out.println(word.substring(x,x+1));
        }
    }
}
