
public class Wheel {
	private String material;
	private int radius;
	
	// Constructor
	public Wheel (String material, int radius) {
		this.material = material;
		this.radius = radius;
	}
	// Getters and setters
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	// Methods
	public void installTire() {
		System.out.println("The wheel has a tire!");
	}
	
	
	public String toString() {
		return "Wheel [material=" + material + ", radius=" + radius + "]";
	}
	
	
}	
