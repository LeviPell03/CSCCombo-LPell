
public class CSclasses {

	public static void main(String[] args) {
		// Driver
		Course[] courseList = new Course[6];
		for (int i = 0; i < 3; i++) {
			courseList[i] = new Course();
		}
		courseList[0].setMaxStudents(20);
		courseList[0].setNumStudents(4);
		courseList[0].setCredits(75);
		courseList[0].setCourseNum("CSC1060");
		courseList[1].setCourseNum("CSC1061");
		courseList[1].setMaxStudents(0);
		courseList[1].setNumStudents(0);
		courseList[1].setCredits(0);
		courseList[2].setCredits(0);
		courseList[2].setCourseNum("CS");
		courseList[2].setMaxStudents(0);
		courseList[3] = new Course("CSC1061", 8, 10, 25);
		courseList[4] = new Course("CSC1062", 9, 20, 30);
		courseList[5] = new Course("CSC1063", 10, 30, 35);
		for (int i = 0; i < 6; i++) {
			System.out.println(courseList[i]);
		}

	}

}
