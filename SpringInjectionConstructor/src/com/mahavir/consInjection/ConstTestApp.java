package com.mahavir.consInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		ConsTest ct=(ConsTest) context.getBean("myId");
		System.out.println("Your Name : "+ct.getName()+"\nYour age :"+ct.getAge()+"\nAddress :"+ct.getAdd());

	}

}
