import java.util.Random;


public class Die {
	private int numSides;
	private int value;
	private static Random rand = new Random();
	
	// Constructor
	public Die(int numSides, int value) {
		super();
		numSides = 6;
		value = 1;
	}
	
	public Die(int sides) {
		numSides = sides;
		value = 1;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	int roll = rand.nextInt(6) + 1; {
	value = roll;
	}
	
	
	public String toString() {
		return "Die sides: " + numSides + " the value on the die is: " + value;
	}

	 void roll() {
				
	}
	

}
