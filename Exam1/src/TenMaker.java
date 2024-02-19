import java.util.Scanner;
public class TenMaker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (makes10(num1, num2)) {
            System.out.println("The numbers added up to 10! ");
        } else {
            System.out.println("The numbers didn't add up to 10. ");
        }
    }
    public static boolean makes10(int num1, int num2) {
        return (num1 + num2 == 10);
    }
}

