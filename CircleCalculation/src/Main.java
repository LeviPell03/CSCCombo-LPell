import java.util.Scanner;

public static void main(String[] args) {
    //  //I told java to import a Scanner from its utility. Then, I made a new Scanner by telling Java to create one.
    Scanner in = new Scanner(System.in);
    // My System.out is what I want to tell Java. Java prints what I say to the console for me.
    System.out.print("Hey! Please enter a radius. Thank you. ");
    System.out.println();
    double radius = in.nextDouble();
    // Adding my functions to main.
    double diameter = getDiameter(radius);
    double circumference = getCircumference(radius);
    double area = getArea(radius);
    // System.out for the diameter, area and circumference of a circle.
    System.out.println("The diameter of your circle is: " + diameter);
    System.out.println("The circumference of your circle is: " + circumference);
    System.out.println("The area of your circle is: " + area);
    System.out.println();
    System.out.println("Thank you for using this program.");
}

// Functions for the diameter, circumference and are of the circle.
public static double getDiameter(double radius) {
    return 2 * radius;
}

public static double getCircumference(double radius) {
    return 2 * Math.PI * radius;
}

public static double getArea(double radius) {
    return Math.PI * radius * radius;
}
