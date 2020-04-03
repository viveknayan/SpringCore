//in xml if scope is prototype then if we will create two bean object then both will be different we checked it.
package com.mahavir.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeTestForPrototypeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextForPrototype.xml");

         BeanScopeTest bp=(BeanScopeTest) context.getBean("myId");
		
		 BeanScopeTest bp2=(BeanScopeTest) context.getBean("myId");
		 
		     boolean b=(bp==bp2);
			System.out.println("\nIs Both object Are Same ?"+b);//false
			
			System.out.println("Address of first bean :"+bp);//Address of first bean :com.mahavir.beanScope.BeanScopeTest@@22f71333
			
			System.out.println("Address of first bean :"+bp2);//Address of first bean :com.mahavir.beanScope.BeanScopeTest@1a407d53

		
		
	}

}
