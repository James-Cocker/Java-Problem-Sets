package ProblemSet_2b;

public class Meal {
	private Food mainCourse;
	private Food dessert;
	
	public Meal(Food newMainCourse, Food newDessert) {
		mainCourse = newMainCourse;
		dessert = newDessert;
	}
	
	public double calculateTotalSugarLevel() {
		return mainCourse.getAmountOfSugar() + dessert.getAmountOfSugar();
	}
	
	// Example: Meal [mainCourse = Vegetarian Stuffed Peppers, dessert = Fruit Salad]"
	public String toString() {
		return "Meal [mainCourse = " + mainCourse.getName() + ", dessert = " + dessert.getName() + "]";
	}
}
