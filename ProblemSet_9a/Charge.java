package ProblemSet_9a;

public class Charge {
	private Service service;
	private double charge;

	public Charge(Service service, double charge) {
		if (charge <= 0) {
			throw new IllegalArgumentException();
		} else {
			this.service = service;
			this.charge = charge;
		}
	}

	public Service getService() {
		return service;
	}

	public double getCharge() {
		return charge;
	}

	public double calculateVAT() {
		double vat = 0.0;
		// If low, return 5% of the charge
		if (service.getRate() == VATRate.LOW) {
			vat = charge * 0.05;
		} else if (service.getRate() == VATRate.STANDARD) {
			// If standard, return 20% of the charge
			vat = charge * 0.2;
		}
		// Otherwise, when vat rate is zero, return 0.0
		return vat;
	}
}
