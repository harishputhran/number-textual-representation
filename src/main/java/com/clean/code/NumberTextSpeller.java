package com.clean.code;

import java.util.HashMap;
import java.util.Map;

public class NumberTextSpeller {
	
	private Map<Integer, String> numberToText;
	
	public NumberTextSpeller(){
		numberToText = new HashMap<>();
		numberToText.put(0, "ZERO");
		numberToText.put(1, "ONE");
		numberToText.put(9, "NINE");
	}

	public String getText(int inputNumber) {
		return numberToText.get(inputNumber);		
	}
}
