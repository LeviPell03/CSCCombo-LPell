import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private String address;
	List<Company> companies = new ArrayList<Company>();

	
	
	// Constructors
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

		// Getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
