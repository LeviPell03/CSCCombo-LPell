
public class Course {
	// data members, attributes etc.
	private String courseNum;
	private int numStudents;
	private int maxStudents;
	double credits;

	// no arg
	public Course() {

	}

	// Constructors
	public Course(String courseNum, int numStudents, int maxStudents, double credits) {
		super();
		this.courseNum = courseNum;
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
		this.numStudents = 5;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = 10;
	}

	public double getCredits() {
		return credits;
	}

	public void setCredits(double credits) {
		this.credits = 6.5;
	}

	// toString
	
	@Override
	public String toString() {
		return "Course [courseNum=" + courseNum + ", numStudents=" + numStudents + ", maxStudents=" + maxStudents
				+ ", credits=" + credits + "]";
	}

	
	public String dbString() {
		return "Course" + "," + maxStudents + "," + numStudents + "," + credits;
		
		
	}


}
