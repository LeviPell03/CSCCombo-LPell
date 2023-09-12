import java.util.Random;
import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(10)+1;
		int count = 1;
		
		System.out.println("What number between 1 and 10 am I thinking of?");
		int guess = input.nextInt();
		
		while (guess != num) {
			count ++;
			System.out.println("No.");
			guess = input.nextInt();
			

		}
		System.out.println(" You are correct! " + num + " You took " + count +  "To guess my number.");
	}

}
