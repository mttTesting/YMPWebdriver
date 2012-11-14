package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractCorAccountLettersAndNumbersTextFieldTest  extends TestBase{
	@Test
	public void contractCorAccountTenInTextFieldTest_C15000() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_cor("1234sd7sdsd", "Корр.счет может содержать только цифры.");//Ввод 10ти цифр в поле ввода Кор. счета
	}
}
