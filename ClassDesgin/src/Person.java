
public class Person {
	// First name 
	// Last name
	// Age
	// Height
	private String firstName;
	private String lastName;
	private int age;
	private int heightInInches;
	private Car jeep;
	private Car[] cars;
	
	// Constructors
	
	// No-arg constructors
	
	public Person() {
		firstName = "Levi";
	}
	
	public Person (String firstName, String lastName, int age, int heightInInches, int numCars) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.heightInInches = heightInInches;
		this.age = age;
		this.jeep = new Car( "green", 25, 1, 0);
		this.cars = new Car[numCars];
		for(int i = 0; i < numCars; i++) {
			cars[i] = new Car();
		}
	
	}

	// Access
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public int getHeight() {
		return heightInInches;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	public Car[] getJeep() {
		return cars;
	}
	
	
	
	//toString()
	public String toString() {
		String str = " This person is " + firstName + ","  + lastName + "," + heightInInches + ", " + age + " old";
			return str;
	}
}
