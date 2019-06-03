package com.kodekonveyor.fourth;

import java.util.List;

public class DeveloperTeam implements Team{
	
	private Person leadDeveloper;
	private List<Person> members;
	
	public Person getLeadDeveloper() {
		return leadDeveloper;
	}
	public void setLeadDeveloper(Person leadDeveloper) {
		this.leadDeveloper = leadDeveloper;
	}
	public List<Person> getMembers() {
		return members;
	}
	public void setMembers(List<Person> members) {
		this.members = members;
	}
	
	
}
