

public class ExceptionHandling {

	public static void main(String[] args) {
			// Main
		int[] myNumbers;
		
		try {
			
			myNumbers = new int[3];
			setIndex10(myNumbers);
			int num = Integer.parseInt("s45");
			// System.out.println(myNumbers[4]);
//			
			
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			myNumbers = new int[12];
			setIndex10(myNumbers);
			System.out.println(e.getMessage());
			// e.printStackTrace();
			//	System.exit(-1);
		}
		
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}		
	
	}

	public static void setIndex10 (int[] array) throws ArrayIndexOutOfBoundsException  {
		if (array.length < 11) {
			throw new ArrayIndexOutOfBoundsException("There are less than 11 elements, dumbo.");
		}
	
	}
}
