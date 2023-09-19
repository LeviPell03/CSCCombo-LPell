import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final double PI = 3.141592653;

		System.out.println("Please enter radius of the circle");
		int radius = input.nextInt();

		int d = 2 * radius;
		double circumference = 2 * PI * radius;

		double area = PI * radius * radius;

		System.out.println("Diameter of circle is " + d);
		System.out.println("Circumference of the circle is " + circumference);
		System.out.println("Area of circle is " + area);

	}

	public static double computeArea(double radius) {
		return PI * radius * radius;
	}

	public static double computeVolume(double area) {
		return 

	}

}
