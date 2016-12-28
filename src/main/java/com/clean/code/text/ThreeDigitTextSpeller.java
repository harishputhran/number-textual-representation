package com.clean.code.text;

public class ThreeDigitTextSpeller extends TwoDigitTextSpeller {
	
	private final String HUNDRED_TEXT = "HUNDRED";
	private final int INDEX_VALUE = 100;
	
	public String getText(int number){		
		return generateText(
				super.getText(getDigitAtHighestDecimalIndex(number, INDEX_VALUE)),
					HUNDRED_TEXT, super.getText(getRemainingDigits(number, INDEX_VALUE)));	
	}
}
