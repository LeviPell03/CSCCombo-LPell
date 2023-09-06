import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Read a single word
		System.out.println("Enter a single word: ");
		String word = input.next();
		System.out.println("You entered: " + word);
		input.next();
		
		//Read a whole line
		
		System.out.println("Enter a whole line: ");
		String line = input.nextLine();
		System.out.println("You entered: " + line);
		
		//Read an interger
		System.out.println("Enter an interger ");
		int interger = input.nextInt();
				System.out.println("You entered " + interger);
				
		//Read a double
		System.out.println("Read a double ");
		double dbl = input.nextDouble();
	    System.out.println("You entered: " + dbl);


	}

}
