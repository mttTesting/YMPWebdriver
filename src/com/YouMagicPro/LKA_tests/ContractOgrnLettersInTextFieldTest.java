package com.YouMagicPro.LKA_tests;


import org.testng.annotations.Test;

public class ContractOgrnLettersInTextFieldTest  extends TestBase{
	@Test
	public void contractOgrnLettersInTextFieldTest_C15056() {
	waitContractPageToLoad();

	sendKeysAndAssert_ogrn("asdfghjklq","ОГРН может содержать только цифры.");//вводим буквы в поле ввода ОГРН
	}

}
