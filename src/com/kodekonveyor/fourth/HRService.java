package com.kodekonveyor.fourth;

import java.util.List;

public class HRService {

	public List<Person> getLeadersOfCompany(final Company company) {
		return List.of(company.getDeveloperTeam().getLeadDeveloper(),
				company.getHrTeam().getHrLead());
	}
}
