
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
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
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
