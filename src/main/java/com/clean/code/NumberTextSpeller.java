package com.clean.code;

import com.clean.code.text.SingleDigitTextSpeller;

public class NumberTextSpeller {
	
	private SingleDigitTextSpeller singleDigitSpeller;
	
	public NumberTextSpeller(){
		singleDigitSpeller = new SingleDigitTextSpeller();
	}
	
	public String getText(int inputNumber) {
		if(inputNumber == 10){
			return "TEN";
		}
		return singleDigitSpeller.getText(inputNumber);
	}
}
