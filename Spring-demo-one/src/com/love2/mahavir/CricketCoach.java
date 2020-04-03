package com.love2.mahavir;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public CricketCoach()
	{
		System.out.println("Inside constructor");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Setter method in cricket coach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice Fast Bowling for 15 min";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
