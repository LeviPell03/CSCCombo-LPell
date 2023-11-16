
public class Student extends Person {
	private String status;
	private String freshmen;
	private String sophmore;
	private String junior;
	private String senior;
	
	//Constructors
	public Student(String name, String address, int phoneNumber, String emailAddress, String status, String freshmen, String sophmore, String junior, String senior) {
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
		this.freshmen = freshmen;
		this.sophmore = sophmore;
		this.junior = junior;
		this.senior = senior;
	}
	
	//Getters and Setters

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFreshmen() {
		
		return freshmen;
	}

	public String setFreshmen(String freshmen) {
		return sophmore;
	}

	public String getSophmore() {
		return sophmore;
	}

	public void setSophmore(String sophmore) {
		this.sophmore = sophmore;
	}

	public String getJunior() {
		return junior;
	}

	public void setJunior(String junior) {
		this.junior = junior;
	}

	public String getSenior() {
		return senior;
	}

	public void setSenior(String senior) {
		this.senior = senior;
	}
	//toString()

	@Override
	public String toString() {
		return "Student [status=" + status + ", freshmen=" + freshmen + ", sophmore=" + sophmore + ", junior=" + junior
				+ ", senior=" + senior + "]";
	}
	
	
	
}

	


