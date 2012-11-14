package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractOgrnOneNumberInTextFieldTest  extends TestBase{
	@Test
	public void contractOgrnOneNumberInTextFieldTest_C15053() {
	waitContractPageToLoad();

	sendKeysAndAssert_ogrn("1","Количество цифр в ОГРН должно быть от 13 до 15.");//вводим 1 в поле ввода ОГРН
	}

}
