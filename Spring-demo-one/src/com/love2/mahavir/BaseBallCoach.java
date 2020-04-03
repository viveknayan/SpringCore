package com.love2.mahavir;

public class BaseBallCoach implements Coach {

	
	private FortuneService fortuneService;
	
	
	public BaseBallCoach(FortuneService fortuneService) {
	
		this.fortuneService = fortuneService;
	}

	public String  getDailyWorkOut()
	{
		return "playing 30 min";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}
}
