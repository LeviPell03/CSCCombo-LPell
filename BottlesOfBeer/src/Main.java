import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        // Imported a Scanner and made a new Scanner.
        Scanner in = new Scanner(System.in);
        String word = "bottles";
        // Asking for an input from the user.
        System.out.println("Hello! Enter number of beer. Thank you. ");
        // Input from the user will be the next thing printed to the console.
        int beer = in.nextInt();

        // for loop saying if i = beer, beer greater than or equal to 0, deduct. It has a nested if loop. when beer is greater than 1 do this task.
        for (int i = beer; i >= 0; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " " + word + " of beer.");
                System.out.println("Take one down and pass it around, " + i + " " + word + " of beer on the wall.");
                // else if beer is equal to 1 do this.
            }  if (i == 1) {
                word = "bottle";

                System.out.println(i + " bottle of beer on the wall, " + i + " " + word + " of beer.");
                System.out.println("Take one down and pass it around, " + i + " " + word + " of beer on the wall.");
                // else if beer is equal to 0, do this.
            } else if (i == 0) {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                // This is tricky. I have to use "beer" here because if I use "i" it will be 0.
                System.out.println("Go to the store and buy some more, " + beer + " bottles of beer on the wall.");
            }
        }
    }
}














