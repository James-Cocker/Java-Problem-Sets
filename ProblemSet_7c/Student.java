package ProblemSet_7c;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private String urn;
	private List<Module> moduleList;
	
	public Student(String name, String urn) {
		String regexName = "[A-Z][a-z]+[ ][A-Z][a-z]+";
		String regexUrn = "[0-9]{5}";
		
		if(name.matches(regexName)) {
			this.name = name;
			if (urn.matches(regexUrn)) {
				this.urn = urn;
			}
			else {
				this.urn = "00000";
			}
			this.moduleList = new ArrayList<Module>();
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getUrn() {
		return Integer.parseInt(this.urn);
	}
	
	public void addModuleList(Module m) {
		String mName = m.getName();
		boolean found = false;
		for (int i = 0; i < this.moduleList.size(); i++) {
			if (this.moduleList.get(i).getName() == mName) {
				found = true;
				break;
			}
		}
		if(!found) {
			this.moduleList.add(m);
		}
	}
	
	public String printModules() {
		String output = "";
		for (int i = 0; i < this.moduleList.size(); i++) {
			if (this.moduleList.get(i) != null) {
				output += this.moduleList.get(i).getName() + ", ";
			}
		}
		if(output.length() > 0) {
			return output.substring(0, output.length()-2);
		}
		else {
			return "";
		}
	}
	
	public String toString() {
		return this.name + "(" + this.urn + ")";
	}
}
