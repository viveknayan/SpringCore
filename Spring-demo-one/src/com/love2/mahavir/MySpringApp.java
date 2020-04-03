package com.love2.mahavir;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load the spring configuration file
		ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("application.xml");
		//retrieve the bean from spring container
		Coach a=(Coach)ap.getBean("cricketCoach");
		
		//Coach a1=ap.getBean("myTest", Coach.class);
		//call method on the bean
		System.out.println(a.getDailyWorkOut());
		//this is for constructor injection object
		System.out.println(a.getFortune());
		//This one is for passing the value in xml and retrieving here 
		System.out.println(a.getEmail());
		System.out.println(a.getTeam());
		
		
	
		
	}

}
