import java.util.Scanner;
public class BeverageSelector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number corresponding to your beverage choice: \n" +
                "1. Water\n" +
                "2. Coke\n" +
                "3. Coffee");

        int beverageChoice = in.nextInt();
        String beverageName = getBeverageName(beverageChoice);

        if (beverageName != null) {
            System.out.println("You picked: " + beverageName);
        } else {
            System.out.println("Invalid choice. Please choose from 1 to 3.");
        }
    }
    public static String getBeverageName(int beverageChoice) {
        String beverageName = null;

        switch (beverageChoice) {
            case 1:
                beverageName = "Water";
                break;
            case 2:
                beverageName = "Coke";
                break;
            case 3:
                beverageName = "Coffee";
                break;
            default:
                beverageName = null;
        }

        return beverageName;
    }
}
