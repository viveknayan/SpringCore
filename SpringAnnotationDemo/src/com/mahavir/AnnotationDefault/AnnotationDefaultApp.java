package com.mahavir.AnnotationDefault;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDefaultApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationForDefault.xml");
		TennisCoach tc=(TennisCoach) ap.getBean("tennisCoach");//here tennisCoach is came by default if u will not mention then it will take default
		System.out.println(tc.getDailyWorkOut());

	}

}
