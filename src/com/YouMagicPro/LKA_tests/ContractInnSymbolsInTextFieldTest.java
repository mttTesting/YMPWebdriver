package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractInnSymbolsInTextFieldTest  extends TestBase{
	@Test
	public void contractInnLettersInTextFieldTest_C15030() {
	waitContractPageToLoad();
	
	sendKeysAndAssert(";:?*()_+=@#$%^&","ИНН должен состоять из 10 или 12 символов.");
	}
}
