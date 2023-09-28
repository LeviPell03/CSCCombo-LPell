import java.util.Scanner;

public class CanSpell2 {

	public static void main(String[] args) {
		// initialize the alphabet and store all the values
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in a word");
		String word = input.next();
//				String word = "quijibo";
		String tiles = "abcdefg";
		boolean Spelling = canSpell(word, tiles);
		if (Spelling) {
			System.out.println("Your word can be spelled");
		} else {
			System.out.println("Your word can't be spelled");
		}
	}

	public static boolean canSpell(String word, String tiles) {
		for (int i = 0; i < word.length(); i++) {
			 
			int index = tiles.indexOf(word.charAt(i)); 
			if (index == -1) {
				return false;
			}
			tiles = tiles.substring(0,index) + tiles.substring(index + 1);
		}
			return true;

	}
}
