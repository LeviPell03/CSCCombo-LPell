import java.util.Scanner;

public class While2 {

 public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please choose a number between 1 and 10");
		input.nextInt();
		int number = 0;
		String ans = "Yes"; {
		while (number > 10 || ans == "No") {
		number ++;
		System.out.println("Is this your number" + number);
		ans = input.next();
		
			
	


