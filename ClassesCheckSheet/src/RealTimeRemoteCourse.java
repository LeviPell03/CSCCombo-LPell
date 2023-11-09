
public class RealTimeRemoteCourse extends OnlineCourse {
	private String zoomInformation;

	// Constructor
	public RealTimeRemoteCourse(String zoomInformation) {
		super();
		this.zoomInformation = zoomInformation;
	}

	// Getters and Setters

	public String getZoomInformation() {
		return zoomInformation;
	}

	public void setZoomInformation(String zoomInformation) {
		this.zoomInformation = zoomInformation;
	}

}
