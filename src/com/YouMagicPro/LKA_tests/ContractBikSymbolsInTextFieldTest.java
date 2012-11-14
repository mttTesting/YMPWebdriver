package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBikSymbolsInTextFieldTest  extends TestBase{
	@Test
	public void contractBikSymbolsInTextFieldTest_C15026() {
	waitContractPageToLoad();
	
	sendKeysAndAssert_bik("!;:?*()_+=@#$%^&", "БИК может содержать только цифры.");//Ввод букв и цифр в поле ввода БИК
	}
}
