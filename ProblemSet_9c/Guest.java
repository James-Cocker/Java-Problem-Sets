package ProblemSet_9c;

import java.util.ArrayList;
import java.util.List;

public class Guest implements IGuest {
	private String forename;
	private String surname;
	private String address;
	private String telephone;
	private List<Charge> charges;

	public Guest(String forename, String surname,
			String address, String telephone) {
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		charges = new ArrayList<Charge>();
	}

	// Getters
	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	}

	public String getAddress() {
		return address;
	}

	public String getTelephone() {
		return telephone;
	}

	public List<Charge> getCharges() {
		return charges;
	}

	// Main methods
	public void addCharge(Service s, double c) {
		charges.add(new Charge(s, c));
	}

	public double calculateTotalChargeWithoutVAT() {
		double totCharge = 0.0;
		// Sum all charges in the 'charges' list
		for (Charge c: charges) {
			totCharge += c.getCharge();
		}
		return totCharge;
	}

	public double calculateVATChargeAtRate(VATRate r) {
		double totCharge = 0.0;
		// Sum all charges for specified VATRate in the 'charges' list
		for (Charge c: charges) {
			if (c.getService().getRate() == r) {
				totCharge += c.calculateVAT();
			}
		}
		return totCharge;
	}

	public double calculateTotalChargeIncVat() {
		return calculateTotalChargeWithoutVAT()
				+ calculateVATChargeAtRate(VATRate.LOW)
				+ calculateVATChargeAtRate(VATRate.STANDARD);
	}

	public String toString() {
		return forename + " " + surname + ", " + address
				+ ", " + telephone;
	}
}
