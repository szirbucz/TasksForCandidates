package com.kodekonveyor.first;

public class NameService {

	private PrintingService printingService;
	
	public NameService() {
		this.printingService = new PrintingService();
	}
	
	public String composeName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public void printName(String firstName, String lastName) {
		printingService.print(composeName(firstName, lastName));
	}
	
	public void printNameAccordingOrder(String firstName, String lastName, boolean westernOrder) {
		if (westernOrder) {
			printingService.print(composeName(firstName, lastName));
		} else {
			printingService.print(composeName(lastName, firstName));
		}
	}
}
