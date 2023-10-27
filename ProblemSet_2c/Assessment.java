package ProblemSet_2c;

public class Assessment {
	private String name;
	private double mark;
	
	public Assessment(String newName, double newMark) {
		name = newName;
		mark = newMark;
	}
	
	public double getMark() {
		return mark;
	}
	
	public String getName() {
		return name;
	}
}
