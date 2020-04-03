package com.mahavir.SpringConfigWithoutXML;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is Your Sad Day";
	}

}
