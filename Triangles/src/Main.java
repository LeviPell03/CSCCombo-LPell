import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // I imported a Scanner form Java's utility and created a new Scanner in.
        Scanner in = new Scanner(System.in);
        // boolean = true or false. I set my boolean "runAgain" to equal true by default.
        boolean runAgain = true;
        // while my boolean "runAgain" is true, Java will ask for the user to input a number between 1 and 50. boolean is a condition and while is a condition.
        while (runAgain) {
            System.out.print("Enter the size of the triangle (1-50): ");
            // The user will input a number, and it will be printed to the console.
            int size = in.nextInt();
            // My while condition sets the parameters for what the number being entered can be. While the size is less than 1 or greater than 50, you get an error message. The size must be 1-50 to print a triangle.
            while (size < 1 || size > 50) {
                System.out.println("No. Invalid size. The size must be between 1 and 50.");
                System.out.print("Enter the size of the triangle (1-50): ");
                size = in.nextInt();
            }
            // System.out requesting the user to enter a fill or "char" char in Java means "character"
            System.out.print("Enter the fill character. It can be any character you like. Examples: (#) (@) (&) (%) ");
            // the users input will be made into a char because the Scanner doesn't have a "nextChar" function. So you use ".charAt(0)" The char will be stored for the triangle.
            char fill = in.next().charAt(0);

            // The name of my method. It takes the int size and char fill
            makeMyTriangle(size, fill);
            //System.out asking if you would like make another triangle. "(y/n)" is converted to lowercase using ".toLowerCase"
            System.out.print("Do you want to make another triangle? (y/n): ");
            String answer = in.next().toLowerCase();
            // My if statement = answer is "n" the boolean is now false. end the program.
            if (answer.equals("n")) {
                runAgain = false;
                System.out.print("\n");
                System.out.print("Thank you for using this program. ");
            }
        }

    }
    /* My method for making my triangle. It takes the size and char. First you have the initialization which is i = 1. Next, you have the condition which is i < size. Then you have the update which is i++.
    Since our triangle adds to itself we use i++ to increment. Our nested loop iterates from size - i to 1.
    */
    public static void makeMyTriangle(int size, char fill) {
        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }
            // This for loop iterates from 1 to i. the loop prints fill character and then a space.
            for (int j = 1; j <= i; j++) {
                System.out.print(fill + " ");
            }

            System.out.println();
        }
    }
}
