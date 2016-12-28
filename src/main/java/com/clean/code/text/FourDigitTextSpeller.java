package com.clean.code.text;

public class FourDigitTextSpeller extends ThreeDigitTextSpeller {
	
	private final String TEXT_PREFIX = "THOUSAND";
	
	public String getText(int number){		
		int remainder = number % 1000;
		int multiplier = number / 1000;
		return generateText(singleDigitNumbersText.get(multiplier), 
							TEXT_PREFIX, 
							super.getText(remainder));		
	}
}
