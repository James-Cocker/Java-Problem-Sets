package ProblemSet_7c;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTracker {
	private List<Student> studentList;
	private Map<Integer, Student> moduleList;
	
	public StudentTracker() {
		this.studentList = new ArrayList<Student>();
		this.moduleList = new HashMap<Integer, Student>();
	}
	
	public void addStudent(Student s, List<Module> mList) {
		if(s != null && mList != null) {
			for (int i = 0; i < mList.size(); i++) {
				s.addModuleList(mList.get(i));
			}
			studentList.add(s);
		}
		else {
			throw new NullPointerException();
		}
	}
	
	private void initialiseMap() {
		for (Student s: this.studentList) {
			this.moduleList.put(s.getUrn(), s);
		}
	}
	
	public String printStudents() {
		StringBuilder output = new StringBuilder();
		
		for(int i = 0; i < this.studentList.size(); i++) {
			output.append(this.studentList.get(i).toString() + "\n");
		}
		
		return output.toString();
	}
	
	public String printModules(int urn) {
		initialiseMap();
		return "URN " + urn + " is enrolled in:\n" + this.moduleList.get(urn).printModules();
	}
}
