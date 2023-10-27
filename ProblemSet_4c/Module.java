package ProblemSet_4c;

public class Module {
	private String code;
	private double average;
	
	public Module(String code, double average) {
		this.code = code;
		this.average = average;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public double getAverage() {
		return this.average;
	}
	
	public String toString() {
		return this.code + ": " + this.average + "\n";
	}
}
