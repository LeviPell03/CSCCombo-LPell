import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int one = -1;

		while (one == 0) {
			System.out.println("Please enter in a number");

			one = input.nextInt();
			total = total + one;

		}
		System.out.println(total);
	}
}
