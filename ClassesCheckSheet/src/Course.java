
public class Course {
	// data members, attributes etc.
	private String name; 
	private int maxStudents;
	private int numStudents;
	private String room;

	// no arg
	public Course() {

	}

	// Constructors
	public Course(String name, int numStudents, int maxStudents, String room) {
		super();
		this.name = name;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.room = room;
	}
	
	
	public  String dbString (){
		return "Course" + ","  + maxStudents + "," + numStudents + "," + room;
		
		
	}


}
