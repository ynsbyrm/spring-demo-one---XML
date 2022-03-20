package com.yunusemre.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach", Coach.class);
		//call methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		
		// let's call new method
		System.out.println(myCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
