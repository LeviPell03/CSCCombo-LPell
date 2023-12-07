
public class Player {
	private String name;
	private Die die;
	
	public Player() {
		name = "Choose a name";
		this.die = new Die(6);
	}
	
	public Player(String name) {
		this.name = name;
		this.die = die;
	}

	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
		return name;
	}

	public Die getDie() {
		return die;
	}

	public void setDie(Die die) {
		this.die = die;
	}
	
	public void printDie() {
		System.out.println(die);
	}
	
	public void roll() {
		die.roll();
		System.out.println("Player " + name + "rolled a " + die.getNumSides() + " sided die, they rolled");
	}

	public static int compareTo(player) {
	
	
}
