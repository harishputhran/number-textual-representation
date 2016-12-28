package com.clean.code;

import java.util.HashMap;
import java.util.Map;

import com.clean.code.text.SingleDigitTextSpeller;
import com.clean.code.text.TwoDigitTextSpeller;

public class TextSpellerFactory {
	
	Map<Integer, TextSpeller> digitToTextSpeller;
	
	public TextSpellerFactory() {
		digitToTextSpeller = new HashMap<>();
		digitToTextSpeller.put(1, new SingleDigitTextSpeller());
		digitToTextSpeller.put(2, new TwoDigitTextSpeller());
	}
	
	public TextSpeller getTextSpeller(int number){		
		String numberAsText =  String.valueOf(number);
		return digitToTextSpeller.get(numberAsText.length());
	}
}
