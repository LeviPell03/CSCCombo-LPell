
public class SteeringWheel {

	//
	private String material;
	private int diameter;
	private boolean airBags;
	public String getMaterial() {
		return material;
		
		
		// getters setters
	}
	public SteeringWheel(int i, boolean b, String string) {
		super();
		this.material = material;
		this.diameter = diameter;
		this.airBags = airBags;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public boolean isAirBags() {
		return airBags;
	}
	public void setAirBags(boolean airBags) {
		this.airBags = airBags;
	}
	
// method
	public String honk() {
	 return "beep beep";
	}
	
	
	// toString()
	@Override
	public String toString() {
		return "SteeringWheel [material=" + material + ", diameter=" + diameter + ", airBags=" + airBags + "]";
	}
	
	
	
	
}
