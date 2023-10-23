
public class Course {
	// data members, attributes etc.
	private String courseNum;
	private int numStudents;
	private int maxStudents;
	double credits;
	
	// no arg
	public Course () {
		
	}
	
	// Constructors
	public Course(String cSC1060, int numStudents, int maxStudents, double credits) {
		super();
		courseNum = cSC1060;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}
	
	// getters, setters

	public String getCSC1060() {
		return courseNum;
	}

	public void setCourseNum(String cSC1060) {
		courseNum = cSC1060;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = credits;
	}
	//toString
	@Override
	public String toString() {
		return "Course [CSC1060=" + courseNum + ", numStudents=" + numStudents + ", maxStudents=" + maxStudents
				+ ", credits=" + credits + "]";
		
	}
	
	
	
	
	
	
}
