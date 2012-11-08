package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractCorAccountTenInTextFieldTest  extends TestBase{
	@Test
	public void contractCorAccountTenInTextFieldTest_C15000() {
	waitContractPageToLoad();
	
	sendKeysAndAssert("1234567890", "Количество цифр в Корр.счет должно быть 19-20.");//Ввод 10ти цифр в поле ввода Кор. счета
	}
}
