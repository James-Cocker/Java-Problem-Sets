package ProblemSet_6a;

public class Supplier {
	private String name;
	private String phone;
	
	public Supplier(String name, String phone) {
		
		/* Requirements: No Supplier object can be created without a name or phone number. No specific 
		 * validation is performed on the name, but the phone number must be a string 
		 * consisting of a 01483 which is the area code, and a dash (-) followed by 6 
		 * numbers (6 digits with no spaces) or the area code followed by 6 numbers 
		 * (6 digits with no spaces). If the phone number is invalid a Supplier object 
		 * cannot be created and an exception is thrown.
		 */
		String regex = "^01483-\\d{6}|01483\\d{6}$";
		
		if(phone.matches(regex)) {
			if(name != null && phone != null) {
				this.name = name;
				this.phone = phone;
			}
			else {
				throw new NullPointerException();
			}
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String toString() {
		if (this.phone.charAt(5) == '-') {
			return this.name + "(" + this.phone + ")";
		}
		else {
			return this.name + "(" + this.phone.substring(0,5) + "-" + this.phone.substring(5,this.phone.length()) + ")";
		}
	}
}
