import java.util.Scanner;

public class ForFibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number.");
		int n = input.nextInt();
		int term1 = 0;
		int term2 = 1;
		int currentTerm = 0;
		
		
		for (int i = 2; i < n; i++) {
			currentTerm = term1 + term2;
		}
			term1 = term2;
			term2 = currentTerm;
			System.out.println("Your number is eqaul to " + currentTerm);
	}

}
