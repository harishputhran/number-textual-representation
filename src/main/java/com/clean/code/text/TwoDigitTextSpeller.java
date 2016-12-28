package com.clean.code.text;

import static java.util.Arrays.asList;

import java.util.List;

public class TwoDigitTextSpeller extends SingleDigitTextSpeller{
	
	private final int INDEX_VALUE_10 = 10;
	protected final String BLANK_SPACE_LITERAL = " ";
	
	// First 2 entries are left blank to facilitate easy fetch for numbers from 20.
	private final List<String> tensText = asList("", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINETY");
	private final List<String> tenTillTwentyText = asList("TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN");
	
	public String getText(int number){
		return isBetween10and20(number) ?  tenTillTwentyText.get(number - 10) 
										: getTextForNumberGreaterThan20(number);
	}

	protected boolean isBetween10and20(int number) {
		return number >= 10 && number < 20;
	}
	
	protected String getTextForNumberGreaterThan20(int number) {
		int remainder = number % INDEX_VALUE_10;
		int multiplerOfTen = number / INDEX_VALUE_10;
		
		return isMultiple(remainder) ? tensText.get(multiplerOfTen) 
				                          : generateText(tensText.get(multiplerOfTen), super.getText(remainder));
	}

	protected boolean isMultiple(int remainder) {
		return remainder == 0;
	}
	
	protected String generateText(String... texts) {
		StringBuilder builder = new StringBuilder();
		for(String text : texts){
			builder.append(text);
			builder.append(BLANK_SPACE_LITERAL);
		}		
		return builder.toString().trim();
	}
}
	