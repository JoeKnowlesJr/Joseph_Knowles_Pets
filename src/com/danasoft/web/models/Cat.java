package com.danasoft.web.models;

import java.util.Locale;

public class Cat extends Animal implements Pet {

	public Cat(String n, String b, int w) {
		super(n, b, w);
	}

	@Override
	public String showAffection() {
		return String.format(Locale.getDefault(), "Your %s cat, %s, looked at you with some affection.  You think.",
				this.getBreed(), 
				this.getName());
	}
}
