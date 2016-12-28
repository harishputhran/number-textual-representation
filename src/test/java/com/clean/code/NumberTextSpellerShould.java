package com.clean.code;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberTextSpellerShould {

	@Test
	public void return_zero_for_input_number_0(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("ZERO", numberTextSeller.getText(0));
	}
	
	@Test
	public void return_one_for_input_number_1(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("ONE", numberTextSeller.getText(1));
	}
	
	@Test
	public void return_nine_for_input_number_9(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("NINE", numberTextSeller.getText(9));
	}
	
	@Test
	public void return_ten_for_input_number_10(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("TEN", numberTextSeller.getText(10));
	}
	
	@Test
	public void return_eleven_for_input_number_11(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("ELEVEN", numberTextSeller.getText(11));
	}
	
	@Test
	public void return_twenty_for_input_number_20(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("TWENTY", numberTextSeller.getText(20));
	}
}
