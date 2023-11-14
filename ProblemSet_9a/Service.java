package ProblemSet_9a;

public class Service {
	private String code;
	private String name;
	private VATRate rate;

	public Service(String code, String name, VATRate rate) {
		String regex = "[A-Z]{4}[0-9]{5}";
		if (name != null && rate != null) {
			if (code.matches(regex)) {
				this.code = code;
				this.name = name;
				this.rate = rate;
			} else {
				throw new IllegalArgumentException();
			}
		} else {
			throw new NullPointerException();
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
