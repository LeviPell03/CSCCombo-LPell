import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Imported a Scanner which I called "myScanner" from java's utility.
        Scanner myScanner = new Scanner(System.in);
        // The input from the user is the starting String.
        String currentString = getStartingString(myScanner);
        // Switch statements for each option of the menu call my functions into main.
        int option;
        do {
            optionsMenu();
            option = selectMyOption(myScanner);
            switch (option) {
                case 1:
                    currentString = addToString(myScanner, currentString);
                    break;
                case 2:
                    checkMySubstring(myScanner, currentString);
                    break;
                case 3:
                    outputStringLength(currentString);
                    break;
                case 4:
                    outputTheSubstringAfterPrefix(myScanner, currentString);
                    break;
                case 5:
                    outputTheSubstringBeforeSuffix(myScanner, currentString);
                    break;
                case 6:
                    outputTheSubstringBetweenPrefixAndSuffix(myScanner, currentString);
                    break;
                case 7:
                    System.out.println("Thank you for using this program.");
                    break;
                default:
                    System.out.println("No that's not an option. Please try again.");
            }
            // While none of the menu options equal 7 you have to enter another option that is 1-7.
        } while (option != 7);
        myScanner.close();
    }

    // Function for getting a String. It takes the user's input and prints it on the next line.
    public static String getStartingString(Scanner myScanner) {
        System.out.print("Hey! Please enter a starting string. Thank you: ");
        return myScanner.nextLine();

    }

    // Function for the option menu. It is a series of System.out.
    public static void optionsMenu() {
        System.out.println();
        System.out.println("Please pick an option: ");
        System.out.println("1. Add content.");
        System.out.println("2. Check if string contains.");
        System.out.println("3. Output length.");
        System.out.println("4. Output substring after prefix.");
        System.out.println("5. Output substring before suffix.");
        System.out.println("6. Output substring between prefix and suffix.");
        System.out.println("7. Exit.");
    }

    // Function for selecting an option by inputting an int.
    public static int selectMyOption(Scanner myScanner) {
        System.out.print("Enter an option number: ");
        return myScanner.nextInt();
    }

    /* Function for adding to the String. The user can input more to add to the String to make it the current String.
    I couldn't figure out how to add a space between the old portion of the substring and the add portion. It's been a long week, how do I do it?
    Help me, please.
     */
    public static String addToString(Scanner myScanner, String currentString) {
        System.out.print("Enter content to add: ");
        String newContent = myScanner.next();
        System.out.println();
        currentString += newContent;
        System.out.println("Current string: " + " " + currentString);
        return currentString;
    }

    // Function to check to see if your substring is in your String.
    public static void checkMySubstring(Scanner myScanner, String currentString) {
        System.out.print("Enter substring to check: ");
        String substring = myScanner.nextLine();
        System.out.println();
        if (currentString.contains(substring)) {
            System.out.println();
            System.out.println("Yes. Your string contains the substring.");
        } else {
            System.out.println("No. Your string does not contain the substring.");
        }
    }

    // Function that outputs the length of your String. It uses currentString.length.
    public static void outputStringLength(String currentString) {
        System.out.println("The length of your string is: " + currentString.length());
    }

    // Function that outputs the substring after the prefix. I'm not sure if this works properly.
    public static void outputTheSubstringAfterPrefix(Scanner myScanner, String currentString) {
        System.out.print("Enter prefix: ");
        System.out.println();
        String prefix = myScanner.next();
        String substring = currentString.substring(currentString.indexOf(prefix) + prefix.length());
        System.out.println("Substring: " + substring);
    }

    // Function that outputs the substring before the suffix. Again, I'm not sure if this works properly.
    public static void outputTheSubstringBeforeSuffix(Scanner myScanner, String currentString) {
        System.out.print("Enter suffix: ");
        String suffix = myScanner.next();
        String substring = currentString.substring(currentString.lastIndexOf(suffix));
        System.out.println("Substring: " + substring);
    }

    // Function that outputs the Substring between the prefix and suffix. I'm pretty sure that my startIndex and endIndex are broken or don't work properly.
    public static void outputTheSubstringBetweenPrefixAndSuffix(Scanner myScanner, String currentString) {
        System.out.print("Enter prefix: ");
        String prefix = myScanner.next();
        System.out.print("Enter suffix: ");
        String suffix = myScanner.next();
        int startIndex = currentString.indexOf(prefix) + prefix.length();
        int endIndex = currentString.lastIndexOf(suffix) + suffix.length();
    }
}


