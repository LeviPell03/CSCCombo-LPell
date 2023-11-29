import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	private Scanner input;
	public FileReader(String dbFile) throws FileNotFoundException {
		File courseFile = new File(dbFile);
		input = new Scanner(courseFile);
	}
	
	public Course readFromFile() {
		if (input.hasNextLine()) {
			String line = input.nextLine();
			String[] tokens = line.split(",");
			for (String token: tokens) {
				System.out.println(token);
				
			}
		}
		
		else {
			return null;
		}
		return null;
	}
	
	
}
