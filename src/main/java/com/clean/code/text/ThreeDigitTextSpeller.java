package com.clean.code.text;

public class ThreeDigitTextSpeller extends TwoDigitTextSpeller {
	
	private final String TEXT_PREFIX = "HUNDRED";
	
	public String getText(int number){		
		int remainder = number % 100;
		int multiplierOf100 = number / 100;
		return generateText(super.getText(multiplierOf100), TEXT_PREFIX, super.getText(remainder));	
	}
}
