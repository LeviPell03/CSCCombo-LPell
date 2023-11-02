import java.util.ArrayList;
import java.util.List;

public class Pile {
	private List<Card> cards; // How to make a List
	
	// Additional Note: If you don't need getters
	//Constructors
	public Pile() {
		cards = new ArrayList<Card>(); // How to make an ArrayList
	}
	
	public void addDeck(Deck deck) {
		for (int i = 0; i < deck.getCards().length; i++) {
			this.cards.add(deck.getCards()[i]);
		}
		for (Card card: deck.getCards()) {
			this.cards.add(card);
		}
	}
		// Pop 
	public Card popCard() {
		Card card = cards.remove(0);
		return card;	
	
	}
		// Add
	public void addCard(Card midPile) {
		cards.add(midPile);
	}
	
	public int size() {
		return cards.size();
	}
		// Empty
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	
	public void addPile(Pile pile) {
		for (Card card: pile.cards) {
			cards.add(card);
		}
		while (!pile.isEmpty()) {
			cards.add(pile.popCard());
		}
	}
	
	// toString()
	@Override
	public String toString() {
		return "Pile [cards= " + cards + "]";
	}

	public void addCard(Pile midPile) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
