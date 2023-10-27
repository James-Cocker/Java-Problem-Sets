package ProblemSet_2b;

public class Food {
	private String name;
	private double amountOfSugar;
	
	public Food(String newName, double newAmountOfSugar) {
		name = newName;
		amountOfSugar = newAmountOfSugar;
	}
	
	public double getAmountOfSugar() {
		return amountOfSugar;
	}
	
	public String getName() {
		return name;
	}
}
