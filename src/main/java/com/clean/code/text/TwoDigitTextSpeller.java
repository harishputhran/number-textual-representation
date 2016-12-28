package com.clean.code.text;

import static java.util.Arrays.asList;

import java.util.List;

public class TwoDigitTextSpeller extends SingleDigitTextSpeller{
	
	private final int INDEX_VALUE_10 = 10;
	private final String BLANK_SPACE_LITERAL = " ";
	
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
		
		return isMultipleOfTen(remainder) ? tensText.get(multiplerOfTen) 
				                          : generateText(remainder, multiplerOfTen);
	}

	protected String generateText(int remainder, int multiplerOfTen) {
		StringBuilder builder = new StringBuilder();
		builder.append(tensText.get(multiplerOfTen));
		builder.append(BLANK_SPACE_LITERAL);
		builder.append(super.getText(remainder));
		return builder.toString().trim();
	}

	protected boolean isMultipleOfTen(int remainder) {
		return remainder == 0;
	}
}
	