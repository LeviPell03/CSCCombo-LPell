
public class Horse extends Animal {
	private String type;
	
	// Constructors
	public Horse() {
		super();
		
	}


	public Horse(double height, double weight) {
		super(height, weight);
		
	}
	
	
	// Getters and Setters
	public String makeSound() {
		return ("Neigh neigh");
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
