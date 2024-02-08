import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // I imported a Scanner by telling java to go into It's utility and give me a Scanner. Then, I made a new Scanner by telling java to create a new Scanner.
        Scanner in = new Scanner(System.in);
        // My System.out tells java that I want to say something to it. What I say goes to the console.
        System.out.println("Hey! Please enter a temperature in Fahrenheit. Thank you.");
        // Whatever number the user inputs in response to the System.out is going to be the next thing that is printed to the console.
        double Fahrenheit = in.nextDouble();
        // Method to convert Fahrenheit to Celsius. I use a double because it is able to store a decimal number.
        double Celsius = (Fahrenheit - 32) * 5 / 9;
        // Method to convert Fahrenheit to Kelvin. Just like above, I use a double to store a decimal number.
        double Kelvin = Celsius + 273.15;
        // This System.out prints the temperature in both Celsius and Kelvin to the console on two separate lines. "\n" tells java to print what is after it to a new line.
        System.out.println("Your temperature in Celsius is: " + Celsius + "°C" + "\n" + "Your temperature in Kelvin is: " + Kelvin + " " + "K" + "\n" + "Thank you for using this program.");
    }
}
