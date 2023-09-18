import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	 
	final double PI = 3.141592653;
	
	
	System.out.println("Please enter radius of the circle");
	int r = input.nextInt();
	
	int d = 2 * r;
	double circumference = 2 * PI * r;
	
	double area = PI * r * r;
	
	System.out.println("Diameter of circle is " + d);
	System.out.println("Circumference of the circle is " + circumference);
	System.out.println("Area of circle is " + area);
	
	
	
	}

}
