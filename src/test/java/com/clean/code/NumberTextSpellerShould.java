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
	
	@Test
	public void return_thirty_nine_for_input_number_39(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("THIRTY NINE", numberTextSeller.getText(39));
	}
	
	@Test
	public void return_one_hundred_thirty_nine_for_input_number_139(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("ONE HUNDRED THIRTY NINE", numberTextSeller.getText(139));
	}
	
	@Test
	public void return_nine_hundred_eighty_seven_for_input_number_987(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("NINE HUNDRED EIGHTY SEVEN", numberTextSeller.getText(987));
	}
	
	@Test
	public void return_nine_thousand_eight_hundred_seventy_for_input_number_9870(){
		NumberTextSpeller numberTextSeller = new NumberTextSpeller();
		assertEquals("NINE THOUSAND EIGHT HUNDRED SEVENTY", numberTextSeller.getText(9870));
	}
}
