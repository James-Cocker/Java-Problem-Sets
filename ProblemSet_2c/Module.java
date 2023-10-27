package ProblemSet_2c;

public class Module {
	private String NAME = "COM1027";
	private Assessment assessment1;
	private Assessment assessment2;
	private Assessment assessment3;

	public Module(Assessment newAssessment1, Assessment newAssessment2, Assessment newAssessment3) {
		this.assessment1 = newAssessment1;
		this.assessment2 = newAssessment2;
		this.assessment3 = newAssessment3;
	}
	
	public double calculateAverage() {
		return ((this.assessment1.getMark()*0.2) + (this.assessment2.getMark()*0.2) + (this.assessment3.getMark()*0.6));
	}
	
	public String toString() {
		return NAME + " (" + calculateAverage() + "%)";
	}
}
