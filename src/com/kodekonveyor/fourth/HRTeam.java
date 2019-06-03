package com.kodekonveyor.fourth;

import java.util.List;

public class HRTeam implements Team {

	private Person hrLead;
	private List<Person> team;
	
	public Person getHrLead() {
		return hrLead;
	}
	
	public void setHrLead(Person hrLead) {
		this.hrLead = hrLead;
	}
	
	public List<Person> getTeam() {
		return team;
	}
	
	public void setTeam(List<Person> team) {
		this.team = team;
	}
}
