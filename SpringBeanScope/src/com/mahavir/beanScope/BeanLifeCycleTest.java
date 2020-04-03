
//if u decleared init and destroy method in xml then first init method will called at the time of bean creation and lastly destroy will be called automatically 
package com.mahavir.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationForBeanLifeCycle.xml");
		BeanScopeTest bp=(BeanScopeTest) context.getBean("myId");
		
		System.out.println("Enter Value = "+bp.getA());
		System.out.print("Result = "+bp.fact());
		
		context.close();


	}

}
