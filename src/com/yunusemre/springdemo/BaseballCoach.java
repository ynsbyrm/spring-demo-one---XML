package com.yunusemre.springdemo;

public class BaseballCoach implements Coach{
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
