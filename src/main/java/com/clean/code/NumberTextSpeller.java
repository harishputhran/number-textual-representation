package com.clean.code;

import com.clean.code.text.SingleDigitTextSpeller;
import com.clean.code.text.TwoDigitTextSpeller;

public class NumberTextSpeller {
	
	private SingleDigitTextSpeller singleDigitSpeller;
	
	private TwoDigitTextSpeller twoDigitSpeller;
	
	public NumberTextSpeller(){
		singleDigitSpeller = new SingleDigitTextSpeller();
		twoDigitSpeller = new TwoDigitTextSpeller();
	}
	
	public String getText(int inputNumber) {
		return inputNumber < 10 ? singleDigitSpeller.getText(inputNumber)
				                : twoDigitSpeller.getText(inputNumber);
	}
}
