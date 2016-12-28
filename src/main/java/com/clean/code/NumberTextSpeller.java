package com.clean.code;

import com.clean.code.text.SingleDigitTextSpeller;

public class NumberTextSpeller {
	
	private SingleDigitTextSpeller singleDigitSpeller;
	
	public NumberTextSpeller(){
		singleDigitSpeller = new SingleDigitTextSpeller();
	}
	
	public String getText(int inputNumber) {
		return inputNumber < 10 ? singleDigitSpeller.getText(inputNumber)
				                : getTextForTwoDigitNumber(inputNumber);
	}

	private String getTextForTwoDigitNumber(int inputNumber) {
		return inputNumber == 11 ? "ELEVEN" : "TEN";
	}
}
