
public class Recursion {

	public static void main(String[] args) {
		System.out.println("The answer is " + factorial(45));
		
		
	}
	public static long factorial(long n) {
		if (n==0) {
			return 1;
		}
		int product = n * factorial(n-1);
		return product;
	}	
}		
