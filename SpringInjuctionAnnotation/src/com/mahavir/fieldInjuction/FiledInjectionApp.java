package com.mahavir.fieldInjuction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FiledInjectionApp {

	public static void main(String[] args) {
	

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationForFieldInjection.xml");
		TenisCoach tc= (TenisCoach) context.getBean("tenisCoach");
		System.out.println(tc.getDailyFortune());
		System.out.println(tc.getDailyWorkOut());
		
	}

}
