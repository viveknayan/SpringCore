package com.mahavir.datausingproperties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		CricketPojo cp=(CricketPojo) context.getBean("cricket");
		System.out.println(cp.getEmail());
		System.out.println(cp.getTeam());
		
		

	}

}
