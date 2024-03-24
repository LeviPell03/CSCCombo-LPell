import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String input;
        System.out.println("Welcome to DiscOWOrd! This is a new platform that makes it possible for everyone to talk to each-other in a program THAT ACTUALLY WORKS!");

        boolean account = true;

        while (account) {
            System.out.println("Would you like to make a DiscOwOrd account? (y/n)?");
            String answer = in.next().toLowerCase();
            if (answer.equals("y"))
                System.out.println("What is your name?");
            input = in.next();
            System.out.println("Thank you for that.");
            System.out.println("Where are you from? ");







            // My if statement = answer is "n" the boolean is now false. end the program.
            if (answer.equals("n")) {
                account = false;
                System.out.print("\n");
                System.out.print("Thank you for using this program. ");
            }
        }
    }
}



