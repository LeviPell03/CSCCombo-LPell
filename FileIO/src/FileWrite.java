import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
// import java.io.FileOutputStream;
import java.io.*;
public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myFile = new File("C:\\Users\\S03027105\\testwritehome.txt");
		if (!myFile.exists()) {
			if (myFile.createNewFile() ) {
				System.out.println("New file created" +myFile.getName());
			}
		}
		
		// PrintWriter printer = new PrintWriter(myFile.getName());
		PrintWriter printer = new PrintWriter(new FileOutputStream(myFile, false));
		printer.println("The moon is full today");
		printer.println("I'm excited!");
		printer.println("It's an auspicious day!");
		
		// printer.flush();
		printer.close();

	}

}
