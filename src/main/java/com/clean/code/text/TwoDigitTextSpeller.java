package com.clean.code.text;

import static java.util.Arrays.asList;

import java.util.List;

public class TwoDigitTextSpeller extends SingleDigitTextSpeller{
	
	private final int INDEX_VALUE_10 = 10;
	private final String BLANK_SPACE_LITERAL = " ";
	private final List<String> tensText = asList("", "", "TWENTY");
	private final List<String> tenTillTwentyText = asList("TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN");
	
	public String getText(int number){
		return isBetween10and20(number) ?  tenTillTwentyText.get(number - 10) 
										: getTextForNumberGreaterThan20(number);
	}

	public boolean isBetween10and20(int number) {
		return number >= 10 && number < 20;
	}
	
	private String getTextForNumberGreaterThan20(int number) {
		int remainder = number % INDEX_VALUE_10;
		int multiplerOfTen = number / INDEX_VALUE_10;
		
		return isMultipleOfTen(remainder) ? tensText.get(multiplerOfTen) 
				                          : tensText.get(multiplerOfTen) 
				                            + BLANK_SPACE_LITERAL 
				                            + super.getText(remainder);
	}

	public boolean isMultipleOfTen(int remainder) {
		return remainder == 0;
	}
}
	