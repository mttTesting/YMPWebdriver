package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractInnOneInTextFieldTest  extends TestBase{
	@Test
	public void contractInnOneInTextFieldTest_C15028() {
	waitContractPageToLoad();
	
	sendKeysAndAssert("1","ИНН должен состоять из 10 или 12 символов.");
	}
}
