package com.love2.mahavir;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("application.xml");
		CricketCoach c=(CricketCoach) ap.getBean("cricketCoach");
		System.out.println(c.getEmail());
		System.out.println(c.getTeam());

	}

}
