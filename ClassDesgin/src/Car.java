
public class Car {
// data members, attributes etc.
	private String color;
	private int mileage;
	private double amountOfGas;
	private Wheel[] wheels;
	private SteeringWheel ripper;
	
// Constructors 
	
// No-arg constructor
	public Car() {
		color = "Grey";

	}

	public Car(String carColor) {
		color = carColor;
		wheels = new Wheel[4];
	}

	public Car(String color, int mileage) {
		this.color = color;
		this.mileage = mileage;
		wheels = new Wheel[4];

	}
	
	public Car (String color, int mileage, double amountOfGas, int numWheels) {
		this.color = color;
		this.mileage = mileage;
		this.amountOfGas = amountOfGas;
		wheels = new Wheel[numWheels];
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel("Steel", 25);
			
		}
		ripper = new SteeringWheel (22, true, "wood");
		
	}
	


	// Access and getters
	public String getColor() {
		return color;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public double getAmountOfGas() {
		return amountOfGas;
	}
	
	// Mutators or setters or getters
	public void setColor (String requestedColor) {
		if (!requestedColor.equals("Green")) {
			color = "Green";
		}
		color = requestedColor;
	}
	
	public void setamountOfGas (double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}
	
	
	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(String material, int radius) {
		for (int i = 0; i < wheels.length; i++) {
			wheels[i].setMaterial(material);
			wheels[i].setRadius(radius);
		}
		
	}

	public SteeringWheel getSteeringWheel() {
		return ripper;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		ripper = steeringWheel;
	}

	// Methods that you want the class to do
	public void drive(int numMiles) {
		for ( int i = 0; i < numMiles; i++) {
			System.out.print("+");
		}
		System.out.println();
		mileage += numMiles;
		amountOfGas -= numMiles/5;
	}
	
	public void selfClean() {
		System.out.println("Clean car, clean car, clean car!");
	}
	
	public double fillGas (double gal) {
		double oldGas = amountOfGas;
		amountOfGas += gal;
		return amountOfGas;
	}
	
	
	//toString()
	public String toString() {
		String str = "Car is " + color + " with mileage at " + mileage + " miles and " + amountOfGas + " of gas. ";
		return str;
	}
}
