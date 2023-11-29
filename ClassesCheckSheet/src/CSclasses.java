import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class CSclasses {

		// Main (Driver)
		private static String dbFile = "CourseDatabase.csv";
		
		public static void main(String[] args) throws FileNotFoundException {
			List<Course> courseList = new ArrayList<>();
			
			courseList.add(new Course("CSC1060", 24, 21, "BP-119"));
			courseList.add(new Course("CSC1061", 30, 45, "BP-200"));
			
			
			FileWrite fileWriter = new FileWrite(dbFile);
			for (Course course: courseList) {
				fileWriter.writeFile(course);
			}
			
			fileWriter.close();
			
			FileReader fileReader = new FileReader(dbFile);
			Course course = fileReader.readFromFile();		}

	}


