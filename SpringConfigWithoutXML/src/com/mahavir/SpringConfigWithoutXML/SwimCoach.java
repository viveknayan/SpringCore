package com.mahavir.SpringConfigWithoutXML;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Swim atleast 1000 meter daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
