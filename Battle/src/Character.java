
public class Character {
	private String name;
	private double health;
	private double strength;
	private double speed;
	private Weapon weapon;
	
	
	// Constructors
	public Character(String name, double health, double strength, double speed) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.speed = speed;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getHealth() {
		return health;
	}


	public void setHealth(double health) {
		this.health = health;
	}


	public double getStrength() {
		return strength;
	}


	public void setStrength(double strength) {
		this.strength = strength;
	}


	public double getSpeed() {
		return speed;
	}


	public void setSpeed(double speed) {
		this.speed = speed;
	}
	

	public Weapon getWeapon() {
		return weapon;
	}


	public void setWeapon(String name, double damage) {
		this.weapon = new Weapon (name, damage);
	}
	

	// toString()
	@Override
	public String toString() {
		return "Character [name=" + name + ", health=" + health + ", strength=" + strength + ", speed=" + speed + " + weapon=" + weapon +"]";
	}
	
	
	
}
