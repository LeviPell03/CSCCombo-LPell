import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Here I imported a Scanner by using Java's utility. Then, I created a new Scanner by telling Java to create one.
        // int grade is setting the variable for grade as a number. Yeah, not a decimal number, just a number. If I was to make it a double, decimal numbers would be available.
        int grade;
        // System.out is what I want to tell Java to print to the console.
        System.out.println("Hey! Please enter your numeric grade. Thank you.");
        // in.nextInt takes the users number and prints it to the console next.
        grade = in.nextInt();
        /* Here I have my "if" and "else if" statements that take the input (grade) and evaluate it to see if it is greater than or equal to or less than or equal to the letter grade scale.
        if the grade is greater than or equal to 92 you got an A. If the grade is greater than or equal to 89  you got an A- and so on and so forth. If your grade is less than 0... Well,
        you fail and the program tells you to stop it, leave it alone, go away.
        */
        if (grade >= 92) {
            System.out.println("A");
        } else if (grade >= 89) {
            System.out.println("A-");
        } else if (grade >= 87) {
            System.out.println("B+");
        } else if (grade >= 82) {
            System.out.println("B");
        } else if (grade >= 79) {
            System.out.println("B-");
        } else if (grade >= 77) {
            System.out.println("C+");
        } else if (grade >= 72) {
            System.out.println("C");
        } else if (grade >= 69) {
            System.out.println("C-");
        } else if (grade >= 67) {
            System.out.println("D+");
        } else if (grade >= 60) {
            System.out.println("D");
        } else if (grade >= 0) {
            System.out.println("F");
        } if (grade <= -1) {
         // System.out go away. STOP
            System.out.println("Error. Nope. Try again.");
        }
    }
}


