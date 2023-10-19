
public class Driver {

	public static void main(String[] args) {
		Car myCar = new Car ();
		System.out.println(myCar);
		myCar.drive(10);
		System.out.println(myCar);
		myCar.selfClean();
		myCar.fillGas(20);
		
		myCar.setWheels(14, "Alloy");

		Wheel[] wheels = myCar.getWheels();
		for (Wheel wheel : wheels) {
			System.out.println(wheel);

			Car otherCar = new Car("Pink");

			String col = myCar.getColor();
			System.out.println("The color of my car is : " + myCar.getColor());
		}
		Person myPerson = new Person ("Levi", "Pell", 25, 71, 2);
		myPerson.getJeep()[1].drive(15);
	}

}
