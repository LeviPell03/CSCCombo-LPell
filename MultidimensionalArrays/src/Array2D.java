public class Array2D {

	public static void main(String[] args) {
		// Main (Driver)
		// Single Array

		int[] singleArr = { 0, 1, 2, 3, 4 };
		for (int i = 0; i < singleArr.length; i++)
			System.out.print(singleArr[i] + " ");

		System.out.println();

		// double Array
		int[][] doubleArr = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 }

		};
		for (int i = 0; i < doubleArr.length; i++)
			for (int j = 0; j < doubleArr[i].length; j++) {
				System.out.print(doubleArr[i][j] + " ");
				
			}
		doubleArr = new int[3][4];

	}
	char[][] charArr = new char[3][4];
	char ch = 'a'; {
	
	for (int i = 0; i < charArr.length; i++)
	{
		for (int j = 0; j < charArr[i].length; j++) {
			charArr[i][j] = ch;
			ch = (char) (ch + 1);
		}
		
	}
	for ( int i = 0; i < charArr.length; i++) {
		for (int j = 0; j < charArr[i].length; j++) {
			System.out.println(charArr[i][j] + " ");
		}
	}
	
	System.out.println();
	int [] histogram = new int [26];
	String input = "hello";
	for (int i = 0; i < input.length(); i ++) {
		char letter = input.charAt(i);
		histogram[letter - 'a']++;
	}
	for (int i = 0; i < histogram.length; i ++) {
		System.out.println(histogram.length);
	}
	}
	
}
