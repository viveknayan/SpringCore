package com.mahavir.constructorInjection;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your luckey day";
	}

}
