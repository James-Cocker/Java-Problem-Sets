package ProblemSet_6a;

public class Ingredient {
	private String name;
	private IngredientType type;
	private Supplier supplier;
	private double rawWeight;

	/*Requirements: An Ingredient object represents an ingredient that has been 
	 * added to an item. This consists of a name, type, supplier and raw (uncooked) 
	 * weight (g). No Ingredient object can be created without a name, type, supplier, 
	 * and an amount for the raw weight. No additional validation is performed on these 
	 * ﬁelds. The Ingredient class provides a method to calculate the cooked weight of 
	 * the ingredient. The cooked weight of any ingredient is simply assumed to be 80% 
	 * of the raw weight (g).*/
	
	public Ingredient(String name, IngredientType type, Supplier supplier, double rawWeight) {
		if(name != null && type != null && supplier != null) {
			this.name = name;
			this.type = type;
			this.supplier = supplier;
			this.rawWeight = rawWeight;
		}
		else {
			throw new NullPointerException();
		}
	}

	public String getName() {
		return this.name;
	}

	public IngredientType getType() {
		return this.type;
	}

	public String getSupplier() {
		return this.supplier.toString();
	}

	public double getRawWeight() {
		return this.rawWeight;

	}

	public double getCookedWeight() {
		return this.rawWeight * 0.8;
	}
}
