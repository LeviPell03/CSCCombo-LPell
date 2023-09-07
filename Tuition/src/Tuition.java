import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		// Flowchart 1 in code
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		
		System.out.println("How many credits are you taking?");
		int creditHours = input.nextInt();
//		total = creditHours * 580 + 650;
//		
//		System.out.println("You owe " + total);
		
		// If 
		
		if (creditHours > 12) {
			
			total = total + 250;
		}
		
		else {
			System.out.println("Do you want an activity pass?");
			
			String ans = input.next();
			
			if (ans.equals ("yes")) {
				
				total = total + 250;
			}
			
		} 
		total = total + creditHours * 580 +650;
		
		System.out.println("Your total is " + total);
		
		

	}

}
