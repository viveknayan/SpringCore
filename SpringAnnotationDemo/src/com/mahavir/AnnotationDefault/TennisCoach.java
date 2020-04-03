package com.mahavir.AnnotationDefault;

import org.springframework.stereotype.Component;
//Here myId is just like bean id
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice your left side";
	}

}
