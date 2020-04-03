package com.mahavir.fieldInjuction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach {

	
	@Autowired
	private FortuneService fortuneService;
	

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Improve your running...speed..";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
