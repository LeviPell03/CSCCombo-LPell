
public class Recursion {

	public static void main(String[] args) {
		System.out.println("The answer is " + factorial(6));
		
		
	}
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		}
		int product = n * factorial(n-1);
		return product;
	}	
}		
