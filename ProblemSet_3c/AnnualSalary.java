package ProblemSet_3c;

public class AnnualSalary {
	private double salary;
	private double PERSONAL_ALLOWANCE = 12570;

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double calculateTax() {
		if (salary <= PERSONAL_ALLOWANCE) {
			return 0;
		}
		else if (salary <= 50270) {
			return (salary-12570)*0.2;
		}
		else if (salary <= 125140) {
			return (((salary-50270)*0.4) + ((50270-12570)*0.2));
		}
		else {
			return ((salary-125140)*0.45 + (125140-50270)*0.4) + ((50270-12570)*0.2);
		}
	}
}
