package com.YouMagicPro.LKA_tests;

import org.testng.annotations.Test;

public class ContractBik1inTextFieldTest  extends TestBase{
	@Test
	public void contractBikTest1inTextField_C15022() {
		waitContractPageToLoad();
		
		sendKeysAndAssert("1", "Количество цифр в БИК должно быть 9.");//Ввод единицы в поле ввода БИК
	}
}