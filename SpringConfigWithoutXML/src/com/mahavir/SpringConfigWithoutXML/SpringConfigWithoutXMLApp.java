package com.mahavir.SpringConfigWithoutXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringConfigWithoutXMLApp {

	public static void main(String[] args) {

	   ApplicationContext context=new AnnotationConfigApplicationContext(SportConfiguration.class);
		SwimCoach sc=(SwimCoach) context.getBean("swimCoach");
		System.out.println(sc.getDailyWorkOut());
		System.out.println(sc.getDailyFortune());
		
	}

}
