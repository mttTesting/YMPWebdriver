package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractCorAccountOneInTextFieldTest  extends TestBase{
	@Test
	public void contractCorAccountOneInTextFieldTest_C14499() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_cor("1", "Количество цифр в Корр.счет должно быть 19-20.");//Ввод единицы в поле ввода Кор. счета
	}
}
