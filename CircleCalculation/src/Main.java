import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //I told java to import a Scanner from its utility. Then, I made a new Scanner by telling Java to create one.
        Scanner in = new Scanner(System.in);

        double radius;
        // My System.out is what I want to tell Java. Java prints what I say to the console for me.
        System.out.println("Hey! Please enter a radius. Thank you.");
        // in.nextDouble will take the users input and print it to the console next.
        radius = in.nextDouble();
        // Functions for the diameter, area and circumference of a circle.
        double diameter = 2 * radius;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        // Here I have called the functions in System.out to print the diameter, area circumference of the circle.
        System.out.println(" The diameter of you circle is: " + diameter + "\n");
        System.out.println("The area of your circle is: " + area + "\n");
        System.out.println("The circumference of your circle is: " + circumference + "\n");
        System.out.println("Thank you for using this program.");
    }
}