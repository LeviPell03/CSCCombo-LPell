

public class Binary {

	public static void main(String[] args) {
		int bin1 = 0;
		int num = 256;
		displayBinary(num);
		

	}

	public static void displayBinary(int num) {
		if (num == 0) {
			return;
		}
		
		int bin1 = num%2;
		num = num/2;
		displayBinary(num);
		System.out.print(num%2);
	}
}
