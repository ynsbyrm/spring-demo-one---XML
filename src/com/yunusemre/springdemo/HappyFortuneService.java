package com.yunusemre.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortunes= {
			"Today is your lucky day",
			"You're shining like a diamond :)",
			"Be aware of decide anything :("
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		return fortunes[index];
	}

}
