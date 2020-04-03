package com.mahavir.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahavir.setterInjection.TenisCoach;

public class SetterInjectionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationForSetterInjection.xml");
		TenisCoach tc=(TenisCoach) context.getBean("myId");
		System.out.println(tc.getDailyFortune());
		System.out.println(tc.getDailyWorkOut());

	}

}
