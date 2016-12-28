package com.clean.code.text;

import static java.util.Arrays.asList;

import java.util.List;

public class TwoDigitTextSpeller extends SingleDigitTextSpeller{
	
	private final String EMPTY_TEXT = "";
	private final List<String> TEN_TO_TWENTY_TEXT = asList("TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", "FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINETEEN");
	
	public String getText(int number){
		return isNumberBetween10and20(number) ?  TEN_TO_TWENTY_TEXT.get(number - 10) : EMPTY_TEXT;
	}

	public boolean isNumberBetween10and20(int number) {
		return number >= 10 && number < 20;
	}	
}
	