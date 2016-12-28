package com.clean.code.text;

public class ThreeDigitTextSpeller extends TwoDigitTextSpeller {
	
	private final String EMPTY_LITERAL = "";
	private final String HUNDRED_TEXT = "HUNDRED";
	private final int INDEX_VALUE = 100;
	
	public String getText(int number){
		String textForHundredthIndex = super.getText(getDigitAtHighestDecimalIndex(number, INDEX_VALUE));
		String textToAdd = textForHundredthIndex.trim().isEmpty() ? EMPTY_LITERAL : HUNDRED_TEXT;
		return generateText(
				textForHundredthIndex, textToAdd, 
								super.getText(getRemainingDigits(number, INDEX_VALUE)));	
	}
}
