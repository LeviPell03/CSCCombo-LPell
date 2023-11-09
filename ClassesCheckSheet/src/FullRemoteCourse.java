
public class FullRemoteCourse extends OnlineCourse {
	private String emailOfCourseContact;

	// Constructor
	public FullRemoteCourse(String emailOfCourseContact) {
		super();
		this.emailOfCourseContact = emailOfCourseContact;
	}

	// Getters and Setters
	public String getEmailOfCourseContact() {
		return emailOfCourseContact;
	}

	public void setEmailOfCourseContact(String emailOfCourseContact) {
		this.emailOfCourseContact = emailOfCourseContact;
	}

}
