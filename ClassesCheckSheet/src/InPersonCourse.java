
public class InPersonCourse extends Course {
	private int roomNumber;

	// Constructors
	public InPersonCourse(int roomNumber) {
		super();
		this.roomNumber = roomNumber;
	}

	// Getters and Setters
	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}
