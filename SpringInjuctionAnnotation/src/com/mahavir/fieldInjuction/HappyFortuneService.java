package com.mahavir.fieldInjuction;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your luckey day";
	}

}
