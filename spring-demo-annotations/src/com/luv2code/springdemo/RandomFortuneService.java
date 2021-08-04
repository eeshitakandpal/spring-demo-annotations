package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	//create an array of string
	private String[] data = {
			"Beware of wolf in sheeps's clothing",
			"Diligence is the mother of goof luck",
			"The journey is the reward"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		//pick a random string from the arrray
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
