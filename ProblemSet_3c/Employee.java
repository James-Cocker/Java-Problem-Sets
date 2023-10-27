package ProblemSet_3c;

public class Employee {
	private int id;
	private String forename;
	private String surname;
	private AnnualSalary salary;
	private Position companyPosition;
	
	public Employee(int id, String forename, String surname, AnnualSalary salary, Position companyPosition) {
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.salary = salary;
		this.companyPosition = companyPosition;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getForename() {
		return this.forename;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public double getSalary() {
		return this.salary.getSalary();
	}
	
	public String getPositionName() {
		return companyPosition.getRoleName();
	}
	
	public void displayEmployeeName() {
		System.out.println(this.forename + " " + this.surname);
	}
	
	private boolean eligibleForBonus() {
		if (this.salary.getSalary() > 40000) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String bonus = "";
		if (eligibleForBonus()) {
			bonus = " tax) and is eligible for bonus.";
		}
		else {
			bonus = " tax) and is not eligible for bonus.";
		}
		return this.surname+", "+this.forename+" ("+this.id+"): "+this.companyPosition.getRoleName()+" at £"+this.salary.getSalary()+" (£"+this.salary.calculateTax()+bonus;
	}
}
