package ProblemSet_5c;
import java.util.List;
import java.util.ArrayList;

public class Order {
	private List<Pizza> pizzas;
	private Customer customer;
	
	public Order(Customer customer) {
		this.customer = customer;
		this.pizzas = new ArrayList<Pizza>();
	}
	
	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
	}
	
	public double calculateTotal() {
		double totalCost = 0.00;
		System.out.println("Customer: " + this.customer.getName().substring(0,1) + ". " + this.customer.getSurname());
		for (int i = 0; i <= pizzas.size()-1; i++) {
			totalCost += pizzas.get(i).calculateCost();
		}
		System.out.println();
		return totalCost;
	}
	
	public String printReceipt() {
		return "Customer: " + this.customer.getName().substring(0,1) + ". " + this.customer.getSurname()+
				"\nNumber of Pizzas: " + howManyPizzasInOrder() + "\nTotal Cost: " + calculateTotal();
	}
	
	public int howManyPizzasInOrder() {
		return pizzas.size();
	}
}
