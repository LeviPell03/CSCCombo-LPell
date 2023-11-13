import java.util.Arrays;

public class TimesTable {
	private int[][] timesTable;

	public TimesTable() {
		timesTable = new int[10][10];
		
			}

	@Override
	public String toString() {
		String str =" "; 
		for ( int i = 0; i < timesTable.length; i ++) {
			for (int j = 0; j < timesTable[i].length; j ++) {
				str += timesTable[i][j]+" ";
			}
			str+= "\n";
		}
		return String.format(str);
			
	}


}
