import java.util.Arrays;
import java.util.Random;


public class Deck {
	private static Card[] cards;
	private static Random rand = new Random();
	


	private final int STD_NUMBER_OF_CARDS = 52;

	// Constructors
	public Deck() {
		cards = new Card[STD_NUMBER_OF_CARDS];
		int cardIndex = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 14; j++) {
				cards[cardIndex] = new Card(j, i);
				cardIndex++;

			}
			// Methods
		
		}
	}
	// Getters and Setters

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		Deck.cards = cards;
	}
	
	public void Shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int index = rand.nextInt(cards.length);
				swapCards(cards, i, index);
			 Card tempCard = cards[i];
			 cards[i] = cards[index];
			 cards[index] = tempCard;
		}
	}	
		public static void Shuffle1(Deck deck) {
			Card[] cards = deck.getCards();
			for (int i = 0; i < cards.length; i++) {
				int index = rand.nextInt(cards.length);
				swapCards(cards, i, index);
				
			}
				
			 
	}
	
			
	private static void swapCards(Card[] cards2, int index1, int index2) {
		Card tempCard = cards[index1];
		cards[index1] = cards[index2];
		cards[index2] = tempCard;
		
		
	
	
	}
	
	public void unShuffle() {
		
	}
	
	public void bubbleSort() {
		for (int i = 0; i < cards.length; i++) {
			for (int j = 1; j < cards.length - i; j++) {
				if (cards[j - 1].compareTo(cards[j]) > 0) {
					swapCards(cards, j - 1, j);
				}
			}
		}

	}

	@Override
	public String toString() {
		StringBuilder retStr = new StringBuilder();
		for ( int i = 0; i < cards.length; i++) {
			retStr.append(cards[i].toString());
			retStr.append("\n");
		}
		
		return retStr.toString();
	}
	
}
