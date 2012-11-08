package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBankAccountLettersAndNumbersTest extends TestBase{
	@Test
	public void contractBankAccountLettersAndNumbersTest_C14496() {
		waitContractPageToLoad();

		sendKeysAndAssert("abcdefgh12345", "Номер банковского счета может содержать только цифры.");//Ввод букв и цифр в поле ввода банковского счета
	}

}
