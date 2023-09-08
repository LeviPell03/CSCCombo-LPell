import java.util.Scanner;

public class CarRental {

	public static void main(String[] args) {
		// Car Rental
		Scanner input = new Scanner(System.in);
		double total = 0;
		 
		 System.out.println("How many days?");
	     int days = input.nextInt();
	     
	     //Miles
	     System.out.println("How many miles?");
	     int miles = input.nextInt();
	     
	    
		//Car Code
	     System.out.println("What is the car code?");
	     int carCode = input.nextInt();
	     
	     if (carCode == 1) {
	    	 total = (days*75) + (miles * 1.5);
	    	 
	     }
	     else if (carCode ==2) {
	    	 total = (days * 45 ) + (miles * .85);
	     }
	     else {
	    	 total = (days * 35) + (miles * .45);
	     }
		
	     System.out.println("Your total is" + total);
		
		
		
		
		
		

	}

}
