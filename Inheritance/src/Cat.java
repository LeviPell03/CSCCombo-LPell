
public class Cat extends Animal {
	private String color;
	// Key word extends^
		//toString
	
	public Cat(double height, double weight, String color) {
		super(height, weight);
		color = "Grey";
	}
	
	@Override
	public String makeSound() {
		return ("Meow Meow");
	}
	@Override
	public String toString() {
		return "Cat [color=" + color + "]";
	}
	
	

}
