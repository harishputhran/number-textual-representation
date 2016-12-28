package com.clean.code;

import com.clean.code.text.SingleDigitTextSpeller;

public class NumberTextSpeller {
	
	private SingleDigitTextSpeller singleDigitSpeller;
	
	public NumberTextSpeller(){
		singleDigitSpeller = new SingleDigitTextSpeller();
	}
	
	public String getText(int inputNumber) {
		return inputNumber == 10 ? "TEN": singleDigitSpeller.getText(inputNumber);
	}
}
