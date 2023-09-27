import java.util.Scanner;

public class CanSpell {

	public static void main(String[] args) {
		// initialize the alphabet and store all the values
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter in a word");
		String word = input.next();
//		String word = "quijibo";
		String tiles = "abcdefg";
		boolean Spelling = canSpell(word, tiles);
		if (Spelling) {
			System.out.println("Your word can be spelled");
		}
		else {
			System.out.println("Your word can't be spelled");
		}
	}
	
	public static boolean canSpell(String word, String tiles) {
		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			int count = 0;
			for (int j = 0; j  < word.length(); j++) {
				char let1 = word.charAt(j);
				if (letter==let1) {
					count++;
				}
				
			}
			for (int t=0; t<tiles.length(); t++) {
				char tile = tiles.charAt(t);
				if (tile == letter) {
					count--;
				}
			}
			if (count >0) {
				return false;
			}
		}
		return true;
	}
}