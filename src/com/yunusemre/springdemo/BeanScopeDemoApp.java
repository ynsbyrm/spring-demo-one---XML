package com.yunusemre.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		// retrieve bean from spring container
		Coach firstCoach = context.getBean("myCoach", Coach.class);
		Coach secondCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (firstCoach == secondCoach);
		System.out.println("Are they same: " + result);
		System.out.println("Memory Location for first:" + firstCoach);
		System.out.println("Memory Location for second:" + secondCoach);
		
		context.close();
	}

}
