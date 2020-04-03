//In Annotation we have to define the entire packages name in xml file it will scan and add @component annotation to indentify the 
//bean id. if we did not mention the bean id then by default it will take class name with lowecase    
package com.mahavir.AnnotationExplicitly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationExplicitlyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap=new ClassPathXmlApplicationContext("application.xml");
		TennisCoach tc=(TennisCoach) ap.getBean("myId");
		System.out.println(tc.getDailyWorkOut());
		
	}

}
