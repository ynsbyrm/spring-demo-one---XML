package com.yunusemre.springdemo;

public class TaekwandoCoach implements Coach {
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public TaekwandoCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes for stretching";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
