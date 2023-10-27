package ProblemSet_4a;

public class Session {
	private String sessionName;
	private int startTime;
	private int endTime;
	
	public Session(String newSessionName, int newStartTime, int newEndTime) {
		sessionName = newSessionName;
		startTime = newStartTime;
		endTime = newEndTime;
	}
	
	public String getSessionName() {
		return sessionName;
	}
	
	public void setSessionName(String newSessionName) {
		sessionName = newSessionName;
	}
	
	public int getStartTime() {
		return startTime;
	}
	
	public void setStartTime(int newStartTime) {
		startTime = newStartTime;
	}
	
	public int getEndTime() {
		return endTime;
	}
	
	public void setEndTime(int newEndTime) {
		endTime = newEndTime;
	}
	
	public String toString() {
		return sessionName + ": " + startTime + " - " + endTime + "\n";
	}
}
