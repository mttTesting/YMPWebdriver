package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractCorAccountLettersInTextFieldTest extends TestBase{
	@Test
	public void contractCorAccountLettersInTextFieldTest_C15001() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_cor("zxcvbnmasdafg", "Корр.счет может содержать только цифры.");//Ввод букв в поле ввода Кор. счета
	}
}
