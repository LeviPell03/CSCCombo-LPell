import java.util.Scanner;

public class ForStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = input.nextInt();
		long i = 0;
		long total = 0;
		for (long fact = 1; i < num; i++) {
			
			fact =  fact*(num -i);
			total = fact;
		}
		
			System.out.println("Your total is " + total);
	}

}
