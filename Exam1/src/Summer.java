import java.util.Scanner;
public class Summer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentNumber;
        int sum = 0;

        System.out.println("Please keep entering numbers. Enter 0 to stop.");

        while (true) {
            currentNumber = in.nextInt();

            if (currentNumber == 0) {
                break;
            }

            sum += currentNumber;
        }

        System.out.println("The sum of all the numbers you entered is: " + sum);
    }
}

