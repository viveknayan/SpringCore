
//This one is for scope=singleton means if u decleared singleton then only one copy of object will create by default it's singleton 
//Here we created two bean object and i just checked it it is showing both are same object.
package com.mahavir.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		BeanScopeTest bp=(BeanScopeTest) context.getBean("myId");
		
		BeanScopeTest bp2=(BeanScopeTest) context.getBean("myId");
		
		System.out.println("Enter Value = "+bp.getA());
		System.out.print("Result = "+bp.fact());
		
		boolean b=(bp==bp2);
		System.out.println("\nIs Both object Are Same ?"+b);//true
		
		System.out.println("Address of first bean :"+bp);//Address of first bean :com.mahavir.beanScope.BeanScopeTest@1a407d53
		
		System.out.println("Address of first bean :"+bp2);//Address of first bean :com.mahavir.beanScope.BeanScopeTest@1a407d53


	}

}
