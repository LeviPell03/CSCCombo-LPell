
public class Animal {
	private double weight;
	private double height;
	
	
	public Animal() {
		height = 1.0;
		weight = 1.0;
	}
	public Animal(double height, double weight) {
		
		this.height = height;
		this.weight = weight;
	}
	
	// Method
	public String makeSound() {
		return ("Blah Blah");
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Animal [weight is equal to " + weight + ", height is equal to " + height + "]";
	}
	
	
}
