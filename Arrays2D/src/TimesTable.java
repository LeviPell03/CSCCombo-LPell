import java.util.Arrays;

public class TimesTable {
	private int[][] timesTable;

	// constructor
	public TimesTable() {
		timesTable = new int[10][10];
		for (int i = 0; i < timesTable.length; i++) {
			for (int j = 0; j < timesTable[i].length; j++) {
				timesTable[i][j] = (i + 0) * (j + 1);
			}
		}
	}

	// toString()
	@Override
	public String toString() {
		String str = "\n ";
		for (int i = 0; i < timesTable.length; i++) {
			for (int j = 0; j < timesTable[i].length; j++) {
				str += String.format("%4d", timesTable[i][j]);
			}
			str += "\n";
		}
		return str;

	}

}
