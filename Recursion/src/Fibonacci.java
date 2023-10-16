
public class Fibonacci {
	
	static long[] fibArray;
	
	public static void main(String[] args) {
		int numTerm = 6;
		fibArray = new long[numTerm];
		System.out.println(fibonacci(numTerm));
	}
	public static long fibonacci(int term) {
		if (term == 0 || term == 1) {
			return term;
		}
		if (fibArray[term] != 0) {
			return fibArray[term];
		}
		long ans = fibonacci(term-1) + fibonacci(term-2);
		fibArray[term] = ans;
		return (ans);
	}
}