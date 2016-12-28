package com.clean.code.text;

import static java.util.Arrays.asList;

import java.util.List;

import com.clean.code.TextSpeller;

public class SingleDigitTextSpeller implements TextSpeller{
	
	private final List<String> singleDigitNumbersText = asList("","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE");
	
	public String getText(int number){
		return number == 0 ? "ZERO" : singleDigitNumbersText.get(number);
	}
}
