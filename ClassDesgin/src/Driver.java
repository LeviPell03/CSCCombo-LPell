
public class Driver {

	public static void main(String[] args) {
		Car myCar = new Car("Green", 3456, 20.0);
		System.out.println(myCar);
		
		Car otherCar = new Car("Pink");
		
		String col = myCar.getColor();
		System.out.println("The color of my car is : " + myCar.getColor());
	
	}

}
