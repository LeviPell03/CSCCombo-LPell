import java.util.Scanner;
<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        String line;
            Scanner in = new Scanner(System.in);
            System.out.println("What is your name?");
            in.nextLine();
        }

}
=======

public class Main {
    public static void main(String[] args) {
        // I imported a Scanner by going into Java's utility and telling it that I want a Scanner. Next, I made a new Scanner by telling Java to create a new Scanner.
        Scanner in = new Scanner(System.in);
        // I set variables for my System.out and for my "veryNiceToMeetYou" function. It also helps me make sure that I'm following the requirement for what I'm supposed to code.
        String name;
        String location;
        int age;
        String activity;
        double donation;
        String hobby;
        // Below are my System.out and System.in lines of code. I tell Java something with a System.out and request a response from the user with a System.in.
        System.out.print(" Hey! What's your name?");
        name = in.nextLine();
        System.out.print("Where are you from?");
        location = in.nextLine();
        System.out.print("How old are you?");
        age = in.nextInt();
        in.nextLine();
        System.out.print("What is your favorite activity?");
        activity = in.nextLine();
        System.out.println("Oh! I enjoy that activity too!");
        System.out.println();
        System.out.print("How much would you like to donate today?");
        donation = in.nextDouble();
        System.out.println("You will donate " + "$" + donation + "." + " Thank you for your donation.");
        in.nextLine();
        System.out.println();
        System.out.print("What's something that you like to do?");
        hobby = in.nextLine();
        System.out.println();
        // Here, I call my function "veryNiceToMeetYou" into main.
        System.out.println(veryNiceToMeetYou(name, location, age, donation, hobby));
        System.out.println();
        System.out.println("Our goal here at SpaceX is to revolutionize space technology with the ultimate aim of enabling humanity to live on other planets. Thank you for telling us about yourself and for your very generous donation to SpaceX.");
    }

    public static String veryNiceToMeetYou(String name, String location, int age, double donation, String hobby) {
        // My function "veryNiceToMeetYou" returns a String.
        return ("Hello," + name + " from" + location + "." + " You are " + age + " years old. " + "\n" + "Have fun the next time you" + hobby + "!" + "\n" + "You donated " + "$" + donation + " today. " + "Yay!");
    }
}
>>>>>>> 42c01fb933cd7d8ce9062222782f721ab245396b
