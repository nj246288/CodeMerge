package pojo;

import java.util.List;

public class Completejourney {
 
	private String currentStep;
	private List<Journey> journey;
	
	
	
	
	public String getCurrentStep() {
		return currentStep;
	}
	public void setCurrentStep(String currentStep) {
		this.currentStep = currentStep;
	}
	public List<Journey> getJourney() {
		return journey;
	}
	public void setJourney(List<Journey> journey) {
		this.journey = journey;
	}
	}
