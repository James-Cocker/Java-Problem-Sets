package ProblemSet_5c;

public class Pizza {
	private String[] toppings;
	
	public void addToppings(String[] toppings) {
		this.toppings = toppings;
	}
	
	public String printToppings() {
		String toppingsText = "";
		for (int i = 0; i <= this.toppings.length-1; i++) {
			toppingsText += this.toppings[i] + ",";
		}
		return toppingsText.substring(0, toppingsText.length()-1);
	}
	
	public double calculateCost() {
		if (this.toppings != null) {
			int numToppings = this.toppings.length;
			System.out.println(numToppings);
			if(numToppings == 0) {
				return 0.00;
			}
			else if (numToppings == 1) {
				return 9.99;
			}
			else if (numToppings == 2 || numToppings == 3) {
				return 10.99;
			}
			else if (numToppings == 4 || numToppings == 5) {
				return 11.99;
			}
			else if (numToppings == 10) {
				return 14.99;
			}
			else {
				return (numToppings - 5) + 11.99;
			}
		}
		else {
			return 0.00;
		}
	}
}
