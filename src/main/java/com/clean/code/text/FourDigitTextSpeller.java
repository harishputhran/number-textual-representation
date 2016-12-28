package com.clean.code.text;

public class FourDigitTextSpeller extends ThreeDigitTextSpeller {
	
	private final String THOUSAND_TEXT = "THOUSAND";
	private final int INDEX_VALUE = 1000;
	
	public String getText(int number){		
		return generateText(
				singleDigitNumbersText.get(getDigitAtHighestDecimalIndex(number, INDEX_VALUE)),
				THOUSAND_TEXT, super.getText(getRemainingDigits(number, INDEX_VALUE)));	
	}
}
