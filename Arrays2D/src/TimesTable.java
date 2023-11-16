/* Copyright notice. Be warned! Don't use my code. Stop.
 * 
 */


import java.util.Arrays;
/**
 * This is a public class that makes a Times table.
 * @author Levi, Pell
 * @version 0.0.1
 */
 
public class TimesTable {
	/**
	 * My class sets my Times table Array. It's private so that it can't be changed. 
	 */
	private int[][] timesTable;

	
	
	// constructor
	/**
	 * Makes a method to set the parameters of my Times table.
	 * 
	 * 
	 */
	public TimesTable() {
		timesTable = new int[10][10];
		for (int i = 0; i < timesTable.length; i++) {
			for (int j = 0; j < timesTable[i].length; j++) {
				timesTable[i][j] = (i + 0) * (j + 1);
			}
		}
	}
	
	
	// toString()
	/**
	 * Uses a toString() to print out my Times table.
	 * 
	 * 
	 * @return String representation of the object.
	 */
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
