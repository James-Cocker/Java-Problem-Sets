package ProblemSet_8b;

import java.io.BufferedReader;
import java.io.FileReader;

public class Counting {
	public Counting(){}
	
	public String readTextFile(String fileName) {
		if (fileName != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(fileName));
				String line = reader.readLine();
				String output = "";
				int counter = 0;
				while (line != null) {
					output += displayLine(line, counter);
					counter++;
					line = reader.readLine();
				}
				reader.close();
				return output;
			} catch (Exception e){
				throw new IllegalArgumentException();
			}
		} else {
			throw new NullPointerException();
		}
		
	}
	
	private String displayLine(String line, int counter) {
		return line + " : " + (counter+1) + "\n";
	}
}
