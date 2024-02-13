import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        double radius;
        System.out.println("Hey! Please enter a radius. Thank you.");
        radius = in.nextDouble();

        double diameter = 2 * radius;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println(" The diameter of you circle is: " + diameter + "\n");
        System.out.println("The area of your circle is: " + area + "\n");
        System.out.println("The circumference of your circle is: " + circumference + "\n");
        System.out.println("Thank you for using this program.");


    }
}