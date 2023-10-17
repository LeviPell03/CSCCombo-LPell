
public class Person {
	// First name 
	// Last name
	// Age
	// Height
	private String firstName;
	private String lastName;
	private int age;
	private int heightInInches;
	
	// Constructors
	
	// No-arg constructors
	
	public Person() {
		firstName = "Levi";
	}
	
	public Person (String firstName, String lastName, int age, int heightInInches) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.heightInInches = heightInInches;
		this.age = age;
	
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
	
	//toString()
	public String toString() {
		String str = "Person is " + firstName + ","  + lastName + "," + heightInInches + ", " + age + " old";
			return str;
	}
}
