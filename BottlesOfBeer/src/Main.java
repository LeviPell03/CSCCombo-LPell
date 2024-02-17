import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Imported a Scanner from Java's utility. Made a new Scanner by telling Java to create one.
        // Initialized my int as "beer".
        int beer;
        // By default, word will be "bottles"
        String word = "bottles";
        // System.out asking the user to enter a number.
        System.out.println("What's your starting number of bottles?");
        // The user's input will be printed to the console next.
        beer = in.nextInt();
        // while beer is greater than 0 these if loops will continue until you reach 0 bottles of beer.
        while (beer > 0) {
            // When you have one bottle left, "bottles" becomes "bottle"
            if (beer == 1) {
                word = "bottle";
            }
            // System.out with the addition of when beer is used in this loop, subtract 1.
            System.out.println(beer + " " + word + " of beer on the wall, " + beer + " " + word + " of beer.");
            beer = beer - 1;
            // if the beer is greater than 0, the System.out will  say the lyrics to this part of the song.
            if (beer > 0) {
                System.out.println("Take one down, pass it round " + beer + " " + word + " of beer.");
            }
        }
        // When the beer reaches 0 the song ends.
        if (beer == 0) {
            System.out.println("No more bottles of beer.");
        }

    }
}



