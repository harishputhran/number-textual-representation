package com.clean.code;

import java.util.HashMap;
import java.util.Map;

public class NumberTextSpeller {

	public String getText(int inputNumber) {
		Map<Integer, String> numberToText = new HashMap<>();
		numberToText.put(0, "ZERO");
		numberToText.put(1, "ONE");
		numberToText.put(9, "NINE");
		return numberToText.get(inputNumber);		
	}
}
