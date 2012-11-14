package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractKppSymbolsTest extends TestBase{
	@Test
	public void contractKppTest_C15051() {
	waitContractPageToLoad();

	sendKeysAndAssert_kpp("!;:?*()_+=@#$%^&","КПП может содержать только цифры.");//вводим символы и цифры в поле ввода КПП	
	}

}
