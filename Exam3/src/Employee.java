
public class Employee extends Person {
	private String name;
	private String address;
	protected int phoneNumber;
	protected String emailAddress;
	private String office;
	private double salary;
	private int dateHired;
	
	
	//Constructor
	public Employee(String name, String address, int phoneNumber, String emailAddress, String office, double salary, int dateHired) {
		super(name, address, phoneNumber, emailAddress);
		// TODO Auto-generated constructor stub
	}

	// Getters and Setters
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


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getOffice() {
		return office;
	}


	public void setOffice(String office) {
		this.office = office;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public int getDateHired() {
		return dateHired;
	}


	public void setDateHired(int dateHired) {
		this.dateHired = dateHired;
	}
	//toString()
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", emailAddress="
				+ emailAddress + ", office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + "]";
	}
	
	
	
	

}
