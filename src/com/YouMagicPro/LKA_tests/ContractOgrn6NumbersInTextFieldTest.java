package com.YouMagicPro.LKA_tests;


import org.testng.annotations.Test;

public class ContractOgrn6NumbersInTextFieldTest  extends TestBase{
	@Test
	public void contractOgrn6NumbersInTextFieldTest_C15055() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_ogrn("123456","Количество цифр в ОГРН должно быть от 13 до 15.");//вводим 1 в поле ввода ОГРН	
	}

}
