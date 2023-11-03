
public class War {

	public static void main(String[] args) {
		// Card card1 = new Card(11,3);
		// System.out.println(card1);

		Deck deck = new Deck();
		System.out.println(deck);

		deck.Shuffle();
		System.out.println(deck);

		Deck.Shuffle1(deck);

		deck.bubbleSort();

		Pile p1 = new Pile();
		Deck subdeck = deck.subdeck(0, 25);
		p1.addDeck(subdeck);
		System.out.println(p1);

		Pile p2 = new Pile();
		subdeck = deck.subdeck(26, 51);
		p2.addDeck(subdeck);
		System.out.println(subdeck);

		Pile midPile = new Pile();

		Pile winP1 = new Pile();
		Pile winP2 = new Pile();

		while (!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();

			midPile.addCard(c1);
			midPile.addCard(c2);

			int cmpResult = c1.compareTo(c2);
			if (cmpResult < 0) {
				winP2.addCard(midPile);

			} else if (cmpResult > 0) {
				winP1.addCard(midPile);
			}

		}
		System.out.println(deck);
		if (winP1.size() > winP2.size()) {
			System.out.println("Player 1 wins!!");
		} else if (winP1.size() < winP2.size()) {
			System.out.println("Player 2 wins");
		} else {
			System.out.println("It's a tie");
		
		}
		
	}
}
