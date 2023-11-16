
public class Staff extends Employee {
	private String title;
	
	
	
	public Staff(String name, String address, int phoneNumber, String emailAddress, String office, double salary,
			int dateHired) {
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		// TODO Auto-generated constructor stub
	}


	// Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Staff [title=" + title + "]";
	}
	
	
	

}
