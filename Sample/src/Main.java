import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
             /*
        uhuhdqiuhfUIWQFPWUIF
        KOFOEWPFOKEPFOWEF
        PEFPWEFKPWKEFPE
        PEKPKWEPKWPEKPKPWKP
         */
        String thing = "ham";
        System.out.print(thing);
        String thing2 = "ham and cheese";
        System.out.print(thing + thing2);
        String firstName = "ham";
        System.out.println(" " + "and " + firstName);

        int number = 3;
        int number2 = 6;
        int total = number + number2;
        System.out.print(total);

        int number3 = 6;
        int number4 = 20;
        int total2 = number3 * number4;
        System.out.println(total2);

        int startingNumber = 6;
        int secondStartingNumber = 8;
        System.out.println(startingNumber + secondStartingNumber);

        // us double for a number that isn't a whole number
        double one = 3.5;
        double two = 4.6;
        System.out.println(one + two);

        // Modulo?>

        int f = 1;
        // Yellow means you can throw an exception basically "warning"
        // Red equals error
        System.out.println(f / 2);
        System.out.println("I love goats.");
        System.out.println("\n");

        // "main" is the entry point to your program.
        //"System.out" = Output.
        // new Scanner code
        String line;
        Scanner in = new Scanner(System.in);

        System.out.println("Type something, please.");
        line = in.nextLine();
        System.out.println("You typed: " + line);
        System.out.println("\n");
        System.out.println("What is your name?");
        line = in.nextLine();
        System.out.println("Your name is " + line);
        System.out.println("\n");

        //"in.next" lab
        int num;
        final double CM_PER_INCH = 2.54;
        System.out.println("Please type in a number in inches: ");
        num = in.nextInt();
        System.out.println("You have " + num * CM_PER_INCH + " centimeters");
        System.out.println("\n");

        // Print format "f"
        System.out.printf("Four Thirds = %.3f", 4.0 / 3.0);


        //Type cast example

        System.out.println((int) (num * CM_PER_INCH));




        // To call a function you need "()"
        // Create a function by adding "public static void and then name your function
        // Example: public static void printAThing()
        // Don't forget tp call your function in "public static main"

        // [PUBLIC AND PRIVATE

        // public = you can read it
        // private = you can't read it.
        // You only expose a few ways to use your code.

        // [STATIC]

        // static things exist just on the blueprint

        // [Void]
        // public static String returnAThing() {  allows you to replace "void" with what you wish to return.
        // void = won't return anything it can only do something.

        // Correct structure for using new functions that you make
        // A function must begin with a lowercase letter

        /*
            public static void main

            }

            public static String giveMeAFirstName() {
            public static int doMAth() {

            }
          }

            and so on and so forth. Main always needs to be at the top above the new functions that you make.



         */

        // [Primitive type]

        System.out.println(returnAThing());
    }

        public static String returnAThing() {
            return "A thing";
        }


        }

