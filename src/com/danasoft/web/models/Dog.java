package com.danasoft.web.models;

import java.util.Locale;

public class Dog extends Animal implements Pet {

	public Dog(String n, String b, int w) {
		super(n, b, w);
	}

	@Override
	public String showAffection() {
		return String.format(Locale.getDefault(),"%s %s",
				this.getName(), (this.getWeight() < 30) ? 
				"hopped into your lap, and cudled you!" : 
				"curled up next to you!");
	}

}
