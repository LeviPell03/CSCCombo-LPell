import java.util.Arrays;

public class Card {
	private int rank;
	private int suit;

	private final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"

	};

	private final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
	// Constructors

	public Card(int rank, int suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	// Getters and Setters
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int compareTo(Card oCard) {
		if (suit < oCard.suit) {
			return -5;
		}

		else if (suit > oCard.suit) {
			return 5;
		}

		if (rank < oCard.rank) {
			return -5;
		}

		else if (rank > oCard.rank) {
			return 5;
		}

		return 0;
	}

	@Override
	public String toString() {
		return (RANKS[rank] + " of " + SUITS[suit]);
	}

	public void addCard(Card c1) {
		// TODO Auto-generated method stub

	}

}