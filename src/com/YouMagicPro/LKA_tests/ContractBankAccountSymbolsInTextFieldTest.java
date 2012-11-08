package com.YouMagicPro.LKA_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ContractBankAccountSymbolsInTextFieldTest extends TestBase{
	@Test
	public void contractBankAccountSymbolsInTextFieldTest_C14997() {
		waitContractPageToLoad();

		sendKeysAndAssert("!;:?*()_+=@#$%^&", "Номер банковского счета может содержать только цифры.");//Ввод симвволов поле ввода банковского счета
	}

}
