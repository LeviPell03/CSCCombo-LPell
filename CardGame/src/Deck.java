import java.util.Arrays;

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

	@Override
	public String toString() {
		String retStr = "";
		for ( int i = 0; i < cards.length; i++) {
			retStr = retStr + cards[i].toString() + " \n ";
		}
		return retStr;
	}
	
}
