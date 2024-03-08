import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Imported a Scanner from Java's utility and made a new Scanner.

        Scanner in = new Scanner(System.in);
        System.out.println("Hey! Please enter the numbers that you would like to reverse. Enter -1 to stop.");
        //My Array
        int[] numbers = new int[100];
        int count = 0;
        // while loop that while true takes inputs (in the datatype of integers) from the user. If the user inputs -1 the loop stops.
        while (true) {
            int number = in.nextInt();
            if (number == -1) {
                break;
            }
            // Stores the inputs in the Array at the index created by count. The count is initialized to 0 and increments by one each time with count++.
            numbers[count] = number;
            count++;
        }
        /*
         This for loop takes the integer stored in the count and decrements it by 1 which finds the index of the last number in the Array.
         The loop then decrements by 1 until the loop becomes less than 1.
         */
        System.out.println("Here are your numbers reversed!");
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}


