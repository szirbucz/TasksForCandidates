package com.kodekonveyor.fourth;

public class Company {
	
	private DeveloperTeam developerTeam;
	private HRTeam hrTeam;
	
	public DeveloperTeam getDeveloperTeam() {
		return developerTeam;
	}
	
	public void setDeveloperTeam(DeveloperTeam developerTeam) {
		this.developerTeam = developerTeam;
	}
	
	public HRTeam getHrTeam() {
		return hrTeam;
	}
	
	public void setHrTeam(HRTeam hrTeam) {
		this.hrTeam = hrTeam;
	}
}
