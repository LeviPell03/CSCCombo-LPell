import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TotalCalculation {
    public static void main(String[] args) {
        try {

            File myItemsFile = new File("C:\\Users\\kiyon\\CSCCombo-LPell\\TotalCalculation\\src\\items.txt");
            Scanner in = new Scanner(myItemsFile);


            double total = 0.0;


            while (in.hasNextDouble()) {
                total += in.nextDouble();
            }

            double subTotal = total;
            double tax = subTotal * 0.053;
            double finalTotal = subTotal + tax;


            File myTotalFile = new File("C:\\Users\\kiyon\\CSCCombo-LPell\\TotalCalculation\\src\\total.txt");
            FileWriter writer = new FileWriter(myTotalFile);


            writer.write("The sub-total is $" + String.format("%.2f", subTotal) + "\n");
            writer.write("The tax is $" + String.format("%.2f", tax) + "\n");
            writer.write("The total is $" + String.format("%.2f", finalTotal) + "\n");


            writer.close();

            System.out.println("Yay! Your results were written to the total.txt");
        } catch (IOException e) {
            System.err.println("Nope. There was an error reading or writing your file: " + e.getMessage());
        }
    }
}