package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractOgrnSymbolsTest  extends TestBase{
	@Test
	public void contractFillBankAccountTest() {
	waitContractPageToLoad();

	sendKeysAndAssert_ogrn("!;:?*()_+=@#$%^&","ОГРН может содержать только цифры.");//вводим символы и цифры в поле ввода ОГРН
	
	}

}
