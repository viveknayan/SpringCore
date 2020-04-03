package com.mahavir.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjuctionApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		TenisCoach tc=(TenisCoach) context.getBean("tenisCoach");
		System.out.println(tc.getDailyFortune());
		System.out.println(tc.getDailyWorkOut());
		

	}

}
