package ProblemSet_2a;

public class Student {
	
	private String forename;
	private String surname;
	private Integer age;
	
	public Student(String newForename, String newSurname, Integer newAge) {
		forename = newForename;
		surname = newSurname;
		age = newAge;
	}
	
	public Integer getAge(){
		return age;
	}
	public String getFullname() {
		return forename + " " + surname;
	}
	public void setAge(Integer newAge) {
		age = newAge;
	}
	public void setForename(String newForename) {
		forename = newForename;
	}
	public void setSurname(String newSurname) {
		surname = newSurname;
	}
}