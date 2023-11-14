package ProblemSet_9c;

public class Service {
	private String code;
	private String name;
	private VATRate rate;

	public Service(String code, String name, VATRate rate) {
		String regex = "[a-zA-z]{4}[0-9]{5}";
		if (code.matches(regex) && name != null && rate != null) {
			this.code = code;
			this.name = name;
			this.rate = rate;
		}
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public VATRate getRate() {
		return rate;
	}
}
