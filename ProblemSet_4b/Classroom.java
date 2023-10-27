package ProblemSet_4b;

public class Classroom {
	private String room;
	private int CAPACITY;
	private Student[] maxStudents;
	
	public Classroom(String room) {
		this.room = room;
		this.CAPACITY = 20;
		this.maxStudents = new Student[this.CAPACITY]; 
	}
	
	public String getRoom() {
		return this.room;
	}
	
	public int getCapacity() {
		return this.CAPACITY;
	}
	
	public void addStudents(int index, char initial, String surname) {
		this.maxStudents[index] = new Student(initial, surname);
	}
	
	public String getSummary() {
		String allStudents = "";
		for (int i = 0; i <= this.CAPACITY-1; i++) {
			if (this.maxStudents[i] != null) {
				allStudents += this.maxStudents[i].getStudentDetails();
			}
		}
		if (allStudents == "") {
			return "No students added";
		}
		return allStudents;
	}
	
	public int howManyStudents() {
		int counter = 0;
		for (int i = 0; i <= this.CAPACITY-1; i++) {
			if (this.maxStudents[i] != null) {
				counter++;
			}
		}
		return counter;
	}
}
