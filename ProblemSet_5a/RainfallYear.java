package ProblemSet_5a;

public class RainfallYear {
	private int year;
	private double[] rainfallMonths;
	
	public RainfallYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public double calculateMeanRainfall() {
		if (this.rainfallMonths != null) {
			double total = 0.0;
			for (int i = 0; i <= 11; i++) {
				total += this.rainfallMonths[i];
			}
			return total/12.0;
		}
		else {
			return 0.0;
		}
	}
	
	public double calculateHighestRainfall() {
		if (this.rainfallMonths != null) {
			double highest = 0.0;
			for (int i = 0; i <= 11; i++) {
				if (this.rainfallMonths[i] >= highest) {
					highest = this.rainfallMonths[i];
				}
			}
			return highest;
		}
		else {
			return 0.0;
		}
	}
	
	public void enterData(double[] rainfall) {
		this.rainfallMonths = rainfall;
	}
	
	public double getRainfallMonth(String month) {
		if (this.rainfallMonths != null) {
			if (month == "JANUARY") {
				return this.rainfallMonths[0];
			}
			else if (month == "FEBRUARY") {
				return this.rainfallMonths[1];
			}
			else if (month == "MARCH") {
				return this.rainfallMonths[2];
			}
			else if (month == "APRIL") {
				return this.rainfallMonths[3];
			}
			else if (month == "MAY") {
				return this.rainfallMonths[4];
			}
			else if (month == "JUNE") {
				return this.rainfallMonths[5];
			}
			else if (month == "JULY") {
				return this.rainfallMonths[6];
			}
			else if (month == "AUGUST") {
				return this.rainfallMonths[7];
			}
			else if (month == "SEPTEMBER") {
				return this.rainfallMonths[8];
			}
			else if (month == "OCTOBER") {
				return this.rainfallMonths[9];
			}
			else if (month == "NOVEMBER") {
				return this.rainfallMonths[10];
			}
			else {
				return this.rainfallMonths[11];
			}
		}
		else {
			return 0;
		}
	}
}
