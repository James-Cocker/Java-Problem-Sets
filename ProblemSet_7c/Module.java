package ProblemSet_7c;

public class Module {
	private String name;
	
	public Module(String name) {
		String regex = "^COM\\d{4}$";
		if(name.matches(regex)) {
			this.name = name;
		}
		else {
			this.name = "Error";
		}
	}
	
	public String getName() {
		return this.name;
	}
}
