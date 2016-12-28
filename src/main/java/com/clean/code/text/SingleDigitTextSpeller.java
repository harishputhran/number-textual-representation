package com.clean.code.text;

import static java.util.Arrays.asList;
import java.util.List;

public class SingleDigitTextSpeller {
	
	private List<String> textForNumberTill9 = asList("","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE");
	
	public String getText(int number){
		return number == 0 ? "ZERO" : textForNumberTill9.get(number);
	}
}