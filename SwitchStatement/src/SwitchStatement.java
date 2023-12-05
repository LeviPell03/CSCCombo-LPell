import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Please select food, drink or cup: ");
		String Item = input.nextLine();
	
	
		
		switch(Item) {
		
		case "food":
			cost = cost + 3;
			break;
		
		case "drink":
			cost = cost + 2;
			break;
			
		case "cup":
			cost = cost + 1;
			break;
			
		default:
			break;
		
		}
		System.out.println("The total cost is " + cost);

	}

}
