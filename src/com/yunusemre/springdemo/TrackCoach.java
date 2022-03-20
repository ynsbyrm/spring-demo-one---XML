package com.yunusemre.springdemo;

public class TrackCoach implements Coach {
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanUpStuff() {
		System.out.println("TracCoach: Inside method doMyCleanUpStuff");
	}
}
