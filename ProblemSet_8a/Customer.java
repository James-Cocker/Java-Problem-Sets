package ProblemSet_8a;

public class Customer {
	private String name = null;
	private String surname = null;

	public Customer(String name, String surname) {
		if (validateInfo(name) && validateInfo(surname)) {
			this.name = name;
			this.surname = surname;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public char getName() {
		return name.charAt(0);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean validateInfo(String info) {
		String regex = "^[A-Z][a-z]*$";
		if (info.matches(regex)) {
			return true;
		}
		return false;
	}

	public String toString() {
		return getName() + ". " + surname;
	}
}
