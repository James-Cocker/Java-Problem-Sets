package ProblemSet_8c;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PersonTracker {
	private List<Person> peopleList;
	
	public PersonTracker() {
		peopleList = new ArrayList<Person>();
	}
	
	public String readTextFile(String fileName) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			String output = "";
			while (line != null) {
				output += line + "\n";
				breakLine(line);
				line = reader.readLine();
			}
			reader.close();
			return output;
		}
		catch (Exception e){
			if(fileName == null) {
				throw new NullPointerException();
			}
			else {
				throw new IllegalArgumentException();
			}
		}
	}
	
	public void addPerson(String n, String s, int a) {
		peopleList.add(new Person(n,s,a));
	}
	
	public String displayList() {
		StringBuilder sb = new StringBuilder();
		for(Person p : peopleList) {
			sb.append(p.toString()+"\n");
		}
		return sb.toString();
	}
	
	private void breakLine(String line) {
		String[] arr = line.split(" ");
		addPerson(arr[0], arr[1], Integer.parseInt(arr[2]));
	}
	
	public String getPeopleList() {
		StringBuilder sb = new StringBuilder();
		for(Person p : peopleList) {
			sb.append(p.toString() + ", ");
		}
		try {
			return "[" + sb.toString().substring(0, sb.length()-2) + "]";
		}
		catch (Exception e){
			return "[]";
		}
	}
}
