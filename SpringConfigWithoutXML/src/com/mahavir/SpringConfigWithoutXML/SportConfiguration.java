//this class contain all the configuration details it is same like application.xml file
package com.mahavir.SpringConfigWithoutXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
@Configuration
@ComponentScan("com.mahavir.SpringConfigWithoutXML")

public class SportConfiguration {

	@Bean       //here bean is a just like bean in xml file and here bean id= method name you can give any method name
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();//here we are creating a bean object and passing to Constructor of Swim class same like constructor-config ref="id" 
	}
	
	@Bean
	public SwimCoach swimCoach()
	{
		return new SwimCoach(sadFortuneService());//here we are taking the ref.
	}
	

}
