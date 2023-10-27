package ProblemSet_4c;

public class Student {
	private char initial;
	private String surname;
	private Module[] modules;
	
	public Student(char initial, String surname) {
		this.initial = initial;
		this.surname = surname;
		this.modules = new Module[8];
	}
	
	public int calculateYearAverage() {
		int counter = 0;
		int total = 0;
		for (int i = 0; i <= 7; i++) {
			if (this.modules[i] != null){
				total += this.modules[i].getAverage();
				counter++;
			}
		}
		return total/counter;
	}
	
	public String displayArray() {
		String totalText = "";
		for (int i = 0; i <= 7; i++) {
			if (this.modules[i] != null){
				totalText += this.modules[i].toString();
			}
		}
		return totalText + "Year Average: " + calculateYearAverage() + "%";
	}
	
	public Module getModules(int index) {
		return this.modules[index];
	}
	
	public String getStudentDetails() {
		return this.initial + ". " + this.surname + " " + calculateYearAverage() + "%" ;
	}
	
	public void setModules(int index, String code, double average) {
		modules[index] = new Module(code, average);
	}
}
