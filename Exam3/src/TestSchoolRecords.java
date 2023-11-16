import java.util.ArrayList;
import java.util.List;

public class TestSchoolRecords {

	public static void main(String[] args) {
		// Main (Driver)
		Student myStudentOne = new Student("Sarah","I live here" , 970333123, "Sarahflower.com", "freshmen", null, null, null, null);
		Student myStudentTwo = new Student("Max", "I live over there drive", 970675789,"axMax.com", "sophmore", null, null, null, null);
		Faculty myFacultyOne = new Faculty("I work 9 to 5", "junior", 0, null, null, 0, 0);
		Faculty myFacultyTwo = new Faculty("I work 8 to 3", "senior", 0, null, null, 0, 0);
		Staff myStaffOne = new Staff("Teacher", null, 0, null, null, 0, 0);
		Staff myStaffTwo = new Staff("Athlete", null, 0, null, null, 0, 0);
		
		List<Person> persons = new ArrayList<>();
		persons.add(myStaffOne);
		persons.add(myFacultyOne);
		persons.add(myStudentTwo);
		persons.add(myStudentOne);
		persons.add(myStaffTwo);
		persons.add(myFacultyTwo);
		System.out.println();
		
		System.out.println(persons);

	}

}
