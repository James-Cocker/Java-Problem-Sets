package ProblemSet_5b;

public class Customer {
	private String name;
	private String surname;
	
	public Customer(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getFirstName() {
		return this.name;
	}
	
	public char getName() {
		return this.name.substring(0,1).charAt(0);
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public String toString() {
		return getName() + ". " + this.surname;
	}
}
	