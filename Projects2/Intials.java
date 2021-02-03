import java.util.Scanner;

public class Intials{
    public static void main() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your first, middle, and last name below.");

        String name = s.nextLine();

        int space = name.indexOf(" ");
        int space2 = name.indexOf(" ", name.indexOf(" ") + 1);

        System.out.println("Your initials are " + name.substring(0,1) + name.substring((space+1),(space+2)) + name.substring((space2+1),(space2+2)));
    }
}