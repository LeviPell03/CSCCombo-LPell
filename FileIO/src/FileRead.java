import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Main
		File readFile = new File("C:\\Users\\S03027105\\testwritehome.txt");
		Scanner input = new Scanner(readFile);
		
		while (input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
			input.close();
			
			File dir = new File("C:\\Users\\S03027105");
			if (dir.isDirectory()) {
				File [] fileList = dir.listFiles();
				for (File file: fileList) {
					System.out.println(file);
					input.close();
				}
				
		}
		
		// String line1 = input.nextLine();
		// System.out.println(line1);
	}
	
	}

}
