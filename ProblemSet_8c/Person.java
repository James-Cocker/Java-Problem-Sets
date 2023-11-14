package ProblemSet_8c;

public class Person {
	private String forename;
	private String surname;
	private int age;
	
	public Person(String fn, String sn, int age) {
		forename = fn;
		surname = sn;
		this.age = age;
	}
	
	public String getForename() {
		return forename;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return forename + " " + surname + " (" + age + ")";
	}
}
