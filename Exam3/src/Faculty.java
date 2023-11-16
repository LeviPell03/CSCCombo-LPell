
public class Faculty extends Employee {
	private String emailAddress;
	private String officeHours;
	private String rank;
	
	
	
	public Faculty(String name, String address, int phoneNumber, String emailAddress, String office, double salary,
			int dateHired) {
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		// TODO Auto-generated constructor stub
		this.emailAddress = emailAddress;
	}


	//Getters and Setters	
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRankJunior() {
		return rank;
	}

	public void setRankJunior(String rankJunior) {
		this.rank = rankJunior;
	}

	public String getRankSenior() {
		return rank;
	}

	public void setRankSenior(String rankSenior) {
		this.rank = rankSenior;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Faculty [officeHours=" + officeHours + ", rankJunior=" + rank + ", rankSenior=" + rank
				+ "]";
	}
	
	
	

}
