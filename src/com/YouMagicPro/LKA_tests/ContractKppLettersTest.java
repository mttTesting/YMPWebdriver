package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractKppLettersTest extends TestBase{
	@Test
	public void contractKppTest_C15050() {
	waitContractPageToLoad();

	sendKeysAndAssert_kpp("asdfghjklq","КПП может содержать только цифры.");//вводим буквы в поле ввода КПП	
	}

}
