package com.clean.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTextSpellerShould {

	@Test
	public void return_zero_for_input_number_0(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("ZERO", numberTextSeller.getText(0));
	}
}
