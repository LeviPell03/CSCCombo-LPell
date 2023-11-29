import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class FileWrite {

	private PrintWriter printer;
	
	public FileWrite (String dbFile) throws FileNotFoundException {
		File courseFile = new File (dbFile);
		printer = new PrintWriter (new FileOutputStream(courseFile, true));
	}
	
	public void writeFile(Course course) {
		printer.println(course.dbString());
	}
	
	public void close() {
	printer.close();
}

	
		
}