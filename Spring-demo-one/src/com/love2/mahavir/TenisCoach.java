package com.love2.mahavir;

public class TenisCoach implements Coach {
	
	private FortuneService fortuneService;
	

	
	public TenisCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	public String  getDailyWorkOut()
	{
		return "Do Hard Work";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() ;
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
