package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractKppLettersAndNumbersTest extends TestBase{
	@Test
	public void contractKppTest_C15054() {
	waitContractPageToLoad();

	sendKeysAndAssert_kpp("as123454jklq","КПП может содержать только цифры.");//вводим буквы и цифры в поле ввода КПП
	}

}
