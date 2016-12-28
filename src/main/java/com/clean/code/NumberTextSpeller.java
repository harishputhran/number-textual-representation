package com.clean.code;


public class NumberTextSpeller {	

	private TextSpellerFactory textSpellerFactory;
	
	public NumberTextSpeller(){
		textSpellerFactory = new TextSpellerFactory();
	}
	
	public String getText(int inputNumber) {
		return textSpellerFactory.getTextSpeller(inputNumber)
								 .getText(inputNumber);
	}
}
