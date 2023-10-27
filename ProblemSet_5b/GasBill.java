package ProblemSet_5b;

public class GasBill {
	private String accountNumber;
	private double amount;
	private Customer customer;
	
	public GasBill(String accountNumber, double amount, Customer customer) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.customer = customer;
	}
	
	public String getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getCustomer() {
		return this.customer.getName() + ". " + this.customer.getSurname();
	}
	
	public boolean isStringInt(String s)
	{
	    try
	    {
	        Integer.parseInt(s);
	        return true;
	    }
	    catch (NumberFormatException ex){return false;}
	}
	
	public boolean checkAccountAccuracy(String accountNumber) {	
		if (accountNumber.length() == 15 &&
				accountNumber.indexOf("G") == 0 && 
				accountNumber.indexOf("-") == 5 && 
				accountNumber.indexOf("-", 6) == 10 && 
				isStringInt(accountNumber.substring(1,5)) &&
				isStringInt(accountNumber.substring(6,10)) && 
				isStringInt(accountNumber.substring(11,15))) {
			return true;
		}
		else {
			return false;
		}
	}

	public String displayAccountDetails() {
		int decimalPlaces = Double.toString(this.amount).length() - Double.toString(this.amount).indexOf('.') - 1;
		String extraZero = "";
		if (decimalPlaces == 1) {
			extraZero = "0";
		}
		if (!checkAccountAccuracy(this.accountNumber)){
			this.accountNumber = "Invalid Account";
		}

		return "Gas Bill\n Account Number:" + this.accountNumber + "\n Customer:" + this.customer.getName() + ". " + this.customer.getSurname() + "\n" + " Amount due:£" + this.amount + extraZero;
		
	}
	
	public String displayAmountDue() {
		int decimalPlaces = Double.toString(this.amount).length() - Double.toString(this.amount).indexOf('.') - 1;
		String extraZero = "";
		if (decimalPlaces == 1) {
			extraZero = "0";
		}
		return "Amount due:£" + this.amount + extraZero;
	}
}
