import java.util.Arrays;
import java.util.Random;


public class Deck {
	private Card[] cards;

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
		}
	}
	// Getters and Setters

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	public void Shuffle() {
		Random rand = new Random();
		
		for (int i = 0; i < cards.length; i++) {
			int index = rand.nextInt(cards.length);
			 Card tempCard = cards[i];
			 cards[i] = cards[index];
			 cards[index] = tempCard;
			 
			 
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
