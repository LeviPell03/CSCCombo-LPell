import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 10");
		int one = input.nextInt();
		System.out.println("Please enter a number between 1 and 10");
		int two = input.nextInt();
		boolean TenMaker = makes10(one, two);
		if (TenMaker) {
			System.out.println("Your number eqauls 10");
		} else {
			System.out.println("Your number doesn't");
		}
	}


	public static boolean makes10(int num1, int num2) {
		return num1 + num2 == 10;
	}
}