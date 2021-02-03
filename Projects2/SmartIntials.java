import java.util.Scanner;

public class SmartIntials{
    public static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your name below.");

        String name = s.nextLine();

        int space = name.indexOf(" ");
        int space2 = name.indexOf(" ", name.indexOf(" ") + 1);
        int space3 = name.indexOf(" ", space2 + 1);
       
        if(space != -1 && space2 != -1 && space3 != -1){
            System.out.println("Please only enter no more than 3 names.");            
        }
        else if(space == -1 && space2 == -1) {
            System.out.println("Your initials are " + name.substring(0,1));
        }
        else if(space2 == -1 && name.substring(space + 1) != null){
            System.out.println("Your initials are " + name.substring(0,1) + name.substring((space+1),(space+2)));
        }
        else if(space != -1 && space2 != -1){
            System.out.println("Your initials are " + name.substring(0,1) + name.substring((space+1),(space+2)) + name.substring((space2+1),(space2+2)));
        }
    }
}