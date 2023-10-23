
public class Weapon {
	private String name;
	private double damage;
	
	
	
	
	// Constructors
	public Weapon(String name, double damage) {
		super();
		this.name = name;
		this.damage = damage;
	}



	// Getters and setters
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getDamage() {
		return damage;
	}




	public void setDamage(double damage) {
		this.damage = damage;
	}


	// toString()
	@Override
	public String toString() {
		return "Weapon [name=" + name + ", damage=" + damage + "]";
	}
	
	
	

	
}
