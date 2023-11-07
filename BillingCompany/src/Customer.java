
public class Customer {
	private Person person;
	private int accountNumber;

	// Constructors
	public Customer(String name, int accountNumber, Person person) {
		super();
		this.person = person;
		this.accountNumber = accountNumber;
	}

	// Getters and setters
	public Person getName() {
		return person;
	}

	public void setName(Person name) {
		this.person = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

}
