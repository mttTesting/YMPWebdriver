package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractCorAccountSymbolsInTextFieldTest extends TestBase{
	@Test
	public void contractCorAccountSymbolsInTextFieldTest_C15003() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_cor("!;:?*()_+=@#$%^&", "Корр.счет может содержать только цифры.");//Ввод символов в поле ввода Кор. счета
	}
}
