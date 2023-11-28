import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class FileWrite {

	File writeFile = new File("C:\\Users\\S03027105\\CourseCSV.csv");
	
	if(!writeFile.exists() ) {
		if(writeFile.createNewFile() ) {
			System.out.println("New file created" + writeFile.getName());
		}
	}
}
