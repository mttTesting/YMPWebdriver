package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractBikLettersAndNumbersInTextFieldTest   extends TestBase{
	@Test
	public void contractBikTest_C15025() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_bik("asdfgh121212", "БИК может содержать только цифры.");//Ввод букв и цифр в поле ввода БИК
	}
}
