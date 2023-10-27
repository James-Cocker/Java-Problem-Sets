package ProblemSet_4a;

public class Day {
	private String name;
	private Session[] sessions;
	
	public Day(String newName) {
		name = newName;
		this.sessions = new Session[4];
	}
	
	public String getName() {
		return name;
	}
	
	public Session getSessions(int sessionNum) {
		return this.sessions[sessionNum];
	}
	
	public void setSession(int index, String moduleName, int startTime, int endTime) {
		if (index >= 0 && index <= 3) {		// Validate index
			this.sessions[index] = new Session(moduleName, startTime, endTime);
		}
	}
	
	public String toString() {
		String totalString = "";
		for (int i = 0; i <= 3; i++) {
			if (this.sessions[i] != null) {
				totalString += this.sessions[i].toString();
			}
		}
		return totalString;
	}
	
	public void display() {
		System.out.println(toString());
	}
}
