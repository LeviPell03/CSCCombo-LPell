import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Name and age
		System.out.println("Enter your name?");
		String name = input.next();
		
	    System.out.println("Enter your age?");
	    
	    int age = input.nextInt();
	    
	    while (age < 0) {
	     	
	    	System.out.println("Please enter a positive age.");
	    	age = input.nextInt();
	    	
	    	System.out.println("Your age is" + age);
	    }

	}

}
