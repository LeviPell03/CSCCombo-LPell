import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Methods = what is visible in the project.
        // You can have functions that do different things.

        // Conditional logic

        // Boolean = true or false
        Scanner in = new Scanner(System.in);
        int num = 5;
        int sum = num + 5;
        // < = less than
        // > = greater than
        // <= = less than or equal to
        // >= greater than or equal to
        // == = equal to
        // != = not equals
        // else
        // else if
        // && = and
        // || = or
        // switches might not be the best to compare numbers
        if (sum < 3) {
            System.out.println("horray");
        } else if (sum == 10) {
            System.out.println("Yep");
        } else {
            System.out.println("Nah");
        }
    }
}
