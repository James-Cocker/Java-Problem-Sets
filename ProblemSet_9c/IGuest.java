package ProblemSet_9c;

public interface IGuest {
	void addCharge(Service s, double c);
	double calculateTotalChargeWithoutVAT();
	double calculateVATChargeAtRate(VATRate r);
	double calculateTotalChargeIncVat();
	String toString();
}
