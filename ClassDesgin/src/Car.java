
public class Car {
// data members, attributes etc.
	private String color;
	private int mileage;
	private double amountOfGas;
	
// Constructors 
	
// No-arg constructor
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
	
	public int getMileage() {
		return mileage;
	}
	
	public double getAmountOfGas() {
		return amountOfGas;
	}
	
	// Mutators or setters
	public void setColor (String requestedColor) {
		if (!requestedColor.equals("Green")) {
			color = "Green";
		}
		color = requestedColor;
	}
	
	public void setamountOfGas (double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}
	
	// Methods that you want the class to do
	
	
	//toString()
	public String toString() {
		String str = "Car is " + color + " with mileage at " + mileage + " and " + amountOfGas + " of gas ";
		return str;
	}
}
