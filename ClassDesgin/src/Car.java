
public class Car {
// data members, attributes etc.
	private String color;
	private int mileage;
	private double amountOfGas;
	
// Constructors 
	public Car() {
		color = "Grey";

	}

	public Car(String carColor) {
		color = carColor;
	}

	public Car(String color, int mileage) {
		this.color = color;
		this.mileage = mileage;

	}
	
	public Car (String color, int mileage, double amountOfGas) {
		this.color = color;
		this.mileage = mileage;
		this.amountOfGas = amountOfGas;
	}
	
	// Access
	public String getColor() {
		return color;
	}
}
