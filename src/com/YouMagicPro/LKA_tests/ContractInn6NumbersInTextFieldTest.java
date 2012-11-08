package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractInn6NumbersInTextFieldTest  extends TestBase{
	@Test
	public void contractInn6NumbersInTextFieldTest_C15029() {
	waitContractPageToLoad();
	
	sendKeysAndAssert("123456","ИНН должен состоять из 10 или 12 символов.");
	}
}
