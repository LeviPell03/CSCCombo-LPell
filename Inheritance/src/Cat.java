
public class Cat extends Animal {
	private String color;
	// Key word extends^
		//toString
	
	public Cat(double height, double weight, String color) {
		super(height, weight);
		this.color = color;
	}
	
	
	public boolean equals ( Cat oCat) {
		if ( oCat.color.equals(color)) {
		return true;
	}
		return false;
	}
	
	@Override
	public String makeSound() {
		return ("Meow Meow");
	}
	@Override
	public String toString() {
		return "Cat [color is " + color + "]";
	}
	
	

}
